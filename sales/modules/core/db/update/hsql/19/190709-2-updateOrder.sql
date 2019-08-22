alter table SALES_ORDER alter column AMOUNT rename to AMOUNT__U51356 ^
alter table SALES_ORDER alter column AMOUNT__U51356 set null ;
alter table SALES_ORDER add column PRICE decimal(19, 2) ^
update SALES_ORDER set PRICE = 0 where PRICE is null ;
alter table SALES_ORDER alter column PRICE set not null ;
