package com.zhangchaobing.movie.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Qualifier;

import com.zhangchaobing.movie.domain.Movie;
import com.zhangchaobing.movie.domain.Type;
/**
 * 
 * @ClassName: 接口MovieMapper 
 * @Description: 写方法
 * @author: 东篱
 * @date: 2019年9月3日 上午10:49:21
 */
public interface MovieMapper {
	//查询页面加模糊查询
     List<Map> getlist(@Param("mname")String mname);
     //复选框展示
     List<Type> gettype();
     //添加
     void addm(Movie movie);
     void addt(@Param("mid")Integer mid,@Param("tid")Integer tid );
     //删除的方法
     void deleteid(@Param("mid")Integer mid);
     void delete(@Param("mid")Integer mid);
     //修改的回显
     Movie getid(@Param("mid")Integer mid);
     void update(Movie movie);
     void updatez(@Param("mid")Integer mid,@Param("tid")Integer tid);
}
