alter table SALES_PRODUCT alter column PRICE rename to PRICE__U82214 ^
alter table SALES_PRODUCT alter column PRICE__U82214 set null ;
alter table SALES_PRODUCT add column AMOUNT decimal(19, 2) ^
update SALES_PRODUCT set AMOUNT = 0 where AMOUNT is null ;
alter table SALES_PRODUCT alter column AMOUNT set not null ;
