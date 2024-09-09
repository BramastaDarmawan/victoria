--select concat(e.first_name, ' ' , e.last_name) as full_name, 
--	e.hire_date, s.salary 
--from employees e 
--join departments d on e.department_id = d.id 
--join salaries s on e.id = s.employee_id 
--where d."name" = 'IT'
--order by s.salary asc ;

--select concat(e.first_name, ' ' , e.last_name) as full_name, 
--	s.salary, d."name" 
--from employees e 
--join departments d on e.department_id = d.id 
--join salaries s on e.id = s.employee_id 
--order by s.salary desc 
--limit 5;

--select concat(e.first_name, ' ' , e.last_name) as full_name,
--	e.hire_date,
--	count(p.employee_id) as total_promotions
--from employees e 
--join promotions p ON e.id = p.employee_id 
--join salaries s on e.id = s.employee_id 
--where (s.effective_date - e.hire_date) > 365*3
--group by e.id 
--having count(p.employee_id) >= 1
--order by e.hire_date asc;

--select d."name", count(e.department_id) as total_employee
--from departments d 
--join employees e ON d.id = e.department_id 
--group by d."name" 
--order by count(e.department_id) asc ;

--select concat(e.first_name, ' ' , e.last_name) as full_name,
--	e.hire_date
--from employees e
--left join promotions p on e.id = p.id
--where p.id is null;

--select d."name", avg(s.salary) as average_salary 
--from departments d 
--join employees e ON d.id = e.department_id
--join salaries s on e.id = s.employee_id 
--group by d."name";

--select concat(e.first_name, ' ' , e.last_name) as full_name,
--	e.hire_date, d."name", s.effective_date, (s.effective_date - e.hire_date) as long_working
--from employees e
--join departments d on d.id = e.department_id
--join salaries s on e.id = s.employee_id
--order by (s.effective_date - e.hire_date) desc 

--select count(distinct p.employee_id) as total_employee_promotions
--from promotions p
--where p.promotion_date >= current_date - 365; 

--select d."name",
--	max(s.salary) as highest_salary,
--	min(s.salary) as lowest_salary
--from departments d
--join employees e on d.id = e.department_id
--join salaries s  on e.id = s.employee_id
--group by d."name";

--select concat(e.first_name, ' ' , e.last_name) as full_name,
--	s.salary, d."name"
--from employees e
--join departments d on e.department_id = d.id
--join salaries s on e.id = s.employee_id
--where 
--	s.salary > (
--		select avg(salaries2.salary)
--		from employees as employee2
--		join salaries as salaries2 on employee2.id = salaries2.employee_id
--		where employee2.department_id = e.department_id);

--select d."name", sum(s.salary) as total_salary 
--from departments d 
--join employees e ON d.id = e.department_id
--join salaries s on e.id = s.employee_id 
--group by d."name";

--select e.id , concat(e.first_name, ' ' , e.last_name) as full_name,
--	count(p.employee_id) as total_promotions
--from employees e
--join promotions p on e.id = p.employee_id
--group by e.id, full_name
--having count(p.employee_id) > 1
--order by e.id asc;

--select concat(e.first_name, ' ' , e.last_name) as employee_name,
--		s.salary as salary,
--		p.new_salary as new_salary
--from employees e
--join salaries s on e.id = s.employee_id
--join promotions p on e.id = p.employee_id
--where new_salary > (salary * 1.2);

-- select concat(e.first_name, ' ' , e.last_name) as employee_name,
-- 	concat(e2.first_name, ' ', e2.last_name) as manager_name,
-- 	d."name"
-- from employees e 
-- join departments d on e.department_id = d.id
-- join employees e2 on d.manager_id = e2.id
-- where date_part('year', e.hire_date) = date_part('year', e2.hire_date);
 
--select 	
--		max(average_salary) as highest_avg_salary, 
--		min(average_salary) as lowest_avg_salary
--from 	(select d."name" as department_name, avg(s.salary) as average_salary 
--		from departments d 
--		join employees e ON d.id = e.department_id
--		join salaries s on e.id = s.employee_id 
--		group by d."name") as dept;


--WITH DepartmentSalaries AS (
--    SELECT 
--        d.name as departement_name,
--        AVG(s.salary) AS average_salary
--    FROM 
--        departments d
--    JOIN 
--        employees e ON d.id = e.department_id
--    JOIN 
--        salaries s ON e.id = s.employee_id
--    GROUP BY 
--        d.name
--)
--SELECT 
--    departement_name,
--    average_salary
--FROM 
--    DepartmentSalaries
--WHERE 
--    average_salary = (SELECT MAX(average_salary) FROM DepartmentSalaries)
--UNION
--SELECT 
--    departement_name,
--    average_salary
--FROM 
--    DepartmentSalaries
--WHERE 
--    average_salary = (SELECT MIN(average_salary) FROM DepartmentSalaries);
