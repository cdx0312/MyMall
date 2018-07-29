package com.cdx.service;

import com.cdx.domain.TbItemEntity;

public interface TbItemService {
    /**
     * 根据商品ID获取商品信息
     * @param tbItemId 商品ID
     * @return TbItemEntity 商品类
     */
    TbItemEntity getTbItemEntityById(Long tbItemId);
}
