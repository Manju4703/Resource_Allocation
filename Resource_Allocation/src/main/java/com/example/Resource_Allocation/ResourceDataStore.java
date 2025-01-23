package com.example.Resource_Allocation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class ResourceDataStore {
	
	    public static List<Resource> getSampleResources() {
	        List<Resource> resources = new ArrayList<>();
	        resources.add(new Resource(1, "Dennis", "Java, Spring, JMS, MySQL, Angular, React, Node.js, Web services, Docker", 4));
	        resources.add(new Resource(2, "Thompson", "Java, Redis, Oracle, React, Angular, JavaScript, REST API", 7));
	        resources.add(new Resource(3, "Kim", "Java, JSP, Spring, Oracle, MySQL,PostgreSQL mango,REST API,Web services, Docker, Redis", 12));
	        resources.add(new Resource(4, "Aisha", "Angular, React, Spring, JavaScript, Node.js, REST API, Web services, Docker, MySQL, PostgreSQL", 9));
	        resources.add(new Resource(5, "Maya", "Spring, Spring Boot, Hibernate, MySQL, PostgreSQL, Node.js, Python", 5));
	        resources.add(new Resource(6, "Kumar", "Java, Redis, JavaScript", 3));
	        return resources;
	    }
	
}
