CREATE TABLE user
(ID INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
Username VARCHAR(255) NOT NULL UNIQUE,
email VARCHAR(255) NOT NULL UNIQUE,
password VARCHAR(255) NOT NULL);
COMMENT='User list'