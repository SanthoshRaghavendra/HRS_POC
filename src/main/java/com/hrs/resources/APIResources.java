package com.hrs.resources;

public enum APIResources {

	
	
	/*
	 * @Description : TelcoScore
	 */
	
	
	  logInAccessTokenAPI_EndPoint("/v1/tokens"),
	  confirmAllMedGatewayAPI_Endpoints("/v1/medications"),
	  newMedicationFromEMRModalNotifications_Endpoints("/apiv2/notifications"),
	  prescribedMedicationsPost_Endpoints("/v1/prescribed-medications");
	
	  
	private String resource;

	APIResources(String resource) {
		this.resource = resource;
	}

	public String getResource() {
		return resource;
	}

}