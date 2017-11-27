# springbootstarter
Spring boot starter - Java brains

#Unit -3 
Spring Initiallizer - https://start.spring.io/

Spring boot cli - https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started-installing-spring-boot.html#getting-started-installing-the-cli

extract the file --> got to the location till bin

$nano app.groovy

@RestController
class AppCtrl{
	@RequestMapping("/")
	String app(){
		"Hello World";
	}
}

save it

run ./spring run app.groovy

STS - https://spring.io/tools/sts/all

New ->Spring boot project 

#Spring Common Application Properties
https://docs.spring.io/spring-boot/docs/current/reference/html/common-application-properties.html