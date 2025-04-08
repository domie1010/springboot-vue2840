package com.dao;

import com.entity.YingpianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YingpianView;

/**
 * 影片 Dao 接口
 *
 * @author 
 */
public interface YingpianDao extends BaseMapper<YingpianEntity> {

   List<YingpianView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
