package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 兴趣小组
 *
 * @author 
 * @email
 */
@TableName("xingquxiaozu")
public class XingquxiaozuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XingquxiaozuEntity() {

	}

	public XingquxiaozuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 小组名称
     */
    @TableField(value = "xingquxiaozu_name")

    private String xingquxiaozuName;


    /**
     * 小组封面
     */
    @TableField(value = "xingquxiaozu_photo")

    private String xingquxiaozuPhoto;


    /**
     * 小组类型
     */
    @TableField(value = "xingquxiaozu_types")

    private Integer xingquxiaozuTypes;


    /**
     * 专业
     */
    @TableField(value = "zhuanye_types")

    private Integer zhuanyeTypes;


    /**
     * 英语水平
     */
    @TableField(value = "shuiping_types")

    private Integer shuipingTypes;


    /**
     * 所属地点
     */
    @TableField(value = "xingquxiaozu_address")

    private String xingquxiaozuAddress;


    /**
     * 小组组长
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 小组简介
     */
    @TableField(value = "xingquxiaozu_content")

    private String xingquxiaozuContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：小组名称
	 */
    public String getXingquxiaozuName() {
        return xingquxiaozuName;
    }
    /**
	 * 获取：小组名称
	 */

    public void setXingquxiaozuName(String xingquxiaozuName) {
        this.xingquxiaozuName = xingquxiaozuName;
    }
    /**
	 * 设置：小组封面
	 */
    public String getXingquxiaozuPhoto() {
        return xingquxiaozuPhoto;
    }
    /**
	 * 获取：小组封面
	 */

    public void setXingquxiaozuPhoto(String xingquxiaozuPhoto) {
        this.xingquxiaozuPhoto = xingquxiaozuPhoto;
    }
    /**
	 * 设置：小组类型
	 */
    public Integer getXingquxiaozuTypes() {
        return xingquxiaozuTypes;
    }
    /**
	 * 获取：小组类型
	 */

    public void setXingquxiaozuTypes(Integer xingquxiaozuTypes) {
        this.xingquxiaozuTypes = xingquxiaozuTypes;
    }
    /**
	 * 设置：专业
	 */
    public Integer getZhuanyeTypes() {
        return zhuanyeTypes;
    }
    /**
	 * 获取：专业
	 */

    public void setZhuanyeTypes(Integer zhuanyeTypes) {
        this.zhuanyeTypes = zhuanyeTypes;
    }
    /**
	 * 设置：英语水平
	 */
    public Integer getShuipingTypes() {
        return shuipingTypes;
    }
    /**
	 * 获取：英语水平
	 */

    public void setShuipingTypes(Integer shuipingTypes) {
        this.shuipingTypes = shuipingTypes;
    }
    /**
	 * 设置：所属地点
	 */
    public String getXingquxiaozuAddress() {
        return xingquxiaozuAddress;
    }
    /**
	 * 获取：所属地点
	 */

    public void setXingquxiaozuAddress(String xingquxiaozuAddress) {
        this.xingquxiaozuAddress = xingquxiaozuAddress;
    }
    /**
	 * 设置：小组组长
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：小组组长
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：小组简介
	 */
    public String getXingquxiaozuContent() {
        return xingquxiaozuContent;
    }
    /**
	 * 获取：小组简介
	 */

    public void setXingquxiaozuContent(String xingquxiaozuContent) {
        this.xingquxiaozuContent = xingquxiaozuContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Xingquxiaozu{" +
            "id=" + id +
            ", xingquxiaozuName=" + xingquxiaozuName +
            ", xingquxiaozuPhoto=" + xingquxiaozuPhoto +
            ", xingquxiaozuTypes=" + xingquxiaozuTypes +
            ", zhuanyeTypes=" + zhuanyeTypes +
            ", shuipingTypes=" + shuipingTypes +
            ", xingquxiaozuAddress=" + xingquxiaozuAddress +
            ", yonghuId=" + yonghuId +
            ", xingquxiaozuContent=" + xingquxiaozuContent +
            ", createTime=" + createTime +
        "}";
    }
}
