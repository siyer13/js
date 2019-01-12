package com.workwave.jsonparser.JsonParser;

/**
 * Hello world!
 *
 */
public class Customer {
	private String id;
	private String status;
	private String severity;
	private String responsibility;
	private String locationAddress;
	private String locationCode;
	private MyInteger orderID;
	private String area;
	private String areaHierarchy;
	private String name;
	private String openSince;
	private String lastInspected;
	private String isResolved;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSeverity() {
		return severity;
	}

	public void setSeverity(String severity) {
		this.severity = severity;
	}

	public String getResponsibility() {
		return responsibility;
	}

	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}

	public String getLocationAddress() {
		return locationAddress;
	}

	public void setLocationAddress(String locationAddress) {
		this.locationAddress = locationAddress;
	}

	public String getLocationCode() {
		return locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public MyInteger getorderID() {
		return orderID;
	}

	public void setorderID(MyInteger orderID) {
		this.orderID = orderID;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getAreaHierarchy() {
		return areaHierarchy;
	}

	public void setAreaHierarchy(String areaHierarchy) {
		this.areaHierarchy = areaHierarchy;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOpenSince() {
		return openSince;
	}

	public void setOpenSince(String openSince) {
		this.openSince = openSince;
	}

	public String getLastInspected() {
		return lastInspected;
	}

	public void setLastInspected(String lastInspected) {
		this.lastInspected = lastInspected;
	}

	public String getIsResolved() {
		return isResolved;
	}

	public void setIsResolved(String isResolved) {
		this.isResolved = isResolved;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", status=" + status + ", severity=" + severity + ", responsibility="
				+ responsibility + ", locationAddress=" + locationAddress + ", locationCode=" + locationCode
				+ ", orderID=" + orderID + ", area=" + area + ", areaHierarchy=" + areaHierarchy + ", name=" + name
				+ ", openSince=" + openSince + ", lastInspected=" + lastInspected + ", isResolved=" + isResolved + "]";
	}

}
