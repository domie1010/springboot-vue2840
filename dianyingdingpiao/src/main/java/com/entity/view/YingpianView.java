package com.entity.view;

import com.entity.YingpianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * 影片
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("yingpian")
public class YingpianView extends YingpianEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 影片类型的值
		*/
		private String yingpianValue;



	public YingpianView() {

	}

	public YingpianView(YingpianEntity yingpianEntity) {
		try {
			BeanUtils.copyProperties(this, yingpianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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











}
