package com.kebsone.gp;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.kebsone.gp.business.Voyage;
import com.kebsone.gp.repository.VoyageRepository;

@SpringBootApplication
public class ServeurGpApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServeurGpApplication.class, args);
	}
 
//	@Override
//	 public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		
//		voyageRepository.save(new Voyage(new Date(), "Dakar", "Paris"));
//		voyageRepository.save(new Voyage(new Date(), "Dakar", "TLS"));
//
//		voyageRepository.save(new Voyage(new Date(), "Dakar", "Marseille"));
//
//		voyageRepository.save(new Voyage(new Date(), "Dakar", "Bordeaux"));
//
//	}
}
