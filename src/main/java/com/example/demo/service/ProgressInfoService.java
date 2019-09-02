package com.example.demo.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;

import com.example.demo.datasource.TargetDataSource;
import com.example.demo.entity.PostCompany;
import com.example.demo.entity.ProgressInfo;
import com.example.demo.mapper.PostCompanyMapper;
import com.zaxxer.hikari.HikariDataSource;

@Service
public class ProgressInfoService {
//	@Autowired
//    @Qualifier("ds1")
//    private HikariDataSource dataSource1;
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
//	@Resource(name="txManager1")
//    private PlatformTransactionManager txManager1;
	
	// MyBatis的Mapper方法定义接口
	@Autowired
	private PostCompanyMapper postCompanyMapper;

    @TargetDataSource(name="ds2")
    public List<com.example.demo.dao.PostCompany> getList3(){
    	List<com.example.demo.dao.PostCompany> list = new ArrayList<com.example.demo.dao.PostCompany>();
    	com.example.demo.dao.PostCompany postCompany= postCompanyMapper.getById(8);
    	list.add(postCompany);
        return postCompanyMapper.likeName("递");
    }
    
//    @Resource(name = "ds1")
//    private DataSource dataSource1;
	
//	public List<ProgressInfo> getList() throws SQLException{
//		List<ProgressInfo> list = new ArrayList<ProgressInfo>();
//        String sql = "SELECT * FROM progress_info";
//        ResultSet rs =(ResultSet) dataSource1.getConnection().prepareStatement(sql);
//        while (rs.next()) {  
//        	ProgressInfo ps = new ProgressInfo();
//        	ps.setId(rs.getInt("id"));
//        	ps.setProgress(rs.getInt("progress"));
//        	ps.setSaveTime(rs.getDate("save_time"));
//            list.add(ps);
//        }//显示数据  
//        return list;
//    }
    @Transactional
	@TargetDataSource(name="ds1")
    public List<ProgressInfo> getList(){
        String sql = "SELECT * FROM progress_info";
        return (List<ProgressInfo>) jdbcTemplate.query(sql, new RowMapper<ProgressInfo>(){

            @Override
            public ProgressInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
            	ProgressInfo ps = new ProgressInfo();
            	ps.setId(rs.getInt("id"));
            	ps.setProgress(rs.getInt("progress"));
            	ps.setSaveTime(rs.getDate("save_time"));
                return ps;
            }

        });
    }
	
	@TargetDataSource(name="ds2")
	public List<PostCompany> getList2(){
        String sql = "SELECT * FROM post_company";
        return (List<PostCompany>) jdbcTemplate.query(sql, new RowMapper<PostCompany>(){

            @Override
            public PostCompany mapRow(ResultSet rs, int rowNum) throws SQLException {
            	PostCompany ps = new PostCompany();
            	ps.setId(rs.getInt("id"));
            	ps.setPostName(rs.getString("post_name"));
            	ps.setPostValue(rs.getInt("post_value"));
            	ps.setSaveTime(rs.getDate("save_time"));
            	
                return ps;
            }

        });
    }
}
