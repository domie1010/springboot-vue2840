package com.dao;

import com.entity.YingpianOrderEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YingpianOrderView;

/**
 * 影片订单 Dao 接口
 *
 * @author 
 */
public interface YingpianOrderDao extends BaseMapper<YingpianOrderEntity> {

   List<YingpianOrderView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
