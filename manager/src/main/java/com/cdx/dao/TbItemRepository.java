package com.cdx.dao;

import com.cdx.domain.TbItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 报警事件Repo
 */
public interface TbItemRepository extends JpaRepository<TbItemEntity, Long>, JpaSpecificationExecutor<TbItemEntity> {
    TbItemEntity getTbItemEntityById(Long tbItemId);
}
