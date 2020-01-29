# Seata example

springboot + springcloud + mybatis + seata

```
$ docker run -e MYSQL_ROOT_PASSWORD=123456 -e MYSQL_DATABASE=seata-account -p 3306:3306 mysql:5.7.8
$ docker run -e MYSQL_ROOT_PASSWORD=123456 -e MYSQL_DATABASE=seata-inventory -p 3306:3306 mysql:5.7.8
$ docker run -e MYSQL_ROOT_PASSWORD=123456 -e MYSQL_DATABASE=seata-order -p 3306:3306 mysql:5.7.8
```
