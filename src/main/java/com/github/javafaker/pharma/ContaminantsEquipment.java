package com.github.javafaker.pharma;

import java.util.Date;

public class ContaminantsEquipment {
	private String equipmentType; // e.g., Gas Chromatograph, Mass Spectrometer, Ion Chromatograph
	private String model;
	private String manufacturer;
	private String serialNumber;
	private int calibrationFrequency; // The frequency could be indicated in days, months, etc.
	private Date lastMaintenanceDate;
	private int maintenanceFrequency; // Similarly, frequency could be in days, months, etc.
	private String locationName;
	private String locationType;
	private String status; // e.g., Active, In Maintenance, Out of Service

	public ContaminantsEquipment(String equipmentType, String model, String manufacturer, String serialNumber,
			int calibrationFrequency, Date lastMaintenanceDate, int maintenanceFrequency, String locationName,
			String locationType, String status) {
		super();
		this.equipmentType = equipmentType;
		this.model = model;
		this.manufacturer = manufacturer;
		this.serialNumber = serialNumber;
		this.calibrationFrequency = calibrationFrequency;
		this.lastMaintenanceDate = lastMaintenanceDate;
		this.maintenanceFrequency = maintenanceFrequency;
		this.locationName = locationName;
		this.locationType = locationType;
		this.status = status;
	}

	public ContaminantsEquipment() {
		super();
	}

	public String getEquipmentType() {
		return equipmentType;
	}

	public void setEquipmentType(String equipmentType) {
		this.equipmentType = equipmentType;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public int getCalibrationFrequency() {
		return calibrationFrequency;
	}

	public void setCalibrationFrequency(int calibrationFrequency) {
		this.calibrationFrequency = calibrationFrequency;
	}

	public Date getLastMaintenanceDate() {
		return lastMaintenanceDate;
	}

	public void setLastMaintenanceDate(Date lastMaintenanceDate) {
		this.lastMaintenanceDate = lastMaintenanceDate;
	}

	public int getMaintenanceFrequency() {
		return maintenanceFrequency;
	}

	public void setMaintenanceFrequency(int maintenanceFrequency) {
		this.maintenanceFrequency = maintenanceFrequency;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getLocationType() {
		return locationType;
	}

	public void setLocationType(String locationType) {
		this.locationType = locationType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
