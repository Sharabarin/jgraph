alter table PRACTIC_FABRIC add constraint FK_PRACTIC_FABRIC_ON_USER foreign key (USER_ID) references SEC_USER(ID);
create index IDX_PRACTIC_FABRIC_ON_USER on PRACTIC_FABRIC (USER_ID);
