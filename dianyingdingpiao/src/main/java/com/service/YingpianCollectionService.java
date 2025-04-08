package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YingpianCollectionEntity;
import java.util.Map;

/**
 * 影片收藏 服务类
 */
public interface YingpianCollectionService extends IService<YingpianCollectionEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}