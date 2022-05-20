# Write your MySQL query statement below
with 
    a AS
    (select name, population, area
        from world
        where area >= 3000000),
    b AS
    (select name, population, area
        from world
        where population >= 25000000)
select * from a
union
select * from b
;