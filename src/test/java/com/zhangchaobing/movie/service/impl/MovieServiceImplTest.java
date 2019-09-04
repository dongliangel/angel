package com.zhangchaobing.movie.service.impl;

import static org.junit.Assert.fail;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhangchaobing.movie.domain.Type;
import com.zhangchaobing.movie.service.MovieService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class MovieServiceImplTest {
     @Resource 
      private MovieService service;
	 
	@Test
	public void testGetlist() {
		List<Map> list = service.getlist(null);
		System.out.println(list);
	}

	 @Test
	 public void testGettype() {
		  List<Type> list = service.gettype();
		  System.out.println(list);
		 
		 
	 }
}
