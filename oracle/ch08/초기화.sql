-- sqlDB 초기화
drop user sqlDB cascade;
create user sqlDB identified by 1234
    default tablespace users
    temporary tablespace temp;
grant connect, resource, dba to sqlDB;

