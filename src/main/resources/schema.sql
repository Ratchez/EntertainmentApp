DROP TABLE IF EXISTS Movie;
CREATE TABLE Movie (
id INT PRIMARY KEY,
name VARCHAR(50) NOT NULL,
language VARCHAR(50) NOT NULL,
type VARCHAR(50) NOT NULL,
rate Double,
imageUrl VARCHAR(50) NOT NULL
);