package org.martynas.blogapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMvcBlogAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMvcBlogAppApplication.class, args);
    }

    // Start internal H2 server so we can query the DB from IDE
//    @Bean(initMethod = "start", destroyMethod = "stop")
//    public Server inMemoryH2DatabaseServer() throws SQLException {
//        return Server.createTcpServer("-tcp", "-tcpAllowOthers", "-tcpPort", "9092");
//    }
}
