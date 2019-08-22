alter table SALES_ORDER alter column PRICE rename to PRICE__U34237 ^
alter table SALES_ORDER alter column PRICE__U34237 set null ;
alter table SALES_ORDER add column AMOUNT decimal(19, 2) ^
update SALES_ORDER set AMOUNT = 0 where AMOUNT is null ;
alter table SALES_ORDER alter column AMOUNT set not null ;
