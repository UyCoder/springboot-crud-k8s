drop table if exists tbl_employees;

create table tbl_employees (
    id int auto_increment primary key,
    first_name varchar(250) not null,
    last_name varchar(250) not null,
    email varchar(250) default null
);