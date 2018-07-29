package com.cdx.controller;

import com.cdx.domain.TbItemEntity;
import com.cdx.service.DubboTbItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TbItemController {
    // 注入商品service
    @Autowired
    private DubboTbItemService itemService;


    @RequestMapping("/item/{itemId}")
    @ResponseBody
    public TbItemEntity getItemById(@PathVariable Long itemId) {
        if (itemId != null)
            return itemService.getTbItemEntityById(itemId);
        return null;
    }
}
