package com.cdx.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cdx.domain.TbItemEntity;
import org.springframework.stereotype.Component;

/**
 * @program: mall
 * @description: ${description}
 * @author: cdx
 * @create: 2018-07-29 19:03
 **/
@Component
public class DubboTbItemService {
    @Reference
    TbItemService itemService;

    public TbItemEntity getTbItemEntityById(Long tbItemId) {
        return itemService.getTbItemEntityById(tbItemId);
    }


}
