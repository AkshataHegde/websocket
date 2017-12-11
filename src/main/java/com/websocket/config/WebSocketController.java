package com.websocket.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.websocket.bean.Greeting;
import com.websocket.bean.HelloMessage;
import com.websocket.service.WebSocketServiceInt;

@Controller
//@Service
//@EnableAutoConfiguration
public class WebSocketController {

	@Autowired
	private WebSocketServiceInt webSocketServiceInt;
	
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws Exception {
        Thread.sleep(1000); // simulated delay
        String result=webSocketServiceInt.addName(message.getName());
        return new Greeting(message.getName() + result);
    }

}
