package com.cdx.service.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cdx.dao.TbItemRepository;
import com.cdx.domain.TbItemEntity;
import com.cdx.service.TbItemService;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TbItemServiceImpl implements TbItemService {

    /**
     * 注入商品类Repo
     */
    @Autowired
    private TbItemRepository tbItemRepository;


    @Override
    public TbItemEntity getTbItemEntityById(Long tbItemId) {
        if (tbItemId != null)
            return this.tbItemRepository.getTbItemEntityById(tbItemId);
        else
            return null;
    }
}
