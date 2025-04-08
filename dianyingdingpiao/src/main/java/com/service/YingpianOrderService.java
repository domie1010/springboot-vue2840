package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YingpianOrderEntity;
import java.util.Map;

/**
 * 影片订单 服务类
 */
public interface YingpianOrderService extends IService<YingpianOrderEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}