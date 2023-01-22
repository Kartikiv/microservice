client side
eureka.client.serviceUrl.defaultZone=http://localhost:8761/eureka/
spring.application.name={somename}
@EnableDiscoveryClient
server side
eureka.instance.hostname=localhost
eureka.client.register-with-eureka=false
eureka.client.fetch-registry=false
eureka.client.serviceUrl.defaultZone=http://localhost:8761/eureka/
server.port=8761
@EnableEurekaServer


add we need to cofigure the resttemplate and @LoadBalenced
public class ConfigRestTemplate {
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemp() {
		return new RestTemplate();
	}
  now we can set the custom url
  http://PRODUCT-SERVICE/product/
  add make calls 
