package com.ferromex.statusCarWS.services.endpoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import com.ferromex.statusCarWS.services.StatusCar;
import com.ferromex.statusCarWS.services.StatusCarRequest;
import com.ferromex.statusCarWS.services.StatusCarResponse;
import com.ferromex.statusCarWS.services.eStatus;

@Endpoint
public class StatusCarEndpoint {
	private static final String TARGET_NAMESPACE = "http://ferromex.com/statusCarWS/services";
	
	@Autowired
	private StatusCar statusCar_i;
	
	@PayloadRoot(localPart="StatusCar", namespace=TARGET_NAMESPACE)
	public @ResponsePayload StatusCarResponse getStatus(@RequestPayload StatusCarRequest request) {
		StatusCarResponse response = new StatusCarResponse();
		eStatus status = statusCar_i.getStatus(request.getInitial(), request.getNumber(), request.getCity(), request.getState());
		response.setStatus(status);
		return response;
	}
	
	public void setStatusCar(StatusCar statusCar) {
		this.statusCar_i = statusCar;
	}
}
