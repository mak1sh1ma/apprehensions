package com.metrotraffic.api.licenses.objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

import com.metrotraffic.api.licenses.mappers.LicensesMapper;

@Component
public class LicensesDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void findLicenseRecordByLicenseNumber(String licenseNumber) throws Exception{
		SimpleJdbcCall storedProcCall=new SimpleJdbcCall(jdbcTemplate).withProcedureName("FIND_LICENSE_RECORD");
		MapSqlParameterSource params=new MapSqlParameterSource();
		params.addValue("licenseNumber", licenseNumber);
		SqlParameterSource param=params;
		storedProcCall.execute(param, "license", new LicensesMapper());
		
	}

	
}
