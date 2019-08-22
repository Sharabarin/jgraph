alter table SALES_PRODUCT alter column AMOUNT rename to AMOUNT__U72917 ^
alter table SALES_PRODUCT alter column AMOUNT__U72917 set null ;
alter table SALES_PRODUCT add column PRICE decimal(19, 2) ^
update SALES_PRODUCT set PRICE = 0 where PRICE is null ;
alter table SALES_PRODUCT alter column PRICE set not null ;
