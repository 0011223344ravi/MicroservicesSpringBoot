# MicroservicesSpringBoot
created basic microservices using spring cloud (Eureka Netflix,RestTemplate)
1.created the user-service and contact-service EurekaClientService and ApiGatway microservices

2.contact-service is called from the user-service using RestTemplate.

3.EurekaClientService to resgister the both (user-service and contact-service) to Eureka server.


![image](https://user-images.githubusercontent.com/22918656/177038897-8de067db-ed55-457e-a16f-dcf04574f3d2.png)

4.creating ApiGateway and calling both of the microservice using that.
