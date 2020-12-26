package com.cyber;

import com.cyber.repository.Regionepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import javax.xml.transform.sax.SAXSource;

@SpringBootApplication
public class DerivedqueriesApplication {

	@Autowired
	Regionepository regionepository;
	public static void main(String[] args) {
		SpringApplication.run(DerivedqueriesApplication.class, args);
	}


	@PostConstruct
	public void testRegions(){
		System.out.println("=====================Regions start here=====================");
		System.out.println("getBy Country: " + regionepository.getByCountry("Canada"));






		System.out.println("=====================Regions end here=====================");
	}
}
