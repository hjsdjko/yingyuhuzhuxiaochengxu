package com.entity.model;

import com.entity.ZhutizixunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 主题资讯
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZhutizixunModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 资讯标题
     */
    private String zhutizixunName;


    /**
     * 资讯类型
     */
    private Integer zhutizixunTypes;


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
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 资讯内容
     */
    private String zhutizixunContent;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：资讯标题
	 */
    public String getZhutizixunName() {
        return zhutizixunName;
    }


    /**
	 * 设置：资讯标题
	 */
    public void setZhutizixunName(String zhutizixunName) {
        this.zhutizixunName = zhutizixunName;
    }
    /**
	 * 获取：资讯类型
	 */
    public Integer getZhutizixunTypes() {
        return zhutizixunTypes;
    }


    /**
	 * 设置：资讯类型
	 */
    public void setZhutizixunTypes(Integer zhutizixunTypes) {
        this.zhutizixunTypes = zhutizixunTypes;
    }
    /**
	 * 获取：资讯封面
	 */
    public String getZhutizixunPhoto() {
        return zhutizixunPhoto;
    }


    /**
	 * 设置：资讯封面
	 */
    public void setZhutizixunPhoto(String zhutizixunPhoto) {
        this.zhutizixunPhoto = zhutizixunPhoto;
    }
    /**
	 * 获取：资讯视频
	 */
    public String getZhutizixunVideo() {
        return zhutizixunVideo;
    }


    /**
	 * 设置：资讯视频
	 */
    public void setZhutizixunVideo(String zhutizixunVideo) {
        this.zhutizixunVideo = zhutizixunVideo;
    }
    /**
	 * 获取：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 设置：赞
	 */
    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 获取：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 设置：踩
	 */
    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 获取：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：发布时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：资讯内容
	 */
    public String getZhutizixunContent() {
        return zhutizixunContent;
    }


    /**
	 * 设置：资讯内容
	 */
    public void setZhutizixunContent(String zhutizixunContent) {
        this.zhutizixunContent = zhutizixunContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
