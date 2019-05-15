package com.sample;

public class Associates {

	private int employeeId;
	private String employeeName;
	private int unixMCQResult;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getUnixMCQResult() {
		return unixMCQResult;
	}

	public void setUnixMCQResult(int unixMCQResult) {
		this.unixMCQResult = unixMCQResult;
	}

	public Associates(int employeeId, String employeeName, int unixMCQResult) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.unixMCQResult = unixMCQResult;
	}

	public String toString() {
		return employeeId + "$" + employeeName + "$" + unixMCQResult;
	}
}
