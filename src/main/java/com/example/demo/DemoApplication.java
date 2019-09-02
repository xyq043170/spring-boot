package com.example.demo;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Profile;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import com.example.demo.datasource.DynamicDataSourceRegister;
import com.example.demo.servlet.MyServlet;

@SpringBootApplication
@ServletComponentScan	//servlet自动查找注解
@MapperScan(basePackages = "com.example.demo.mapper")	//mybatis自动查找mapper接口文件
@Import({DynamicDataSourceRegister.class}) // 注册动态多数据源
@EnableTransactionManagement // 启注解事务管理，等同于xml配置方式的 <tx:annotation-driven />
@EnableScheduling	//定时器
public class DemoApplication {	//implements TransactionManagementConfigurer
	/**
     * 使用代码注册Servlet（不需要@ServletComponentScan注解）
     *
     * @return
     * @author SHANHY
     * @create  2016年1月6日
     */
//    @Bean
//    public ServletRegistrationBean servletRegistrationBean() {
//        return new ServletRegistrationBean(new MyServlet(), "/xs/*");// ServletName默认值为首字母小写，即myServlet
//    }
//	@Bean
//    public ServletRegistrationBean MyServlet1(){
//              return new ServletRegistrationBean(new MyServlet(),"/myServlet/*");
//    }
//	@Bean  
//    @ConfigurationProperties(prefix="spring.datasource")  
//    public DataSource dataSource() {  
//        return new org.apache.tomcat.jdbc.pool.DataSource();  
//    }  
//	
//	@Bean  
//    public SqlSessionFactory sqlSessionFactoryBean() throws Exception {  
//  
//        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();  
//        sqlSessionFactoryBean.setDataSource(dataSource());  
//  
//        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();  
//  
//        sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/mapper/*.xml"));  
//  
//        return sqlSessionFactoryBean.getObject();  
//    } 
	
	//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>以下用于测试java类中的@Profile注解配置不同的环境<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	//接口定义
	public interface SendMessage {

	// 发送短信方法定义
	public void send();

	}

	//Dev 环境实现类
	@Component
	@Profile("dev")
	public class DevSendMessage implements SendMessage {

	@Override
	public void send() {
	   System.out.println(">>>>>>>>Dev Send()<<<<<<<<");
	}

	}

	//Stg环境实现类
	@Component
	@Profile("stg")
	public class StgSendMessage implements SendMessage {

	@Override
	public void send() {
	   System.out.println(">>>>>>>>Stg Send()<<<<<<<<");
	}

	}
	@Autowired
    private SendMessage sendMessage;

    @PostConstruct
    public void init(){
        sendMessage.send();// 会根据profile指定的环境实例化对应的类
    }
    
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>以下用于处理多个事务管理器时进行选择<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    /*@Resource(name="txManager1")
    private PlatformTransactionManager txManager1;

    // 创建JDBC事务管理器1
    @Bean(name = "txManager1")
    public PlatformTransactionManager txManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    // 创建JPA事务管理器2
    @Bean(name = "txManager2")
    public PlatformTransactionManager txManager2(EntityManagerFactory factory) {
        return new JpaTransactionManager(factory);
    }

    // 实现接口 TransactionManagementConfigurer 方法，其返回值代表在拥有多个事务管理器的情况下默认使用的事务管理器
    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return txManager1;
    }*/
    
    
    
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}

