``` sh
cd /home/nandha/Downloads/spring-microservices/userservice
cd /home/nandha/Downloads/spring-microservices/profileservice

clear; git status; git branch

git add . && git commit -m 'rename of class for better understanding...'

git diff > diff.diff && subl diff.diff

clear && mvn -Dtest=ClassificationValidatorTest#should_return_errorlist_on_name_eq_null test
clear && mvn clean test
clear && mvn clean test spring-boot:run
clear && mvn spring-boot:run
clear && mvn clean package -Dmaven.test.skip=true

rm -rf .idea *.iml *.diff
rm -rf ~/.m2


mongo admin --authenticationDatabase "admin" -u "root" -p "root"
mongo userservice --authenticationDatabase "userservice" -u "userservice" -p "userservice"
```

```javascript
show dbs
use userservice;
db.createUser({
    user: "userservice",
    pwd: "userservice",
    roles: [{
        role: "readWrite",
        db: "userservice"
    }],
});
db.getUser("userservice");

db.dropUser("userservice");
db.dropDatabase();
```