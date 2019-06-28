package com.hack.helper.cachemanager;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hack.model.client.car.response.CarsList;
import com.hack.model.client.hotel.response.FacilityHotelsClient;
import com.hack.model.services.car.response.Car;

@Component
public class ObatainCache {

	
	
	public FacilityHotelsClient getCachedHotelSearchResponse() {
		
		try {
			File file = new ClassPathResource("json/HotelAPI/HotelApiRS.json").getFile();
			byte[] data = Files.readAllBytes(file.toPath());
			ObjectMapper objectMapper = new ObjectMapper();
			
			FacilityHotelsClient facilityHotelClientHotels = objectMapper.readValue(data,FacilityHotelsClient.class);
			
			return facilityHotelClientHotels;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

	public CarsList getCachedCarResponse() {
		try {
			File file = new ClassPathResource("json/CarAPI/CarApiRS.json").getFile();
			byte[] data = Files.readAllBytes(file.toPath());
			ObjectMapper objectMapper = new ObjectMapper();
			
			CarsList carList = objectMapper.readValue(data,CarsList.class);
			
			return carList;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	
	
	
}
