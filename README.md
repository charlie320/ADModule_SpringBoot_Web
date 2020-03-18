# ADModule_SpringBoot_Web
Spring Boot web application with login/registration using Java JPA

You must add the file "application.properties" to the "src/main/resources" source folder.

Include the following:
spring.mvc.view.prefix=/WEB-INF/views/
spring.mvc.view.suffix=.jsp

spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/name_of_your_database?serverTimezone=UTC&createDatabaseIfNotExist=true&useUnicode=yes&characterEncoding=UTF-8
spring.datasource.username=your_database_username
spring.datasource.password=your_database_password
