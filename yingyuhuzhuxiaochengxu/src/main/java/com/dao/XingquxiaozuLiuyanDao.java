package com.dao;

import com.entity.XingquxiaozuLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XingquxiaozuLiuyanView;

/**
 * 小组打卡 Dao 接口
 *
 * @author 
 */
public interface XingquxiaozuLiuyanDao extends BaseMapper<XingquxiaozuLiuyanEntity> {

   List<XingquxiaozuLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
