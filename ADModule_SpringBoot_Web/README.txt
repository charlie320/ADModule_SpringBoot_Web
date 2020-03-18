You must add the file "application.properties" to the "src/main/resources" source folder.
The database parameters are for MySQL with port 3306.
Modify these values for your particular database.

Include the following statements:
spring.mvc.view.prefix=/WEB-INF/views/
spring.mvc.view.suffix=.jsp

spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/name_of_your_database?serverTimezone=UTC&createDatabaseIfNotExist=true&useUnicode=yes&characterEncoding=UTF-8
spring.datasource.username=your_database_username
spring.datasource.password=your_database_password