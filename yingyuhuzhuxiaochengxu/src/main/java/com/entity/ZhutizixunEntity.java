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
 * 主题资讯
 *
 * @author 
 * @email
 */
@TableName("zhutizixun")
public class ZhutizixunEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ZhutizixunEntity() {

	}

	public ZhutizixunEntity(T t) {
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
     * 资讯标题
     */
    @TableField(value = "zhutizixun_name")

    private String zhutizixunName;


    /**
     * 资讯类型
     */
    @TableField(value = "zhutizixun_types")

    private Integer zhutizixunTypes;


    /**
     * 资讯封面
     */
    @TableField(value = "zhutizixun_photo")

    private String zhutizixunPhoto;


    /**
     * 资讯视频
     */
    @TableField(value = "zhutizixun_video")

    private String zhutizixunVideo;


    /**
     * 赞
     */
    @TableField(value = "zan_number")

    private Integer zanNumber;


    /**
     * 踩
     */
    @TableField(value = "cai_number")

    private Integer caiNumber;


    /**
     * 发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 资讯内容
     */
    @TableField(value = "zhutizixun_content")

    private String zhutizixunContent;


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
	 * 设置：资讯标题
	 */
    public String getZhutizixunName() {
        return zhutizixunName;
    }
    /**
	 * 获取：资讯标题
	 */

    public void setZhutizixunName(String zhutizixunName) {
        this.zhutizixunName = zhutizixunName;
    }
    /**
	 * 设置：资讯类型
	 */
    public Integer getZhutizixunTypes() {
        return zhutizixunTypes;
    }
    /**
	 * 获取：资讯类型
	 */

    public void setZhutizixunTypes(Integer zhutizixunTypes) {
        this.zhutizixunTypes = zhutizixunTypes;
    }
    /**
	 * 设置：资讯封面
	 */
    public String getZhutizixunPhoto() {
        return zhutizixunPhoto;
    }
    /**
	 * 获取：资讯封面
	 */

    public void setZhutizixunPhoto(String zhutizixunPhoto) {
        this.zhutizixunPhoto = zhutizixunPhoto;
    }
    /**
	 * 设置：资讯视频
	 */
    public String getZhutizixunVideo() {
        return zhutizixunVideo;
    }
    /**
	 * 获取：资讯视频
	 */

    public void setZhutizixunVideo(String zhutizixunVideo) {
        this.zhutizixunVideo = zhutizixunVideo;
    }
    /**
	 * 设置：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }
    /**
	 * 获取：赞
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 设置：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }
    /**
	 * 获取：踩
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 设置：发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：资讯内容
	 */
    public String getZhutizixunContent() {
        return zhutizixunContent;
    }
    /**
	 * 获取：资讯内容
	 */

    public void setZhutizixunContent(String zhutizixunContent) {
        this.zhutizixunContent = zhutizixunContent;
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
        return "Zhutizixun{" +
            "id=" + id +
            ", zhutizixunName=" + zhutizixunName +
            ", zhutizixunTypes=" + zhutizixunTypes +
            ", zhutizixunPhoto=" + zhutizixunPhoto +
            ", zhutizixunVideo=" + zhutizixunVideo +
            ", zanNumber=" + zanNumber +
            ", caiNumber=" + caiNumber +
            ", insertTime=" + insertTime +
            ", zhutizixunContent=" + zhutizixunContent +
            ", createTime=" + createTime +
        "}";
    }
}
