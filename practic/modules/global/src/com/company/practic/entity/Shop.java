package com.company.practic.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Table(name = "PRACTIC_SHOP")
@Entity(name = "practic_Shop")
public class Shop extends StandardEntity {
    private static final long serialVersionUID = -8965956152018001388L;

    @NotNull
    @Column(name = "SHOP_NAME", nullable = false)
    protected String name;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BRAND_ID")
    protected Brand brand;

    @NotNull
    @Column(name = "SHOP_ID", nullable = false, unique = true)
    protected String shopId;

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}