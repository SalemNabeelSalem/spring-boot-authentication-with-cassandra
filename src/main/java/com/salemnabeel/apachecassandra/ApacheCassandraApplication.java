package com.salemnabeel.apachecassandra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@SpringBootApplication
@EnableCassandraRepositories(basePackages = { "com.salemnabeel.apachecassandra" })
public class ApacheCassandraApplication {

	public static void main(String[] args) {

		SpringApplication.run(ApacheCassandraApplication.class, args);
	}
}