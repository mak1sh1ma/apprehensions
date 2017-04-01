package com.metrotraffic.api.licenses.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.metrotraffic.api.ApiEndpoints;
import com.metrotraffic.api.ApiResponse;
import com.metrotraffic.api.licenses.objects.LicensesDAO;

@RestController
public class LicensesController {

	@Autowired
	LicensesDAO licensesDAO;
	
	@RequestMapping(value=ApiEndpoints.SEARCH_DRIVER, method=RequestMethod.GET)
	public ApiResponse findLicense(@PathVariable String licenseNumber){
		ApiResponse response=new ApiResponse();
		try{
			licensesDAO.findLicenseRecordByLicenseNumber(licenseNumber);
		}catch(Exception ex){
			response.setApiData(null);
			response.setStatusCode("500");
			response.setStatus("Server error");;
		}
		return response;
		
	}
}
