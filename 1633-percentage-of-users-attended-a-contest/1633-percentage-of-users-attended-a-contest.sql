# Write your MySQL query statement below

select Register.contest_id,round(((count(Register.contest_id)/3)*100),2) as percentage from Users join Register on Users.user_id=Register.user_id Group by Register.contest_id order by round(((count(Register.contest_id)/3)*100),2) DESC ,Register.contest_id ASC ;