-- 1 --
select avg(salary) from employees E
join departments D on (E.department_id = D.department_id)
where D.department_name = 'Sales';

-- 2 --
select count(*) from employees E
join departments D on (E.department_id = D.department_id)
where D.department_name = 'Sales';

-- 3 --
select count(distinct location_id) as 'Number of locations' from departments;

-- 4 --
select count(manager_id) from departments;

-- 5 --
select count(*) from departments
where manager_id is null;

-- 6 --
select D.department_name, avg(salary) from employees E
join departments D on (E.department_id = D.department_id)
group by E.department_id;

-- 7 -- 
select D.department_name , count(E.employee_id), L.city  as 'Number of employees' from employees E
join departments D on (E.department_id = D.department_id)
join locations L on (D.location_id = L.location_id)
group by E.department_id;

-- 8 --
select M.first_name as 'Manager/Department', count(*) as 'Number of employees' from employees E 
join employees M on (E.manager_id = M.employee_id)
group by M.first_name
union 
select D.department_name , count(*) from employees E
join departments D on (E.department_id = D.department_id)
group by D.department_name;

-- 9 -- 
select M.first_name, L.city from employees E
join employees M on (E.manager_id = M.employee_id)
join departments D on (M.department_id = D.department_id)
join locations L on (L.location_id = D.location_id)
group by M.first_name 
having count(*) = 5;

-- 10 --
select R.region_name, count(employee_id) as 'Number of employees' from employees E
join departments D on (E.department_id = D.department_id)
join locations L on (D.location_id = L.location_id)
join countries C on (C.country_id = L.country_id)
join regions R on (R.region_id = C.region_id)
group by region_name;

-- 11 --
select D.department_name as 'Department/Job', count(*) as 'Number of employees' from employees E
join departments D on (E.department_id = D.department_id)
group by D.department_name
union 
select J.job_title , count(*) from jobs J
join employees E on (E.job_id = J.job_id)
group by J.job_id;

-- 12 --
select first_name, salary from employees
where salary = (select min(salary) from employees);

-- 13 --
select E.first_name, E.salary from employees E
where salary > 1.1*(select min(salary) from employees);

-- 14 --
select D.department_name, max(salary), E.first_name from employees E
join departments D on (E.department_id = D.department_id)
group by E.department_id;

-- 15 --
select concat(first_name, ' ' , last_name) as 'Full Name' from employees 
where length(last_name) = 5;

-- 16 --
select concat(first_name, ' ' , last_name) as 'Full Name' from employees 
where substr(first_name, 1,1) = substr(last_name,1,1);
  
-- 17 --
select D.department_name, coalesce( concat(E.first_name, ' ' , E.last_name) , ' No manager' ) as 'Manager'  from departments D 
left join employees E on (D.manager_id = E.employee_id);

-- 18 -
select M.first_name as 'Manager',  
	(case
		when count(E.employee_id)=0 then 'Just an employee'
		when count(E.employee_id)=1 then 'Junior Manager' 
        else count(E.employee_id)
	end) as 'Podchineni'
from employees E
right join employees M on (M.employee_id = E.manager_id)
group by M.employee_id;

-- 19 --
select date_format(now(), '%H:%i:%s %d-%m-%Y') as 'Current date';
select date_add(now(), interval 1 week) as 'Date after 1 week';

-- 20 --
create table users(
	`username` varchar(20) not null,
    `password` varchar(20),	
    `full_name` varchar(30) not null,
    `last_login_time` datetime not null default now(),
    primary key(`username`)
);

create trigger set_name before insert on users 
	for each row
		insert into users set full_name = 'N/A';

-- 21 --
create view logged_today as select * from users
	where date(now()) = date(users.last_login_time);
select * from logged_today;

-- 22 --
create table groups (
	group_id int primary key auto_increment,
	`name` varchar(30) not null unique
);

-- 23 --
alter table users 
add column group_id int,
add constraint user_group_fk foreign key (group_id) references groups(group_id);

insert into groups values(null,'ITTalents');
insert into groups values(null,'Grupichka');

update users set users.group_id = 1 
	where users.username in ('HakanBH','kichka');
    
-- 24 -- 
insert into users values('HakanBH' , '1234' , ' Hakan Hyusein', '1994-05-17 12:23:42',1);
insert into users values('sTanka', 'pass' , 'Stanka Zlateva', now(),2);
insert into users values('kichka', 'asd123', 'Kichka Bodurova', now(),1);
insert into users values('usercheto94', 'user123', 'Uti Bychvarov', now(),2);

-- 25 --
insert into users 
select email, '', concat(first_name, ' ', last_name), now(), 1 from employees;

-- 26 --
-- И 100 пъти да го изпълня, същата работа е...

-- 27 --
update users set password = null
	where date(last_login_time) < '2006-03-10';

-- 28 -- 
delete from users 
	where password is null or length(password) = 0;

-- 29 --
-- не се сещам как може да стане без връзка много към много...
create table users_in_groups (
  `users_username` VARCHAR(20) NOT NULL,
  `groups_group_id` INT(11) NOT NULL,
  primary key (`users_username`, `groups_group_id`),
  constraint  fk_users_in_groups_users1 foreign key (users_username)
    references users(username),
  constraint fk_users_in_groups_groups1 foreign key (groups_group_id)
    references groups(group_id)
);

select count(*) from users U
	join users_in_groups UG on (U.username = UG.users_username)
	where U.full_name like 's%'
    group by UG.groups_group_id;
;

-- 30 --
create table workhours(
	workhours_id int primary key auto_increment,
    `date` date,
    hours int,
    task varchar(30),
    comment varchar(50)
);

-- 31 --
alter table employees 
	add column workhours_id int,
    add constraint employee_workhours_fk foreign key (workhours_id) references workhours(workhours_id);
    
-- 32 --
insert into workhours values(null, date(now()), 8, '', '');
insert into workhours values(null, date(now()), 10,'', '');
insert into workhours values(null, date(now()), 8, '', '');
insert into workhours values(null, date(now()), 7, '', '');
insert into workhours values(null, date(now()), 6, '', '');

update employees set workhours_id = 5 where employee_id < 200;
update employees set workhours_id = 4 where employee_id < 180;
update employees set workhours_id = 3 where employee_id < 160;
update employees set workhours_id = 2 where employee_id < 140;
update employees set workhours_id = 1 where employee_id < 120;

-- 33 --
select C.country_name, avg(W.hours) from employees E
join workhours W on (E.workhours_id = W.workhours_id)
join departments D on (E.department_id = D.department_id)
join locations L on (D.location_id = L.location_id)
join countries C on (L.country_id = C.country_id)
group by C.country_name;

-- 34 --
select D.department_name from employees E
join departments D on (E.department_id = D.department_id)
join workhours W on (E.workhours_id = W.workhours_id)
where W.hours > 8 and W.date > date_sub(now(), interval 1 week) 
group by D.department_name;	

-- 35 -- 
-- пак трябва с връзка many to many ...