package com.ferromex.statusCarWS.services;

import org.springframework.stereotype.Service;

@Service	
public class StatusCarImpl implements StatusCar {

	public eStatus getStatus(String initial, int number, String city, String state) {
		// TODO Auto-generated method stub
		return eStatus.RELEASED;
	}
}
