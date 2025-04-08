package com.entity.view;

import com.entity.YingpianOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 影片订单
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("yingpian_order")
public class YingpianOrderView extends YingpianOrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 yingpian
			/**
			* 影片名称
			*/
			private String yingpianName;
			/**
			* 影片类型
			*/
			private Integer yingpianTypes;
				/**
				* 影片类型的值
				*/
				private String yingpianValue;
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

		//级联表 yonghu
			/**
			* 用户编号
			*/
			private String yonghuDanhaoNumber;
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户照片
			*/
			private String yonghuPhoto;
			/**
			* 现住地址
			*/
			private String yonghuAddress;
			/**
			* 余额
			*/
			private Double newMoney;

	public YingpianOrderView() {

	}

	public YingpianOrderView(YingpianOrderEntity yingpianOrderEntity) {
		try {
			BeanUtils.copyProperties(this, yingpianOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
















				//级联表的get和set yingpian
					/**
					* 获取： 影片名称
					*/
					public String getYingpianName() {
						return yingpianName;
					}
					/**
					* 设置： 影片名称
					*/
					public void setYingpianName(String yingpianName) {
						this.yingpianName = yingpianName;
					}
					/**
					* 获取： 影片类型
					*/
					public Integer getYingpianTypes() {
						return yingpianTypes;
					}
					/**
					* 设置： 影片类型
					*/
					public void setYingpianTypes(Integer yingpianTypes) {
						this.yingpianTypes = yingpianTypes;
					}


						/**
						* 获取： 影片类型的值
						*/
						public String getYingpianValue() {
							return yingpianValue;
						}
						/**
						* 设置： 影片类型的值
						*/
						public void setYingpianValue(String yingpianValue) {
							this.yingpianValue = yingpianValue;
						}
					/**
					* 获取： 影片海报
					*/
					public String getYingpianPhoto() {
						return yingpianPhoto;
					}
					/**
					* 设置： 影片海报
					*/
					public void setYingpianPhoto(String yingpianPhoto) {
						this.yingpianPhoto = yingpianPhoto;
					}
					/**
					* 获取： 票房
					*/
					public Integer getPiaofangNumber() {
						return piaofangNumber;
					}
					/**
					* 设置： 票房
					*/
					public void setPiaofangNumber(Integer piaofangNumber) {
						this.piaofangNumber = piaofangNumber;
					}
					/**
					* 获取： 票价
					*/
					public Double getYingpianNewMoney() {
						return yingpianNewMoney;
					}
					/**
					* 设置： 票价
					*/
					public void setYingpianNewMoney(Double yingpianNewMoney) {
						this.yingpianNewMoney = yingpianNewMoney;
					}
					/**
					* 获取： 影片简介
					*/
					public String getYingpianContent() {
						return yingpianContent;
					}
					/**
					* 设置： 影片简介
					*/
					public void setYingpianContent(String yingpianContent) {
						this.yingpianContent = yingpianContent;
					}













				//级联表的get和set yonghu
					/**
					* 获取： 用户编号
					*/
					public String getYonghuDanhaoNumber() {
						return yonghuDanhaoNumber;
					}
					/**
					* 设置： 用户编号
					*/
					public void setYonghuDanhaoNumber(String yonghuDanhaoNumber) {
						this.yonghuDanhaoNumber = yonghuDanhaoNumber;
					}
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
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 用户照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 现住地址
					*/
					public String getYonghuAddress() {
						return yonghuAddress;
					}
					/**
					* 设置： 现住地址
					*/
					public void setYonghuAddress(String yonghuAddress) {
						this.yonghuAddress = yonghuAddress;
					}
					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}



}
