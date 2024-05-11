package com.entity.view;

import com.entity.ZhutizixunLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 资讯评论
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("zhutizixun_liuyan")
public class ZhutizixunLiuyanView extends ZhutizixunLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

		//级联表 zhutizixun
			/**
			* 资讯标题
			*/
			private String zhutizixunName;
			/**
			* 资讯类型
			*/
			private Integer zhutizixunTypes;
				/**
				* 资讯类型的值
				*/
				private String zhutizixunValue;
			/**
			* 资讯封面
			*/
			private String zhutizixunPhoto;
			/**
			* 资讯视频
			*/
			private String zhutizixunVideo;
			/**
			* 赞
			*/
			private Integer zanNumber;
			/**
			* 踩
			*/
			private Integer caiNumber;
			/**
			* 资讯内容
			*/
			private String zhutizixunContent;

	public ZhutizixunLiuyanView() {

	}

	public ZhutizixunLiuyanView(ZhutizixunLiuyanEntity zhutizixunLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, zhutizixunLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}












































				//级联表的get和set yonghu

					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}

					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}

					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}

					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}

					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}

					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}


				//级联表的get和set zhutizixun

					/**
					* 获取： 资讯标题
					*/
					public String getZhutizixunName() {
						return zhutizixunName;
					}
					/**
					* 设置： 资讯标题
					*/
					public void setZhutizixunName(String zhutizixunName) {
						this.zhutizixunName = zhutizixunName;
					}

					/**
					* 获取： 资讯类型
					*/
					public Integer getZhutizixunTypes() {
						return zhutizixunTypes;
					}
					/**
					* 设置： 资讯类型
					*/
					public void setZhutizixunTypes(Integer zhutizixunTypes) {
						this.zhutizixunTypes = zhutizixunTypes;
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

					/**
					* 获取： 资讯封面
					*/
					public String getZhutizixunPhoto() {
						return zhutizixunPhoto;
					}
					/**
					* 设置： 资讯封面
					*/
					public void setZhutizixunPhoto(String zhutizixunPhoto) {
						this.zhutizixunPhoto = zhutizixunPhoto;
					}

					/**
					* 获取： 资讯视频
					*/
					public String getZhutizixunVideo() {
						return zhutizixunVideo;
					}
					/**
					* 设置： 资讯视频
					*/
					public void setZhutizixunVideo(String zhutizixunVideo) {
						this.zhutizixunVideo = zhutizixunVideo;
					}

					/**
					* 获取： 赞
					*/
					public Integer getZanNumber() {
						return zanNumber;
					}
					/**
					* 设置： 赞
					*/
					public void setZanNumber(Integer zanNumber) {
						this.zanNumber = zanNumber;
					}

					/**
					* 获取： 踩
					*/
					public Integer getCaiNumber() {
						return caiNumber;
					}
					/**
					* 设置： 踩
					*/
					public void setCaiNumber(Integer caiNumber) {
						this.caiNumber = caiNumber;
					}

					/**
					* 获取： 资讯内容
					*/
					public String getZhutizixunContent() {
						return zhutizixunContent;
					}
					/**
					* 设置： 资讯内容
					*/
					public void setZhutizixunContent(String zhutizixunContent) {
						this.zhutizixunContent = zhutizixunContent;
					}










}
