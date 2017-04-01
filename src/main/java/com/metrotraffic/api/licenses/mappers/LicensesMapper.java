package com.metrotraffic.api.licenses.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.metrotraffic.api.licenses.objects.LicensesEntity;

public class LicensesMapper implements RowMapper<LicensesEntity>{

	public LicensesEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		return null;
	}

}
