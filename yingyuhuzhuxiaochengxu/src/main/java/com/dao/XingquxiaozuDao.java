package com.dao;

import com.entity.XingquxiaozuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XingquxiaozuView;

/**
 * 兴趣小组 Dao 接口
 *
 * @author 
 */
public interface XingquxiaozuDao extends BaseMapper<XingquxiaozuEntity> {

   List<XingquxiaozuView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
