CREATE USER 'info'@'localhost' IDENTIFIED BY 'g4sGfdTbT23';
CREATE USER 'info'@'%' IDENTIFIED BY 'g4sGfdTbT23';

CREATE DATABASE info CHARACTER SET utf8 COLLATE utf8_general_ci;

GRANT ALL PRIVILEGES ON info.* TO 'info'@'localhost';
GRANT ALL PRIVILEGES ON info.* TO 'info'@'%';

CREATE USER 'info_user'@'localhost' IDENTIFIED BY 'tmuL4svR76d';
CREATE USER 'info_user'@'%' IDENTIFIED BY 'tmuL4svR76d';

GRANT DELETE ON info.* TO 'info_user'@'localhost';
GRANT DELETE ON info.* TO 'info_user'@'%';
GRANT INSERT ON info.* TO 'info_user'@'localhost';
GRANT INSERT ON info.* TO 'info_user'@'%';
GRANT SELECT ON info.* TO 'info_user'@'localhost';
GRANT SELECT ON info.* TO 'info_user'@'%';
GRANT UPDATE ON info.* TO 'info_user'@'localhost';
GRANT UPDATE ON info.* TO 'info_user'@'%';