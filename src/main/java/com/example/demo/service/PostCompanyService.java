package com.example.demo.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.example.demo.entity.PostCompany;

@Service
public class PostCompanyService {
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	public List<PostCompany> getList(){
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
