alter table PRACTIC_SHOP add constraint FK_PRACTIC_SHOP_ON_BRAND foreign key (BRAND_ID) references PRACTIC_BRAND(ID);
create index IDX_PRACTIC_SHOP_ON_BRAND on PRACTIC_SHOP (BRAND_ID);
