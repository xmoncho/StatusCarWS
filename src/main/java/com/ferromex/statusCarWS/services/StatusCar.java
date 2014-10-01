package com.ferromex.statusCarWS.services;

public interface StatusCar {
	
	public eStatus getStatus(String initial, int number, String city, String state);
}
