package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;

import com.dao.YingpianCollectionDao;
import com.entity.YingpianCollectionEntity;
import com.service.YingpianCollectionService;
import com.entity.view.YingpianCollectionView;

/**
 * 影片收藏 服务实现类
 */
@Service("yingpianCollectionService")
@Transactional
public class YingpianCollectionServiceImpl extends ServiceImpl<YingpianCollectionDao, YingpianCollectionEntity> implements YingpianCollectionService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<YingpianCollectionView> page =new Query<YingpianCollectionView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
