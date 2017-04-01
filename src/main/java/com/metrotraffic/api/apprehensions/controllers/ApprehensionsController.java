package com.metrotraffic.api.apprehensions.controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.metrotraffic.api.ApiEndpoints;
import com.metrotraffic.api.ApiResponse;


@RestController
public class ApprehensionsController {
	
	
	@RequestMapping(value=ApiEndpoints.REPORT_APPREHENSION, method=RequestMethod.POST)
	public ApiResponse processApprehensionReport(){
		ApiResponse response=new ApiResponse();
		try{
			
		}catch(Exception ex){
			response.setApiData(null);
			response.setStatusCode("500");
			response.setStatus("Server error");;
		}
		return response;
	}
	
}

