package com.job.joblisting;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.job.joblisting.repository.PostRepository;


@SpringBootApplication

public class JoblistingApplication {

	

	public static void main(String[] args) {
		SpringApplication.run(JoblistingApplication.class, args);
	}
	
	 @Bean
	    CommandLineRunner runner(PostRepository repo) {
	        return args -> {
	            System.out.println("MongoDB test count: " + repo.count());
	        };
	    }

}
