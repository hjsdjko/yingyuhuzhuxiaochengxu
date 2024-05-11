package com.entity.vo;

import com.entity.XingquxiaozuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 兴趣小组
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xingquxiaozu")
public class XingquxiaozuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
