package com.zhangchaobing.movie.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.zhangchaobing.movie.domain.Movie;
import com.zhangchaobing.movie.domain.Type;

public interface MovieService {
	List<Map> getlist(String mname);
	
	 List<Type> gettype();
	 
	 void addm(Movie movie,Integer[] tids);
	 
	 //删除的方法
	 void delete(Integer mid);
	 //修改的回显
	 Movie getid(Integer mid);
	 void update(Movie movie,Integer[] tids);
}
