package com.zhangchaobing.movie.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhangchaobing.movie.domain.Movie;
import com.zhangchaobing.movie.domain.Type;
import com.zhangchaobing.movie.service.MovieService;
/**
 * 
 * @ClassName: MovieController 控制器
 * @Description: 管理页面TODO
 * @author: 东篱
 * @date: 2019年9月3日 上午10:48:26
 */
@Controller
public class MovieController {
    @Resource
     private  MovieService service;
    //查询页面
    @RequestMapping("list")
    public String getlist(Model model,@RequestParam(defaultValue="")String mname) {
    	 
    	 List<Map> list = service.getlist(mname);
    	 model.addAttribute("list", list);
    	model.addAttribute("mname",mname);
    	
    	return "list";
    }
    //跳转到添加页面
    @RequestMapping("toadd")
    public String toadd(Model model) {
    	List<Type> list = service.gettype();
    	model.addAttribute("list",list);
    	
    	
    	
    	return "add";
    }
    //添加的方法
    @ResponseBody
    @RequestMapping("add")
    public boolean add(Movie movie,Integer[] tids) {
    	try {
    		service.addm(movie, tids);
    		
    		return true;
		} catch (Exception e) {
		      e.printStackTrace();
		}
    	
    	return false;
    }
    @ResponseBody
    @RequestMapping("delete")
    public boolean delete(Integer mid) {
    	
    	try {
			service.delete(mid);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    	
    	return false;
    }
    @RequestMapping("toupdate")
    public String toupdate(Integer mid,Model model) {
    	Movie movie = service.getid(mid);
    	List<Type> list = service.gettype();
    	model.addAttribute("list",list);
    	model.addAttribute("movie",movie);
    	
    	return "update";
    }
    @ResponseBody
    @RequestMapping("update")
    public boolean update(Movie movie,Integer[] tids) {
    	try {
			service.update(movie, tids);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    	return false;
    }
}
