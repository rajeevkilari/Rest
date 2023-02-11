package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {
	@Autowired
	private ProjectService projectService;

	@PostMapping("/CustomerData")
	public ProjectEntity customerData(@RequestBody ProjectEntity entity) {
		return projectService.customerData(entity);
	}

	@GetMapping("/CustomerData/{ID}")
	public Optional<ProjectEntity> getCustomerDataById(@PathVariable Integer ID) {
		return projectService.getCustomerDataById(ID);
	}

	@DeleteMapping("/Deletedata/{ID}")
	public String deleteDataById(@PathVariable Integer ID) {
		return projectService.deleteDataById(ID);
	}

	@PutMapping("/updateCustomerData")
	public ProjectEntity updateCustomerData(@RequestBody ProjectEntity entity) {
		return projectService.updateCustomerData(entity);
	}

}
