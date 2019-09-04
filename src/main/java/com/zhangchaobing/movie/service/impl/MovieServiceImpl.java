package com.zhangchaobing.movie.service.impl;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhangchaobing.movie.domain.Movie;
import com.zhangchaobing.movie.domain.Type;
import com.zhangchaobing.movie.mapper.MovieMapper;
import com.zhangchaobing.movie.service.MovieService;
@Service
public class MovieServiceImpl implements MovieService {
       @Resource
       private MovieMapper mapper;
	public List<Map> getlist(String mname) {
		// TODO Auto-generated method stub
		return mapper.getlist(mname);
	}
	@Override
	public List<Type> gettype() {
		// TODO Auto-generated method stub
		return mapper.gettype();
	}
	@Override
	public void addm(Movie movie, Integer[] tids) {
		mapper.addm(movie);
		Integer mid=movie.getMid();
		for (Integer tid : tids) {
			mapper.addt(mid,tid);
		}
		
	}
	@Override
	public void delete(Integer mid) {
		mapper.delete(mid);
		mapper.deleteid(mid);
		
	}
	@Override
	public Movie getid(Integer mid) {
		// TODO Auto-generated method stub
		return mapper.getid(mid);
	}
	@Override
	public void update(Movie movie, Integer[] tids) {
		 mapper.update(movie);
		 Integer mid=movie.getMid();
		 mapper.delete(mid);
		 for (Integer tid : tids) {
			mapper.addt(mid, tid);
		}
		
	}

}
