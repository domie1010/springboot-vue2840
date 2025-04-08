package com.entity.vo;

import com.entity.YingpianEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 影片
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("yingpian")
public class YingpianVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 影片名称
     */

    @TableField(value = "yingpian_name")
    private String yingpianName;


    /**
     * 影片类型
     */

    @TableField(value = "yingpian_types")
    private Integer yingpianTypes;


    /**
     * 影片海报
     */

    @TableField(value = "yingpian_photo")
    private String yingpianPhoto;


    /**
     * 票房
     */

    @TableField(value = "piaofang_number")
    private Integer piaofangNumber;


    /**
     * 票价
     */

    @TableField(value = "yingpian_new_money")
    private Double yingpianNewMoney;


    /**
     * 影片简介
     */

    @TableField(value = "yingpian_content")
    private String yingpianContent;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 设置：影片名称
	 */
    public String getYingpianName() {
        return yingpianName;
    }


    /**
	 * 获取：影片名称
	 */

    public void setYingpianName(String yingpianName) {
        this.yingpianName = yingpianName;
    }
    /**
	 * 设置：影片类型
	 */
    public Integer getYingpianTypes() {
        return yingpianTypes;
    }


    /**
	 * 获取：影片类型
	 */

    public void setYingpianTypes(Integer yingpianTypes) {
        this.yingpianTypes = yingpianTypes;
    }
    /**
	 * 设置：影片海报
	 */
    public String getYingpianPhoto() {
        return yingpianPhoto;
    }


    /**
	 * 获取：影片海报
	 */

    public void setYingpianPhoto(String yingpianPhoto) {
        this.yingpianPhoto = yingpianPhoto;
    }
    /**
	 * 设置：票房
	 */
    public Integer getPiaofangNumber() {
        return piaofangNumber;
    }


    /**
	 * 获取：票房
	 */

    public void setPiaofangNumber(Integer piaofangNumber) {
        this.piaofangNumber = piaofangNumber;
    }
    /**
	 * 设置：票价
	 */
    public Double getYingpianNewMoney() {
        return yingpianNewMoney;
    }


    /**
	 * 获取：票价
	 */

    public void setYingpianNewMoney(Double yingpianNewMoney) {
        this.yingpianNewMoney = yingpianNewMoney;
    }
    /**
	 * 设置：影片简介
	 */
    public String getYingpianContent() {
        return yingpianContent;
    }


    /**
	 * 获取：影片简介
	 */

    public void setYingpianContent(String yingpianContent) {
        this.yingpianContent = yingpianContent;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
