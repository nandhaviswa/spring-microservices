# spring-microservices

# common module
```sh
mvn install
```
# user service

# profile service

# mongo db
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
		}
	]
});

```
