# Write your MySQL query statement below

select b.unique_id,E.name from Employees as E LEFT OUTER JOIN EmployeeUNI as b on E.id=b.id;