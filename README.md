# spring-cloud-config-repo
Spring Cloud Config Repo

1 - Run SpringCloudConfigServerApplication
2. Run SpringConfigMovieApplication
Test  http://localhost:8083/movie
The Movie name  & year  are coming  from https://github.com/sezayirdagtekin/ms-config-repo/blob/master/movie-micro-service.yml

1. Run  SpringbootConfigApplication
2. Test  http://localhost:8080/greeting and 
     http://localhost:8080/email
     The data is comming from https://github.com/sezayirdagtekin/ms-config-repo/blob/master/application.yml

    
 if you chanage configuration repo:  https://github.com/sezayirdagtekin/ms-config-repo/
 You have to refresh to see confih changes or re-start microservices
 
     http://localhost:8080/actuator/refresh
     
     http://localhost:8083/actuator/refresh

