package com.metrotraffic.api.licenses.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.metrotraffic.api.licenses.objects.LicensesEntity;

public class LicensesMapper implements RowMapper<LicensesEntity>{

	public LicensesEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
		LicensesEntity license=new LicensesEntity();
		license.setAddress(rs.getString("address"));
		license.setBirthDay(rs.getDate("birth_day"));
		license.setFullName(rs.getString("driverName"));
		license.setGender(rs.getString("gender"));
		license.setId(rs.getInt("id"));
		license.setLicenseNumber(rs.getString("license_number"));
		license.setLicenseRestriction(rs.getInt("restriction"));
		license.setNationality(rs.getString("nationality"));
		return license;
	}

}
