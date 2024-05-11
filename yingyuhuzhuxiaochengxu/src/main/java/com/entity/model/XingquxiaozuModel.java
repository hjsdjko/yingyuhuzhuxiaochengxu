package com.entity.model;

import com.entity.XingquxiaozuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 兴趣小组
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XingquxiaozuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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
     * 专业
     */
    private Integer zhuanyeTypes;


    /**
     * 英语水平
     */
    private Integer shuipingTypes;


    /**
     * 所属地点
     */
    private String xingquxiaozuAddress;


    /**
     * 小组组长
     */
    private Integer yonghuId;


    /**
     * 小组简介
     */
    private String xingquxiaozuContent;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：小组名称
	 */
    public String getXingquxiaozuName() {
        return xingquxiaozuName;
    }


    /**
	 * 设置：小组名称
	 */
    public void setXingquxiaozuName(String xingquxiaozuName) {
        this.xingquxiaozuName = xingquxiaozuName;
    }
    /**
	 * 获取：小组封面
	 */
    public String getXingquxiaozuPhoto() {
        return xingquxiaozuPhoto;
    }


    /**
	 * 设置：小组封面
	 */
    public void setXingquxiaozuPhoto(String xingquxiaozuPhoto) {
        this.xingquxiaozuPhoto = xingquxiaozuPhoto;
    }
    /**
	 * 获取：小组类型
	 */
    public Integer getXingquxiaozuTypes() {
        return xingquxiaozuTypes;
    }


    /**
	 * 设置：小组类型
	 */
    public void setXingquxiaozuTypes(Integer xingquxiaozuTypes) {
        this.xingquxiaozuTypes = xingquxiaozuTypes;
    }
    /**
	 * 获取：专业
	 */
    public Integer getZhuanyeTypes() {
        return zhuanyeTypes;
    }


    /**
	 * 设置：专业
	 */
    public void setZhuanyeTypes(Integer zhuanyeTypes) {
        this.zhuanyeTypes = zhuanyeTypes;
    }
    /**
	 * 获取：英语水平
	 */
    public Integer getShuipingTypes() {
        return shuipingTypes;
    }


    /**
	 * 设置：英语水平
	 */
    public void setShuipingTypes(Integer shuipingTypes) {
        this.shuipingTypes = shuipingTypes;
    }
    /**
	 * 获取：所属地点
	 */
    public String getXingquxiaozuAddress() {
        return xingquxiaozuAddress;
    }


    /**
	 * 设置：所属地点
	 */
    public void setXingquxiaozuAddress(String xingquxiaozuAddress) {
        this.xingquxiaozuAddress = xingquxiaozuAddress;
    }
    /**
	 * 获取：小组组长
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：小组组长
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：小组简介
	 */
    public String getXingquxiaozuContent() {
        return xingquxiaozuContent;
    }


    /**
	 * 设置：小组简介
	 */
    public void setXingquxiaozuContent(String xingquxiaozuContent) {
        this.xingquxiaozuContent = xingquxiaozuContent;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
