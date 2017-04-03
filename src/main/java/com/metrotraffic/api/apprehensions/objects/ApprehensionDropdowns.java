package com.metrotraffic.api.apprehensions.objects;

import java.util.List;

public class ApprehensionDropdowns {
	private List<Violations> violations;
	private List<VehicleTypes> vehicleTypes;
	public List<Violations> getViolations() {
		return violations;
	}
	public void setViolations(List<Violations> violations) {
		this.violations = violations;
	}
	public List<VehicleTypes> getVehicleTypes() {
		return vehicleTypes;
	}
	public void setVehicleTypes(List<VehicleTypes> vehicleTypes) {
		this.vehicleTypes = vehicleTypes;
	}
}
