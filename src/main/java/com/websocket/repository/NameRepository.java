package com.websocket.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.websocket.entity.Name;

@Repository
public interface NameRepository extends CrudRepository<Name,Long> {
	
	

}
