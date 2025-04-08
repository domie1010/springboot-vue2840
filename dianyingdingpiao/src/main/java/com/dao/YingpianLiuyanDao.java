package com.dao;

import com.entity.YingpianLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YingpianLiuyanView;

/**
 * 影片留言 Dao 接口
 *
 * @author 
 */
public interface YingpianLiuyanDao extends BaseMapper<YingpianLiuyanEntity> {

   List<YingpianLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
