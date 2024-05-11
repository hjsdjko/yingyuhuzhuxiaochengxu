package com.dao;

import com.entity.ZhutizixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhutizixunView;

/**
 * 主题资讯 Dao 接口
 *
 * @author 
 */
public interface ZhutizixunDao extends BaseMapper<ZhutizixunEntity> {

   List<ZhutizixunView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
