package ru.kpfu.itis.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import ru.kpfu.itis.entity.BookingEntity;
import ru.kpfu.itis.form.BookingForm;

import java.util.List;

/**
 * Created by Kamil on 16.11.16.
 */
public interface BookingService {

    List getBookingByUserId(Integer user);
    List getBookingByHotelId(Integer hotel);
    List getHotelIdByUserId(Integer user);
    List takeNameHotelByHotelId(Integer id);
    void safeNewBooking(BookingForm form);
}
