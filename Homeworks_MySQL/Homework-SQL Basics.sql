-- 1 --
select * from departments;

-- 2 --
select department_name from departments;

-- 3 --
select (salary/12) as 'Salary by month', 
	(salary/(12*20)) as 'Salary by Day',
	(salary/(12*24*8)) as 'Salary by Hour'
	from employees;
-- 4 --
select concat(email, '@mail.somecompany.com') as 'Full Email Address' from employees;

-- 5 --
select distinct salary from employees;

-- 6 --
select department_name as 'Departments and Locations' from departments
union select region_name from regions
union select country_name from countries
union select city from locations;

-- 7 --
select * from employees
where job_id like 'AC_MGR';

-- 8 --
select concat(first_name, ' ', last_name) as 'Full Name' from employees
where first_name like 'Sa%';

-- 9 --
select concat(first_name, ' ', last_name) as 'Full Name' from employees
where last_name like '%ei%';	

-- 10 --
select first_name, salary from employees
where salary between 3000 and 5000;	

-- 11 --
select first_name, salary from employees
where (salary between 2000 and 15000) and salary not between 5000 and 10000;

-- 12 --
select first_name, salary from employees
where salary in (2500, 4000, 5000);

-- 13 --
select * from locations
where state_province is null or postal_code is null;

-- 14 --
select * from employees
where salary > 10000 
order by salary desc;

-- 15 --
select * from employees
order by hire_date asc limit 10;

-- 16 --
select department_name, city from departments
natural join locations; 

-- 17 --
select D.department_name, L.city from departments D
join locations L using (location_id);

-- 18 --
select D.department_name, L.city from departments D
join locations L on (D.location_id = L.location_id);

-- 19 --
select D.department_name, L.city, coalesce(E.first_name, 'nema takuv') as 'Manager' from departments D
join locations L on (D.location_id = L.location_id)
left join employees E on (D.manager_id = E.employee_id);

-- 20 --
select L.city, coalesce(D.department_name, 'nema department') as 'Department' from departments D
right join locations L on (D.location_id = L.location_id);

-- 21 --
select L.city, coalesce(D.department_name, 'nema department') as 'Department' from locations L
left join departments D on (D.location_id = L.location_id);

-- 22 --
select coalesce(city,'null') as 'City', department_name 
 from departments D, locations L
 where D.location_id = L.location_id
union
select city, null as 'no department' from locations 
 where city not in (
	select city 
	from departments D, locations L
	where D.location_id = L.location_id 
 );
 
-- 23 --
select D.department_name , E.first_name as 'Manager' from departments D
 join employees E on (D.manager_id = E.employee_id);
 
-- 24 --
select D.department_name , E.first_name as 'Manager' , L.city as 'Location' from departments D
 join employees E on (D.manager_id = E.employee_id)
 join locations L on (D.location_id = L.location_id);
 
-- 25 --
select E.first_name, D.department_name, E.hire_date from employees E
join departments D on (E.department_id = D.department_id)
	where D.department_name in ('Sales' , 'Finance') and 
    E.hire_date between '1995-01-01' and '2000-01-01'
	order by E.hire_date;
    
-- 26 --

select E.* , H.job_id as 'previous job' , D.department_name as 'previous department' from employees E 
	join job_history H on (E.employee_id = H.employee_id)
    join departments D on (D.department_name = 'Sales' and H.department_id = D.department_id);

-- 27 --
select concat(E.first_name, ' ' , E.last_name) as 'Employee', 
		concat(M.first_name, ' ' , M.last_name) as 'Manager' from employees E
        join employees M on (E.manager_id = M.employee_id);
        
-- 28 --
select concat(E.first_name, ' ' , E2.last_name) as 'Crossed Names' from employees E
	cross join employees E2;
    
-- 29 -- 
select E.first_name, E.job_id, J.job_title, D.department_name, R.region_name, C.country_name, 
concat(L.city,', ', L.street_address) as ' Location' 
from employees E 
 join jobs J on (E.job_id = J.job_id)
 join departments D on (E.department_id = D.department_id)
 join locations L on (D.location_id = L.location_id)
 join countries C on (L.country_id = C.country_id)
 join regions R on (C.region_id = R.region_id);
 
-- 30 --
 
select E.first_name, coalesce(M.first_name, 'No manager') as 'Manager', J.job_title, D.department_name, R.region_name, C.country_name, 
concat(L.city,', ', L.street_address) as ' Location' 
from employees E 
 left join employees M on (E.manager_id = M.employee_id) 
 join jobs J on (E.job_id = J.job_id)
 join departments D on (E.department_id = D.department_id)
 join locations L on (D.location_id = L.location_id)
 join countries C on (L.country_id = C.country_id)
 join regions R on (C.region_id = R.region_id);
 
-- 31 --
select concat(E.first_name, ' ', E.last_name) as 'Full Name', J.job_title as 'Current Job' from job_history H1
 join job_history H2 on (H1.employee_id = H2.employee_id)
	join employees E on (E.employee_id = H1.employee_id)
	join jobs J on (J.job_id = H2.job_id)
 where H1.end_date < H2.start_date and H1.job_id = 'AC_ACCOUNT' and H2.job_id = 'AC_MGR';
	