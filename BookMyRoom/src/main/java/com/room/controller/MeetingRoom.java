package com.room.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.room.model.Room;

@RestController
@RequestMapping("/room")
public class MeetingRoom {

	@RequestMapping(value = "/getResponse")
	public String getResponse() {
		return "BookMyRoom Application";
	}
	
	@RequestMapping(value = "/getRooms", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE)
	public List<Room> getDetails(@PathVariable String location, @PathVariable String phase) {
			
		return null; 
	}
}
