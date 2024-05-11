package com.entity.model;

import com.entity.XingquxiaozuLiuyanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 小组打卡
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XingquxiaozuLiuyanModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 兴趣小组
     */
    private Integer xingquxiaozuId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 小组打卡内容
     */
    private String xingquxiaozuLiuyanText;


    /**
     * 小组打卡时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
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
	 * 获取：兴趣小组
	 */
    public Integer getXingquxiaozuId() {
        return xingquxiaozuId;
    }


    /**
	 * 设置：兴趣小组
	 */
    public void setXingquxiaozuId(Integer xingquxiaozuId) {
        this.xingquxiaozuId = xingquxiaozuId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：小组打卡内容
	 */
    public String getXingquxiaozuLiuyanText() {
        return xingquxiaozuLiuyanText;
    }


    /**
	 * 设置：小组打卡内容
	 */
    public void setXingquxiaozuLiuyanText(String xingquxiaozuLiuyanText) {
        this.xingquxiaozuLiuyanText = xingquxiaozuLiuyanText;
    }
    /**
	 * 获取：小组打卡时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：小组打卡时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
