package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import com.dao.JiarudexiaozuDao;
import com.entity.JiarudexiaozuEntity;
import com.service.JiarudexiaozuService;
import com.entity.view.JiarudexiaozuView;

/**
 * 加入的小组 服务实现类
 */
@Service("jiarudexiaozuService")
@Transactional
public class JiarudexiaozuServiceImpl extends ServiceImpl<JiarudexiaozuDao, JiarudexiaozuEntity> implements JiarudexiaozuService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<JiarudexiaozuView> page =new Query<JiarudexiaozuView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
