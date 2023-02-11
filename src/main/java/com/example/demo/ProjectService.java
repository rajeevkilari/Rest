package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {
	@Autowired
	private ProjectInterface projectInterface;

	public ProjectEntity customerData(ProjectEntity entity) {
		ProjectEntity projectEntity = new ProjectEntity();
		projectEntity.setName(entity.getName());
		projectEntity.setCity(entity.getCity());
		projectEntity.setDueAmount(entity.getDueAmount());
		return projectInterface.save(projectEntity);
	}

	public ProjectEntity updateCustomerData(ProjectEntity entity) {
		Optional<ProjectEntity> projectEntity=projectInterface.findById(entity.getID());
		if(projectEntity.isPresent()) {
			entity.setName(entity.getName());
			entity.setCity(entity.getCity());
			entity.setDueAmount(entity.getDueAmount());
			return projectInterface.save(entity);
		}else {
			return null;
		}
	}
	
	
	
	public Optional<ProjectEntity> getCustomerDataById(Integer ID) {
		Optional<ProjectEntity> projectEntity = projectInterface.findById(ID);
		if (!projectEntity.isEmpty()) {
			return projectEntity;
		} else {
			return null;
		}
	}

	public String deleteDataById(Integer ID) {
		Optional<ProjectEntity> projectEntity = projectInterface.findById(ID);
		if (!projectEntity.isPresent()) {
			return "data has already been removed from the database";
		} else {
			projectInterface.deleteById(ID);
			return "data just got removed";
		}
	}

}
