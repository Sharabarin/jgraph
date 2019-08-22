-- alter table PRACTIC_SHOP add column BRAND_ID uuid ^
-- update PRACTIC_SHOP set BRAND_ID = <default_value> ;
-- alter table PRACTIC_SHOP alter column BRAND_ID set not null ;
alter table PRACTIC_SHOP add column BRAND_ID uuid not null ;
