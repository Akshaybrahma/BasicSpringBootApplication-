1.Firstly, I downloaded the Spring Boot project from https://start.spring.io/.
2.Then, I added four dependencies to the project:
	.Spring Web
	.Spring Boot Dev Tools
	.MySQL Driver
	.Spring Data JPA
3.Next, I created a database named "vcube" in MySQL Workbench, which is the name of the      institute where I completed my Java Full Stack Developer course.
4.In this database, I created a table named "student".
5.After that, I opened Eclipse and selected "Import" to import the downloaded Spring Boot project structure.
6.I chose "Maven" and then "Existing Maven Projects" to import the project.
7.Eclipse imported the project and built the project structure.
8.I configured the "application.properties" file as follows:
	{
	spring.datasource.url=jdbc:mysql://localhost:3807/vcube
	spring.datasource.username=root
	spring.datasource.password=root
	spring.jpa.hibernate.ddl-auto=update
	spring.jpa.show-sql=true
	spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
	}
	Note: I made changes to the application.properties file according to my requirements.
9.Then, within the "src/main/java" directory, I created a package named "b33". Inside this package, I created the following classes:
 .Controller
 .Entity
 .Service
 .Repository
10.Finally, I ran the "B33Application.java" file as a Java application and tested all the operations using Postman.
