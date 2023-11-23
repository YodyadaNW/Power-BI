--2113110189 Yodyada Sooksangjun

--1
select distinct job_id
from employees;

--2
select employee_id || ',' || first_name||','||last_name||','||email||
        ',' || phone_number ||','||hire_date||','||job_id||','||
        salary||',,'||department_id as the_output
from employees;

--3
select last_name, salary
from employees
where salary not BETWEEN 5000 AND 12000;

--4
select last_name, job_id, hire_date
from employees
where last_name in ('Matos','Taylor');

--5
select last_name, department_id
from employees
where department_id in (20,50)
ORDER BY last_name ;

--6
select last_name
from employees
where last_name like '%a%'
AND last_name like '%e%';