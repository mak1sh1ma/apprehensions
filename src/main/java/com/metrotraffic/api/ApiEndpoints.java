package com.metrotraffic.api;

public class ApiEndpoints {
	
	
	//ApprehensionsController
	public static final String REPORT_APPREHENSION="/apprehensions/report";
	public static final String GET_APPREHENSION_DROPDOWNS="/apprehensions/{cityId}/dropdowns";
	
	//LicensesController
	public static final String SEARCH_DRIVER="/licenses/{licenseNumber}/find";
	
}

