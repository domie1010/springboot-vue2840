package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YingpianLiuyanEntity;
import java.util.Map;

/**
 * 影片留言 服务类
 */
public interface YingpianLiuyanService extends IService<YingpianLiuyanEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}