package com.metrotraffic.api.apprehensions.objects;

import java.util.Date;

public class ApprehensionReport {

		private int cityId;
		private int enforcerId;
		private String vehiclePlateNumber;
		private String vehicleLicenseNumber;;
		private Date apprehensionDateTime;
		private String apprehensionLocation;
		private String offenderFirstName;
		private String offenderMiddleName;
		private String offenderLastName;
		private Date offenderBday;
		private String offenderAddress;
		private String offenderMobileNumber;
		private int vehicleType;
		private String vehicleColor;
		private String vehicleDescription;
		private String offenderLicenseNumber;
		private int licenseRestriction;
		private Date licenseExpiration;
		private boolean isOffenderMinor;
		private String guardianName;
		
		public int getCityId() {
			return cityId;
		}
		public void setCityId(int cityId) {
			this.cityId = cityId;
		}
		public int getEnforcerId() {
			return enforcerId;
		}
		public void setEnforcerId(int enforcerId) {
			this.enforcerId = enforcerId;
		}
		public String getVehiclePlateNumber() {
			return vehiclePlateNumber;
		}
		public void setVehiclePlateNumber(String vehiclePlateNumber) {
			this.vehiclePlateNumber = vehiclePlateNumber;
		}
		public String getVehicleLicenseNumber() {
			return vehicleLicenseNumber;
		}
		public void setVehicleLicenseNumber(String vehicleLicenseNumber) {
			this.vehicleLicenseNumber = vehicleLicenseNumber;
		}
		public Date getApprehensionDateTime() {
			return apprehensionDateTime;
		}
		public void setApprehensionDateTime(Date apprehensionDateTime) {
			this.apprehensionDateTime = apprehensionDateTime;
		}
		public String getApprehensionLocation() {
			return apprehensionLocation;
		}
		public void setApprehensionLocation(String apprehensionLocation) {
			this.apprehensionLocation = apprehensionLocation;
		}
		public String getOffenderFirstName() {
			return offenderFirstName;
		}
		public void setOffenderFirstName(String offenderFirstName) {
			this.offenderFirstName = offenderFirstName;
		}
		public String getOffenderMiddleName() {
			return offenderMiddleName;
		}
		public void setOffenderMiddleName(String offenderMiddleName) {
			this.offenderMiddleName = offenderMiddleName;
		}
		public String getOffenderLastName() {
			return offenderLastName;
		}
		public void setOffenderLastName(String offenderLastName) {
			this.offenderLastName = offenderLastName;
		}
		public Date getOffenderBday() {
			return offenderBday;
		}
		public void setOffenderBday(Date offenderBday) {
			this.offenderBday = offenderBday;
		}
		public String getOffenderAddress() {
			return offenderAddress;
		}
		public void setOffenderAddress(String offenderAddress) {
			this.offenderAddress = offenderAddress;
		}
		public String getOffenderMobileNumber() {
			return offenderMobileNumber;
		}
		public void setOffenderMobileNumber(String offenderMobileNumber) {
			this.offenderMobileNumber = offenderMobileNumber;
		}
		public int getVehicleType() {
			return vehicleType;
		}
		public void setVehicleType(int vehicleType) {
			this.vehicleType = vehicleType;
		}
		public String getVehicleColor() {
			return vehicleColor;
		}
		public void setVehicleColor(String vehicleColor) {
			this.vehicleColor = vehicleColor;
		}
		public String getVehicleDescription() {
			return vehicleDescription;
		}
		public void setVehicleDescription(String vehicleDescription) {
			this.vehicleDescription = vehicleDescription;
		}
		public String getOffenderLicenseNumber() {
			return offenderLicenseNumber;
		}
		public void setOffenderLicenseNumber(String offenderLicenseNumber) {
			this.offenderLicenseNumber = offenderLicenseNumber;
		}
		public int getLicenseRestriction() {
			return licenseRestriction;
		}
		public void setLicenseRestriction(int licenseRestriction) {
			this.licenseRestriction = licenseRestriction;
		}
		public Date getLicenseExpiration() {
			return licenseExpiration;
		}
		public void setLicenseExpiration(Date licenseExpiration) {
			this.licenseExpiration = licenseExpiration;
		}
		public boolean isOffenderMinor() {
			return isOffenderMinor;
		}
		public void setOffenderMinor(boolean isOffenderMinor) {
			this.isOffenderMinor = isOffenderMinor;
		}
		public String getGuardianName() {
			return guardianName;
		}
		public void setGuardianName(String guardianName) {
			this.guardianName = guardianName;
		}
}
