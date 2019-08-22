-- begin PRACTIC_SHOP
create table PRACTIC_SHOP (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    SHOP_NAME varchar(255) not null,
    BRAND_ID uuid not null,
    SHOP_ID varchar(255) not null,
    --
    primary key (ID)
)^
-- end PRACTIC_SHOP
-- begin PRACTIC_FABRIC
create table PRACTIC_FABRIC (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME_FABRIC_ID varchar(255) not null,
    FULL_NAME varchar(255),
    USER_ID uuid,
    --
    primary key (ID)
)^
-- end PRACTIC_FABRIC
-- begin PRACTIC_PRODUCT
create table PRACTIC_PRODUCT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PRODUCT_NAME varchar(255) not null,
    FABRIC_ID uuid not null,
    PRICE_PRODUCT decimal(19, 2) not null,
    --
    primary key (ID)
)^
-- end PRACTIC_PRODUCT
-- begin PRACTIC_BRAND
create table PRACTIC_BRAND (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    FULL_NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end PRACTIC_BRAND
