package com.hotelreservationsystem;

import org.junit.Assert;
import org.junit.Test;

public class HotelTest {
    @Test
    public void givenHotelName_And_RegularCustomerRates_ShouldAddHotel() throws Exception {
        Hotel hotel=new Hotel();
        hotel.setHotelName("LakeWood");
        hotel.setRegularCustomerRates(110);
        Assert.assertEquals("LakeWood",hotel.getHotelName());
        Assert.assertEquals(110,hotel.getRegularCustomerRates());
    }
    @Test
    public void givenHotelName_AsEmpty_ShouldThrow_NullPointerException() throws Exception{
        Hotel hotel=new Hotel();
        hotel.setHotelName("");
        Assert.assertEquals("",hotel.getHotelName());
    }
    @Test
    public void givenRegularCustomerRate_AsZero_ShouldThrow_Exception() throws Exception{
        Hotel hotel=new Hotel();
        hotel.setRegularCustomerRates(0);
        Assert.assertEquals(0,hotel.getRegularCustomerRates());
    }
}
