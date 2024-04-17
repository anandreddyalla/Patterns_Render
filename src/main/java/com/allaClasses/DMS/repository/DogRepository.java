package com.allaClasses.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.allaClasses.DMS.Models.Dog;

/**
 * @author Ananda Reddy Alla
 */

public interface DogRepository extends CrudRepository<Dog, Integer>{
	
	List<Dog> findByName(String name);


}
