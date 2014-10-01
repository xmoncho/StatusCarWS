package com.ferromex.statusCarWS.services;

public enum eStatus {
    RELEASED(0),
    NO_LOGISTIC(1),
    IN_LOGISTIC_POOL(2),
    IN_LOGISTIC_IC(3),
    IN_LOGISTIC_OV(4);
    
    private int value;
    
    private eStatus(int value){
        this.value = value;
    }
    
    public int getValue(){
        return this.value;
    }

    @Override
    public String toString() {
        return Integer.toString(this.value);
    }
}
