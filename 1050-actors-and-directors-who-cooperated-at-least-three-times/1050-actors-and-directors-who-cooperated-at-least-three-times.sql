# Write your MySQL query statement below

SELECT ac.actor_id, ac.director_id
FROM ActorDirector AS ac
GROUP BY ac.actor_id, ac.director_id
HAVING Count(timestamp) > 2;
