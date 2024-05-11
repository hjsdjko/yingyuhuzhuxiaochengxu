package com.dao;

import com.entity.JiarudexiaozuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JiarudexiaozuView;

/**
 * 加入的小组 Dao 接口
 *
 * @author 
 */
public interface JiarudexiaozuDao extends BaseMapper<JiarudexiaozuEntity> {

   List<JiarudexiaozuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
