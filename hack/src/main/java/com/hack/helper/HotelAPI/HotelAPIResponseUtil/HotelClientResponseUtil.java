package com.hack.helper.HotelAPI.HotelAPIResponseUtil;

import java.util.List;

import org.springframework.stereotype.Component;
import com.hack.model.client.hotel.response.FacilityHotelsClient;
import com.hack.model.services.hotel.hotelsearch.skyscanner.response.Hotel;

@Component
public class HotelClientResponseUtil {

	public FacilityHotelsClient HotelResponseMapping (FacilityHotelsClient facilityHotelsClient, List<Hotel> hotels){
		facilityHotelsClient.setHotels(hotels);
		return facilityHotelsClient;
		
	}
}
