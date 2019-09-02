package com.example.demo.mapper;

import java.util.List;

import com.example.demo.configMybatis.MyMapper;
import com.example.demo.dao.PostCompany;

public interface PostCompanyMapper extends MyMapper<PostCompany> {
	List<PostCompany> likeName(String name);

	PostCompany getById(int id);

    String getNameById(int id);
}