package com.cdx.domain;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
public class TbItemEntity implements Serializable {
    private long id;
    private String title;
    private String sellPoint;
    private long price;
    private int num;
    private String barcode;
    private String image;
    private long cid;
    private byte status;
    private Timestamp created;
    private Timestamp updated;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbItemEntity that = (TbItemEntity) o;

        if (id != that.id) return false;
        if (price != that.price) return false;
        if (num != that.num) return false;
        if (cid != that.cid) return false;
        if (status != that.status) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (sellPoint != null ? !sellPoint.equals(that.sellPoint) : that.sellPoint != null) return false;
        if (barcode != null ? !barcode.equals(that.barcode) : that.barcode != null) return false;
        if (image != null ? !image.equals(that.image) : that.image != null) return false;
        if (created != null ? !created.equals(that.created) : that.created != null) return false;
        if (updated != null ? !updated.equals(that.updated) : that.updated != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (sellPoint != null ? sellPoint.hashCode() : 0);
        result = 31 * result + (int) (price ^ (price >>> 32));
        result = 31 * result + num;
        result = 31 * result + (barcode != null ? barcode.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (int) (cid ^ (cid >>> 32));
        result = 31 * result + (int) status;
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (updated != null ? updated.hashCode() : 0);
        return result;
    }
}
