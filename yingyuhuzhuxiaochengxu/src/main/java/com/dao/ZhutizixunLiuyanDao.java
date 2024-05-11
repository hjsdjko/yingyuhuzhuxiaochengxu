package com.dao;

import com.entity.ZhutizixunLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhutizixunLiuyanView;

/**
 * 资讯评论 Dao 接口
 *
 * @author 
 */
public interface ZhutizixunLiuyanDao extends BaseMapper<ZhutizixunLiuyanEntity> {

   List<ZhutizixunLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
