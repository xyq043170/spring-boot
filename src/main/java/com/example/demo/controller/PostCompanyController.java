package com.example.demo.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.PostCompany;
import com.example.demo.dao.PostCompanyDao;
import com.example.demo.entity.ProgressInfo;
import com.example.demo.mapper.PostCompanyMapper;
import com.example.demo.proxy.Account;
import com.example.demo.proxy.AccountCglibProxyFactory;
import com.example.demo.proxy.AccountImpl;
import com.example.demo.proxy.AccountProxy;
import com.example.demo.proxy.AccountProxyFactory;
import com.example.demo.proxy.Person;
import com.example.demo.service.PostCompanyService;
import com.example.demo.service.ProgressInfoService;

@RestController
@RequestMapping("/pc")
public class PostCompanyController {
	private static final Logger logger = LoggerFactory.getLogger(PostCompanyController.class);

    @Autowired
    private PostCompanyService postCompanyService;
    @Autowired
    private ProgressInfoService progressInfoService;
    @Autowired
    private PostCompanyDao postCompanyDao;
    @Autowired
    private PostCompanyMapper postCompanyMapper;
    
    @RequestMapping("/list")
    public List<com.example.demo.entity.PostCompany> getStus(){
        logger.info("从数据库读取PostCompany集合");
        return postCompanyService.getList();
    }
    
    @RequestMapping("/dataSource")
    public List<ProgressInfo> getDataSource(){
        logger.info("切换别的数据源读取数据");
		return progressInfoService.getList();
    }
    
    @RequestMapping("/dataSource2")
    public List<com.example.demo.entity.PostCompany> getDataSource2(){
        logger.info("切换别的数据源读取数据");
		return progressInfoService.getList2();
    }
    
    @RequestMapping("/dataSource3")
    public List<com.example.demo.dao.PostCompany> getDataSource3(){
        logger.info("切换别的数据源读取数据");
		return progressInfoService.getList3();
    }
    
    @RequestMapping("/jpa")
    public List<com.example.demo.entity.PostCompany> getJPA(){
    	logger.info("从数据库读取PostCompany集合jpa");
    	logger.info("更新的行数：" + postCompanyDao.updatePostCompanyById("韵达", 8));

        return postCompanyDao.getList();
    }
    
    @RequestMapping("/mybatis")
    public List<PostCompany> getMybatis(){
    	List<PostCompany> list =new ArrayList<PostCompany>();
    	logger.info("mybatis test");
    	PostCompany postCompany = postCompanyMapper.getById(8);
    	list.add(postCompany);
        return list;
    }
//    
//    @RequestMapping("/mybatis2")
//    public List<PostCompany> getMybatis2(){
//    	logger.info("mybatis test2");
//        return postCompanyMapper.likeName("韵达");
//    }
    
    @RequestMapping("/testProxy")
    public void testProxy(){
        logger.info("测试静态代理");
        Account account = new AccountImpl();
        AccountProxy proxy = new AccountProxy(account);
        proxy.queryAccount();
        proxy.updateAccount();
    }
    
    @RequestMapping("/testProxy2")
    public void testProxy2(){
        logger.info("测试动态代理");
        Account account1 = (Account) new AccountProxyFactory().bind(new AccountImpl());
        account1.queryAccount();
        boolean reuslt=account1.getAccount("越努力，越幸运！");
        System.out.println("reuslt="+reuslt);
    }
    
    @RequestMapping("/testProxy3")
    public void testProxy3(){
        logger.info("测试CGLIB动态代理");
        Account account1 = (Account) new AccountCglibProxyFactory().getInstance(new AccountImpl());
        account1.queryAccount();
        boolean reuslt=account1.getAccount("越努力，越幸运！");
        System.out.println("reuslt="+reuslt);
        
        Person person = (Person) new AccountCglibProxyFactory().getInstance(new Person());
        person.show();
    }
}
