package com.metrotraffic.api.licenses.objects;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlParameter;
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
		return jdbcTemplate.query("CALL FIND_LICENSE_RECORD(?)", new Object[]{licenseNumber}, new LicensesMapper());
		
	}

	
}
