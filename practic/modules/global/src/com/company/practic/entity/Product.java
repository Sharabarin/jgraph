package com.company.practic.entity;

import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Table(name = "PRACTIC_PRODUCT")
@Entity(name = "practic_Product")
public class Product extends StandardEntity {
    private static final long serialVersionUID = -2805661613445080715L;

    @NotNull
    @Column(name = "PRODUCT_NAME", nullable = false, unique = true)
    protected String name;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "FABRIC_ID")
    protected Fabric fabric;

    @NotNull
    @Column(name = "PRICE_PRODUCT", nullable = false)
    protected BigDecimal price;

    public Fabric getFabric() {
        return fabric;
    }

    public void setFabric(Fabric fabric) {
        this.fabric = fabric;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}