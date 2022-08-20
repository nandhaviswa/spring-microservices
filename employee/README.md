# Sample Employee Spring boot

### Installation
* Clone the [MySQL Sample Employee Database](https://dev.mysql.com/doc/employee/en/employees-installation.html)
```sh
git clone https://github.com/datacharmer/test_db.git
cd test_db-master

docker run -d -v test_db-master:/tmp/test_db-master:ro --name employees-mysql -e MYSQL_ROOT_PASSWORD=root mysql:8.0
docker exec -it employees-mysql /bin/sh
cd /tmp/test_db-master
mysql -uroot -proot
```
```sql
DROP DATABASE IF EXISTS `employees`;
CREATE DATABASE `employees`;

DROP USER IF EXISTS 'employees'@'%';
CREATE USER 'employees'@'%' IDENTIFIED WITH mysql_native_password BY 'employees';
GRANT ALL PRIVILEGES ON *.* TO 'employees'@'%' WITH GRANT OPTION;
```
```sh
mysql -uemployees -pemployees -t < employees.sql

docker run -d --name employees-adminer adminer

docker inspect employees-mysql | grep IPAddress
docker inspect employees-adminer | grep IPAddress
```

