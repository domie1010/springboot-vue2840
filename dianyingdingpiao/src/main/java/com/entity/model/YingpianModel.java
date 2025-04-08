package com.entity.model;

import com.entity.YingpianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 影片
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YingpianModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 影片名称
     */
    private String yingpianName;


    /**
     * 影片类型
     */
    private Integer yingpianTypes;


    /**
     * 影片海报
     */
    private String yingpianPhoto;


    /**
     * 票房
     */
    private Integer piaofangNumber;


    /**
     * 票价
     */
    private Double yingpianNewMoney;


    /**
     * 影片简介
     */
    private String yingpianContent;


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
	 * 获取：影片名称
	 */
    public String getYingpianName() {
        return yingpianName;
    }


    /**
	 * 设置：影片名称
	 */
    public void setYingpianName(String yingpianName) {
        this.yingpianName = yingpianName;
    }
    /**
	 * 获取：影片类型
	 */
    public Integer getYingpianTypes() {
        return yingpianTypes;
    }


    /**
	 * 设置：影片类型
	 */
    public void setYingpianTypes(Integer yingpianTypes) {
        this.yingpianTypes = yingpianTypes;
    }
    /**
	 * 获取：影片海报
	 */
    public String getYingpianPhoto() {
        return yingpianPhoto;
    }


    /**
	 * 设置：影片海报
	 */
    public void setYingpianPhoto(String yingpianPhoto) {
        this.yingpianPhoto = yingpianPhoto;
    }
    /**
	 * 获取：票房
	 */
    public Integer getPiaofangNumber() {
        return piaofangNumber;
    }


    /**
	 * 设置：票房
	 */
    public void setPiaofangNumber(Integer piaofangNumber) {
        this.piaofangNumber = piaofangNumber;
    }
    /**
	 * 获取：票价
	 */
    public Double getYingpianNewMoney() {
        return yingpianNewMoney;
    }


    /**
	 * 设置：票价
	 */
    public void setYingpianNewMoney(Double yingpianNewMoney) {
        this.yingpianNewMoney = yingpianNewMoney;
    }
    /**
	 * 获取：影片简介
	 */
    public String getYingpianContent() {
        return yingpianContent;
    }


    /**
	 * 设置：影片简介
	 */
    public void setYingpianContent(String yingpianContent) {
        this.yingpianContent = yingpianContent;
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
