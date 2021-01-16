package com.cyber;

import com.cyber.repository.CinemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CinemappApplication {
	@Autowired
	CinemaRepository cinemaRepository;

	public static void main(String[] args) {
		SpringApplication.run(CinemappApplication.class, args);
	}

	@PostConstruct
	public void testCinema(){
		System.out.println(cinemaRepository.fetchAllByNameOrSponsoredName("Hall 2 - EMPIRE", "").toString());
	}
}
