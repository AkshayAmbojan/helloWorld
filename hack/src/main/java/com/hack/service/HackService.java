package com.hack.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.hack.helper.HotelAPI.HotelAPIRequestUtil.HotelClientRequestUtil;
import com.hack.helper.HotelAPI.HotelAPIResponseUtil.HotelClientResponseUtil;
import com.hack.helper.cachemanager.ObatainCache;
import com.hack.model.client.car.response.CarsList;
import com.hack.model.client.hotel.request.HotelSearchRQ;
import com.hack.model.client.hotel.response.FacilityHotelsClient;
import com.hack.model.services.car.response.Car;
import com.hack.model.services.car.response.CarSearchResponse;
import com.hack.model.services.hotel.hotelsearch.skyscanner.response.HotelSearchResponse;




@Component
public class HackService {
	@Value("${hotel.url}")
	private String hotelURL;
	
	@Value("${hotel.apikey}")
	private String hotelAPIkey;
	
	@Value("${car.URL}")
	private String carURL;
	
	@Autowired
	HotelClientResponseUtil hotelClientResponseUtil;
	
	@Autowired
	ObatainCache obatainCache;
	
	
	
	public FacilityHotelsClient GetHotelDetails(HotelSearchRQ hotelSearchJSONRQ){
		
		FacilityHotelsClient facilityHotelsClient =new FacilityHotelsClient();
		try{
			facilityHotelsClient=this.getHotelDetailsSkyScanner(hotelSearchJSONRQ);
			//throw new Exception();
			if(null==facilityHotelsClient.getHotels()& facilityHotelsClient.getHotels().size()<=0 ){
				throw new Exception();
			}
		}catch(Exception e){
			obatainCache.getCachedHotelSearchResponse();
		}
		
		return facilityHotelsClient;
		
		
	}
	
	/**
	 * SkyScanner hotel API
	 * @param hotelSearchJSONRQ
	 * @param facilityHotelsClient 
	 * @return
	 * @throws Exception
	 */
	private FacilityHotelsClient getHotelDetailsSkyScanner(HotelSearchRQ hotelSearchJSONRQ) throws Exception{
		  	
			FacilityHotelsClient facilityHotelsClient = new FacilityHotelsClient();
			String urlAppender="/location/{lon,lat}?market={market}&locale={locale}&checkin_date={checkin_date}&checkout_date={checkout_date}&currency={currency}&adults={adults}&rooms={rooms}&images={images}&sort={sort_method}&enhanced={enhanced}";
			HttpHeaders headers = new HttpHeaders();
		  
	        headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));
	        // Request to return XML format
	        headers.setContentType(MediaType.APPLICATION_JSON);
	        headers.set("x-user-agent","M;B2B");
	        headers.set("apikey", hotelAPIkey);
	        // HttpEntity<Employee[]>: To get result as Employee[].
	        HttpEntity<HotelSearchResponse> entity = new HttpEntity<HotelSearchResponse>(headers);
	        
	        // RestTemplate
	        RestTemplate restTemplate = new RestTemplate();
	        String location= hotelSearchJSONRQ.getGeoLocation().getLongitude()+","+hotelSearchJSONRQ.getGeoLocation().getLatitude();
	        //8.6561746,50.1065879
	        String market="ES";
	        String locale="en-GB";
	        String checkin_date=hotelSearchJSONRQ.getCheckInDate();
	        		//"2019-06-22";
	        String checkout_date=hotelSearchJSONRQ.getCheckOutDate();
	        		//"2019-07-30";
	        String currency="EUR";
	        String adults="1";
	        String rooms="1";
	        String images="3";
	        //String boost_official_partners="1";
	        String sort="-relevance";
	        String enhanced="filters,partners,images,location,amenities,extras,query_location";
	        // Send request with GET method, and Headers.
	        ResponseEntity<HotelSearchResponse> response = restTemplate.exchange(hotelURL+urlAppender,
	                HttpMethod.GET, entity, HotelSearchResponse.class,
	                location,
	                market,
	                locale,
	                checkin_date,
	                checkout_date,
	                currency,
	                adults,
	                rooms,
	                images,
	                sort,
	                enhanced
	                );
	        HttpStatus statusCode = response.getStatusCode();
	        System.out.println("Response Satus Code: " + statusCode);
	        if(response.getBody().getResults().getHotels().size()==0){
	        	response = restTemplate.exchange(hotelURL+urlAppender,
		                HttpMethod.GET, entity, HotelSearchResponse.class,
		                location,
		                market,
		                locale,
		                checkin_date,
		                checkout_date,
		                currency,
		                adults,
		                rooms,
		                images,
		                sort,
		                enhanced
		                );
	        }
			// Status Code: 200
	        if (statusCode == HttpStatus.OK ) {
		
	        	facilityHotelsClient=hotelClientResponseUtil.HotelResponseMapping(facilityHotelsClient,response.getBody().getResults().getHotels());
	        
	        }else if(response.getBody().getResults().getHotels().size()==0){
	        	throw new Exception();
	        }else{
	        	throw new Exception();
	        }
	        
			return facilityHotelsClient;
	

		}

	public List<Car> getCarSearchResponse() {
		// TODO Auto-generated method stub
		List<Car> cars= new ArrayList<Car>();
		try{
			cars=this.getcarAPISearch();
			//throw new Exception();
			
			//throw new Exception();
	
		}catch(Exception e){
			CarsList carList=obatainCache.getCachedCarResponse();
			cars=carList.getCars();
		}
		
		return cars;
	}

	private List<Car> getcarAPISearch() throws Exception{
		// TODO Auto-generated method stub
		HttpHeaders headers = new HttpHeaders();
		  List<Car> cars= new ArrayList<Car>();
        headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));
        // Request to return XML format
        headers.setContentType(MediaType.APPLICATION_JSON);

        // HttpEntity<Employee[]>: To get result as Employee[].
        HttpEntity<Car> entity = new HttpEntity<Car>(headers);
        
        // RestTemplate
        RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<CarSearchResponse> response = restTemplate.exchange(carURL,
                HttpMethod.GET, entity, CarSearchResponse.class);
		
		HttpStatus statusCode=response.getStatusCode();
		// Status Code: 200
        if (statusCode == HttpStatus.OK ) {
        	cars=response.getBody().getCars();
     
        
        }
        
		return cars;
	}
}
