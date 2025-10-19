// Last updated: 2025/10/19 下午9:14:17
select name, bonus from employee left join bonus on employee.empId = bonus.empId where bonus < 1000 or bonus is null;