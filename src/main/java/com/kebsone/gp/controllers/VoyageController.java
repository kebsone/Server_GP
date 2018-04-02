package com.kebsone.gp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kebsone.gp.business.Voyage;
import com.kebsone.gp.repository.VoyageRepository;



@RestController
@RequestMapping("/api")
public class VoyageController {
	@Autowired
	private VoyageRepository voyageRepository;
	/**
	 * 
	 * @return list of travels
	 */
	@GetMapping("/voyages")
	public List<Voyage> getAllVoyages(){
		return voyageRepository.findAll();
	}
	/**
	 * 
	 * @param id
	 * @return on travel 
	 */
	@GetMapping("/voyage/{id}")
	public Voyage getVoyage(@PathVariable Integer id) {
		return voyageRepository.findById(id).get();
	}
	
	/**
	 * 
	 * @param voyage
	 * @return the created travel
	 */
	@PostMapping("/voyage")
	public Voyage createVoyage(@PathVariable Voyage voyage) {
		return voyageRepository.save(voyage);
	}
	/**
	 * 
	 * @param id
	 * @return true when the travel is deleted
	 */
	@DeleteMapping("/voyage/{id}")
	public boolean deleteVoyage(@PathVariable Integer id) {
		 voyageRepository.deleteById(id);
		 return true;
	}
	/**
	 * 
	 * @param voyage
	 * @return updated travel
	 */
	
	@PutMapping("/voyage")
	public Voyage updateVoyage(@PathVariable Voyage voyage) {
		 return voyageRepository.save(voyage);
		 
	}

}
