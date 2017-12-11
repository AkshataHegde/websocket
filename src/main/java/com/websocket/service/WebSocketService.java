package com.websocket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.websocket.entity.Name;
import com.websocket.repository.NameRepository;

@Service
public class WebSocketService implements WebSocketServiceInt {
	
	@Autowired
	private NameRepository nameRepository;
	
	@Override
	public String addName(String user_name)
	{
		try
		{
			Name name=new Name();
			System.out.println(user_name);
			name.setUserName(user_name);
			nameRepository.save(name);
		
			return "name added successfully";
		}
		catch(Exception e)
		{
			throw e;
		}
	}

}
