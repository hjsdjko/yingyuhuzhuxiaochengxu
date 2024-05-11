package com.entity.view;

import com.entity.JiarudexiaozuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 加入的小组
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jiarudexiaozu")
public class JiarudexiaozuView extends JiarudexiaozuEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 xingquxiaozu
			/**
			* 小组名称
			*/
			private String xingquxiaozuName;
			/**
			* 小组封面
			*/
			private String xingquxiaozuPhoto;
			/**
			* 小组类型
			*/
			private Integer xingquxiaozuTypes;
				/**
				* 小组类型的值
				*/
				private String xingquxiaozuValue;
			/**
			* 专业
			*/
			private Integer zhuanyeTypes;
				/**
				* 专业的值
				*/
				private String zhuanyeValue;
			/**
			* 英语水平
			*/
			private Integer shuipingTypes;
				/**
				* 英语水平的值
				*/
				private String shuipingValue;
			/**
			* 所属地点
			*/
			private String xingquxiaozuAddress;
			/**
			* 兴趣小组 的 小组组长
			*/
			private Integer xingquxiaozuYonghuId;
			/**
			* 小组简介
			*/
			private String xingquxiaozuContent;

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

	public JiarudexiaozuView() {

	}

	public JiarudexiaozuView(JiarudexiaozuEntity jiarudexiaozuEntity) {
		try {
			BeanUtils.copyProperties(this, jiarudexiaozuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}





































				//级联表的get和set xingquxiaozu

					/**
					* 获取： 小组名称
					*/
					public String getXingquxiaozuName() {
						return xingquxiaozuName;
					}
					/**
					* 设置： 小组名称
					*/
					public void setXingquxiaozuName(String xingquxiaozuName) {
						this.xingquxiaozuName = xingquxiaozuName;
					}

					/**
					* 获取： 小组封面
					*/
					public String getXingquxiaozuPhoto() {
						return xingquxiaozuPhoto;
					}
					/**
					* 设置： 小组封面
					*/
					public void setXingquxiaozuPhoto(String xingquxiaozuPhoto) {
						this.xingquxiaozuPhoto = xingquxiaozuPhoto;
					}

					/**
					* 获取： 小组类型
					*/
					public Integer getXingquxiaozuTypes() {
						return xingquxiaozuTypes;
					}
					/**
					* 设置： 小组类型
					*/
					public void setXingquxiaozuTypes(Integer xingquxiaozuTypes) {
						this.xingquxiaozuTypes = xingquxiaozuTypes;
					}


						/**
						* 获取： 小组类型的值
						*/
						public String getXingquxiaozuValue() {
							return xingquxiaozuValue;
						}
						/**
						* 设置： 小组类型的值
						*/
						public void setXingquxiaozuValue(String xingquxiaozuValue) {
							this.xingquxiaozuValue = xingquxiaozuValue;
						}

					/**
					* 获取： 专业
					*/
					public Integer getZhuanyeTypes() {
						return zhuanyeTypes;
					}
					/**
					* 设置： 专业
					*/
					public void setZhuanyeTypes(Integer zhuanyeTypes) {
						this.zhuanyeTypes = zhuanyeTypes;
					}


						/**
						* 获取： 专业的值
						*/
						public String getZhuanyeValue() {
							return zhuanyeValue;
						}
						/**
						* 设置： 专业的值
						*/
						public void setZhuanyeValue(String zhuanyeValue) {
							this.zhuanyeValue = zhuanyeValue;
						}

					/**
					* 获取： 英语水平
					*/
					public Integer getShuipingTypes() {
						return shuipingTypes;
					}
					/**
					* 设置： 英语水平
					*/
					public void setShuipingTypes(Integer shuipingTypes) {
						this.shuipingTypes = shuipingTypes;
					}


						/**
						* 获取： 英语水平的值
						*/
						public String getShuipingValue() {
							return shuipingValue;
						}
						/**
						* 设置： 英语水平的值
						*/
						public void setShuipingValue(String shuipingValue) {
							this.shuipingValue = shuipingValue;
						}

					/**
					* 获取： 所属地点
					*/
					public String getXingquxiaozuAddress() {
						return xingquxiaozuAddress;
					}
					/**
					* 设置： 所属地点
					*/
					public void setXingquxiaozuAddress(String xingquxiaozuAddress) {
						this.xingquxiaozuAddress = xingquxiaozuAddress;
					}

					/**
					* 获取：兴趣小组 的 小组组长
					*/
					public Integer getXingquxiaozuYonghuId() {
						return xingquxiaozuYonghuId;
					}
					/**
					* 设置：兴趣小组 的 小组组长
					*/
					public void setXingquxiaozuYonghuId(Integer xingquxiaozuYonghuId) {
						this.xingquxiaozuYonghuId = xingquxiaozuYonghuId;
					}


					/**
					* 获取： 小组简介
					*/
					public String getXingquxiaozuContent() {
						return xingquxiaozuContent;
					}
					/**
					* 设置： 小组简介
					*/
					public void setXingquxiaozuContent(String xingquxiaozuContent) {
						this.xingquxiaozuContent = xingquxiaozuContent;
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












}
