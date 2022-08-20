# spring-microservices

## common module
```sh
mvn install
```

## user module
- Update the MongoDb host and other details. (Same for profile service as well)
```diff
# subl userservice/src/main/resources/application.yml:6
-      uri: mongodb://userservice:userservice@127.0.0.1:27017/userservice?authSource=userservice
+      uri: mongodb://userservice:userservice@172.17.0.2:27017/userservice?authSource=userservice
```

## spring boot

```sh
clear && mvn clean spring-boot:run
```

## mongo db
```sh
docker pull mongo:4.4
docker run -d --name spring-mongo -e MONGO_INITDB_ROOT_USERNAME=root -e MONGO_INITDB_ROOT_PASSWORD=root mongo:4.4
docker logs spring-mongo
docker exec -it spring-mongo /bin/sh
docker inspect spring-mongo | grep IPAddress

mongo -uroot -proot --authenticationDatabase admin
mongo -uuserservice -puserservice --authenticationDatabase userservice
mongo --host '172.17.0.2' -uuserservice -puserservice --authenticationDatabase userservice

```
```js
use userservice;
db.createUser({
	user: 'userservice',
	pwd: 'userservice',
	roles: [
		{
			role: 'dbAdmin',
			db: 'userservice'
		},
		{
			role: 'readWrite',
			db: 'userservice'
		}
	]
});

```
