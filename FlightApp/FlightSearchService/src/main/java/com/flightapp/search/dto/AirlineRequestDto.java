package com.flightapp.search.dto;

import java.util.List;

import com.flightapp.search.entity.Flight;

import lombok.Data;

@Data
public class AirlineRequestDto {

	private String airlineName;
	
	
	private String airlineCode;
	
	private String status;
	

	private Integer flightCount;
	
	
	private Long ContactNumber;
	
	
	private String websiteUrl;
	
	
	private List<Flight> flightList;
}
