package com.company.mapping.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "MAPPING_CUSTOMER")
@Entity(name = "mapping_Customer")
public class Customer extends StandardEntity {
    private static final long serialVersionUID = -4412744671025664513L;
}