package com.metrotraffic.api.licenses.objects;

import java.util.List;
import java.util.Map;

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
	
	public List<LicensesEntity> findLicenseRecordByLicenseNumber(String licenseNumber) throws Exception{
		SimpleJdbcCall procCall=new SimpleJdbcCall(jdbcTemplate).withProcedureName("FIND_LICENSE_RECORD").returningResultSet("license", new LicensesMapper());
		MapSqlParameterSource paramSource=new MapSqlParameterSource();
		paramSource.addValue("licenseNumber", licenseNumber);
		Map<String, Object> result=procCall.execute(paramSource);
		return (List<LicensesEntity>)result.get("license");
		
	}

	
}

