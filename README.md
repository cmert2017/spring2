Spring Project Structure:

src/main/java : Contains application source code
src/main/resources : Contains non-java resources
src/test/java : Contains test code


mvnw and mwnw.cmd : These are maven wrapper scrips. You can use these scripts to build your project, even if you do not 
have Maven installed on your machine. 


pom.xml :  This is the Maven build specification

CydeoApplication.java : This is the Spring boot main class that bootstrapts the project.

application.properties : This file is initially empty but offers a place where you can specify configuration properties. 

resources/static: contains any static content(images, css, js, etc.)

resources/template : Contains template files that will be used to render the content through the browser(Thymeleaf)

CydeoApplicationtest : This is a simple test calls that ensures that the Spring application context loads successfully.
You will add moe test to the mix as you develop the application. 