package com.dao;

import com.entity.YingpianCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YingpianCollectionView;

/**
 * 影片收藏 Dao 接口
 *
 * @author 
 */
public interface YingpianCollectionDao extends BaseMapper<YingpianCollectionEntity> {

   List<YingpianCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
