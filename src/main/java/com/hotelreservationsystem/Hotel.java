package com.hotelreservationsystem;

public class Hotel {
    private String hotelName;
    private int regularCustomerRates;

    public Hotel(){ }

    //getter method for regular customer rate
    public int getRegularCustomerRates() {
        return regularCustomerRates;
    }
    //setter method for regular customer rate
    public void setRegularCustomerRates(int regularCustomerRates) throws Exception {
        try{
            if(regularCustomerRates==0)
                throw new Exception("The customer regular rates is not passed!");
            this.regularCustomerRates = regularCustomerRates;
        } catch (Exception e) {
            throw e;
        }
    }
    //getter method for hotel name
    public String getHotelName() {
        return hotelName;
    }
    //setter method for hotel name
    public void setHotelName(String hotelName) throws Exception {
        try{
            if(hotelName.isEmpty())
                throw new Exception("The hotel name is empty!");
            this.hotelName=hotelName;
        } catch (NullPointerException e) {
            throw e;
        }
    }
}