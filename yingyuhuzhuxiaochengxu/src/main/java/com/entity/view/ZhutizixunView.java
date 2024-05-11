package com.entity.view;

import com.entity.ZhutizixunEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 主题资讯
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("zhutizixun")
public class ZhutizixunView extends ZhutizixunEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 资讯类型的值
		*/
		private String zhutizixunValue;



	public ZhutizixunView() {

	}

	public ZhutizixunView(ZhutizixunEntity zhutizixunEntity) {
		try {
			BeanUtils.copyProperties(this, zhutizixunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 资讯类型的值
			*/
			public String getZhutizixunValue() {
				return zhutizixunValue;
			}
			/**
			* 设置： 资讯类型的值
			*/
			public void setZhutizixunValue(String zhutizixunValue) {
				this.zhutizixunValue = zhutizixunValue;
			}



















}
