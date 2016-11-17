package ru.kpfu.itis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.entity.*;
import ru.kpfu.itis.form.BookingForm;
import ru.kpfu.itis.repository.impl.BookingRepositoryImpl;
import ru.kpfu.itis.service.BookingService;
import ru.kpfu.itis.service.HotelService;
import ru.kpfu.itis.util.BookingRegFormToUserTransformer;
import ru.kpfu.itis.util.ClientRegFormToUserTransformer;

import java.sql.Date;
import java.util.List;

/**
 * Created by Kamil on 16.11.16.
 */
@Service
public class BookingServiceImpl implements BookingService {
    @Autowired
    BookingRepositoryImpl bookingRepository;

    @Autowired
    HotelService hotelService;

    @Override
    public List<BookingEntity> getBookingByUserId(Integer id) {
        return bookingRepository.findAllHotelsByUserId(id);
    }

    @Override
    public List<BookingEntity> getBookingByHotelId(Integer id) {
        return bookingRepository.findAllUserssByHotelId(id);
    }

    @Override
    public List getBookingByHotelId2(Integer hotel) {
        return bookingRepository.findAllUserssByHotelId2(hotel);
    }

    @Override
    public List getBookingByHotelId3(Integer hotel) {
        return bookingRepository.findAllUserssByHotelId3(hotel);
    }

    @Override
    public List getHotelIdByUserId(Integer user) {
        return bookingRepository.findAllHotelIdByUserId(user);
    }

    @Override
    public List takeNameHotelByHotelId(Integer id) {
        return bookingRepository.takeNameHotelByHotelId(id);
    }

    @Override
    public List takeBookingId(Integer id) {
        return bookingRepository.takeBookingId(id);
    }


    @Override
    public void safeNewBooking(BookingForm form) {

        BookingEntity bookingEntity = BookingRegFormToUserTransformer.transform(form);
        bookingRepository.save(bookingEntity);

//        BookingEntity bookingEntity = BookingRegFormToUserTransformer.transform(form);
//        bookingRepository.save(bookingEntity);
    }
}
