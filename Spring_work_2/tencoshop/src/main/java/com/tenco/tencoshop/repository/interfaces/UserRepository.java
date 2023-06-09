package com.tenco.tencoshop.repository.interfaces;

import java.util.List; 

import org.apache.ibatis.annotations.Mapper;

import com.tenco.tencoshop.repository.model.User;


@Mapper // MyBatis 의존 설정함(build.gradle 파일)
public interface UserRepository {

	public int insert(User user);
	public int updateById(User user);
	public int deleteById(Integer id);
	public User findById(Integer id);
	public List<User> findAll();
}// end of class
