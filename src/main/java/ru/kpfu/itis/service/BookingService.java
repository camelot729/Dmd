package ru.kpfu.itis.service;

import ru.kpfu.itis.form.BookingForm;

import java.util.List;

/**
 * Created by Kamil on 16.11.16.
 */
public interface BookingService {

    List getBookingByUserId(Integer user);
    List getBookingByHotelId(Integer hotel);
    List getBookingByHotelId2(Integer hotel);
    List getBookingByHotelId3(Integer hotel);
    List getHotelIdByUserId(Integer user);
    List takeNameHotelByHotelId(Integer id);
    List takeBookingId(Integer id);
    void safeNewBooking(BookingForm form);
}
