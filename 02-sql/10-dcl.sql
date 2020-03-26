----------------DCL------------------
create user jdbc_usr with password 'p4ssw0rd';
create database jdbcdb;

grant all privileges on database jdbcdb to jdbc_usr;

grant all privileges on database postgres to jdbc_usr;