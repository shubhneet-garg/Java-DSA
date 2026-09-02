-- # Write your MySQL query statement below
-- SELECT
-- CASE 
-- WHEN id % 2 = 1 && id != (SELECT MAX(id) FROM Seat)
-- THEN ID + 1 
-- WHEN ID % 2 = 0
-- THEN id - 1
-- ELSE ID
-- END AS id, student
-- FROM Seat
-- ORDER BY id


SELECT CASE
WHEN id % 2 = 1 && id != (SELECT MAX(id) FROM Seat)
THEN id + 1
WHEN id % 2 = 0
THEN id - 1
ELSE id
END AS id, student
FROM Seat
ORDER BY id