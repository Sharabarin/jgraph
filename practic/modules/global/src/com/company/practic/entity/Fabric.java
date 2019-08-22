package com.company.practic.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import com.haulmont.cuba.security.entity.User;

import javax.persistence.*;

@NamePattern("%s|name")
@Table(name = "PRACTIC_FABRIC")
@Entity(name = "practic_Fabric")
public class Fabric extends StandardEntity {
    private static final long serialVersionUID = -4609980623661386099L;

    @Column(name = "NAME_FABRIC_ID", nullable = false, unique = true)
    protected String name;

    @Column(name = "FULL_NAME")
    protected String fullName;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    protected User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}