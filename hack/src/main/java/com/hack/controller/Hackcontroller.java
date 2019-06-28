package com.hack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hack.model.client.hotel.request.HotelSearchRQ;
import com.hack.service.HackService;

@RestController("/")
public class Hackcontroller {
	
	@Autowired
	HackService hackService;
	
	@PostMapping("/hotelsearchrq")
	public Object getHotelSearchResponse(@RequestBody HotelSearchRQ hotelSearchJSONRQ) {
		return hackService.GetHotelDetails(hotelSearchJSONRQ);
	}
	
	
	@GetMapping("/carsearchrq")
	public Object getCarSearchResponse() {
		return hackService.getCarSearchResponse();
	}

}
