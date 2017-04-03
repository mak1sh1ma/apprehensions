package com.metrotraffic.api.apprehensions.controllers;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.metrotraffic.api.ApiEndpoints;
import com.metrotraffic.api.ApiResponse;
import com.metrotraffic.api.apprehensions.objects.ApprehensionReport;


@RestController
public class ApprehensionsController {
	
	
	@RequestMapping(value=ApiEndpoints.REPORT_APPREHENSION, method=RequestMethod.POST)
	public ApiResponse processApprehensionReport(@RequestBody ApprehensionReport report){
		ApiResponse response=new ApiResponse();
		try{
			
		}catch(Exception ex){
			response.setApiData(null);
			response.setStatusCode("500");
			response.setStatus("Server error");;
		}
		return response;
	}
	
	@RequestMapping(value=ApiEndpoints.GET_APPREHENSION_DROPDOWNS, method=RequestMethod.GET)
	public ApiResponse getApprehensionDropdowns(@PathVariable int cityId){
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

