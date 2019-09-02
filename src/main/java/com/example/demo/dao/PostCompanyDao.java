package com.example.demo.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.PostCompany;

public interface PostCompanyDao extends CrudRepository<PostCompany, Integer> {
	@Transactional
    @Modifying
    @Query(value = "update post_company set post_name = :post_name where id = :id", nativeQuery = true)
    int updatePostCompanyById(@Param("post_name") String post_name, @Param("id") int id);

    @Query(value = "select * from post_company", nativeQuery = true)
    List<PostCompany> getList();
}
