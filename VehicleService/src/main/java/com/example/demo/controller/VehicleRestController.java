
package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.Vehicle;
import com.example.demo.repository.VehicleRepo;


@RestController
@CrossOrigin(origins="http://localhost:4200")
public class VehicleRestController {
	@Autowired
	VehicleRepo repo;

	@GetMapping("/vehicle/view")
	public List<Vehicle> view() {

		return repo.findAll();
	}

	@PostMapping("/vehicle/insert")
	public Vehicle insert(@RequestBody Vehicle vehicle) {

		return repo.save(vehicle);
	}
	
	@PostMapping("/vehicle/update")
	public Vehicle update(@RequestBody Vehicle vehicle) {

		return repo.save(vehicle);
	}
	
	@DeleteMapping("/vehicle/delete/{id}")
	public List<Vehicle> delete(@PathVariable Integer id) {

		repo.deleteById(id);
		return repo.findAll();
	}
	

}
