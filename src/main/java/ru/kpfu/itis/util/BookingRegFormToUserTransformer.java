package ru.kpfu.itis.util;

import ru.kpfu.itis.entity.BookingEntity;
import ru.kpfu.itis.entity.ClientEntity;
import ru.kpfu.itis.entity.HotelEntity;
import ru.kpfu.itis.form.BookingForm;
import ru.kpfu.itis.form.HotelForm;

/**
 * Created by Kamil on 16.11.16.
 */
public class BookingRegFormToUserTransformer {
    public static BookingEntity transform(BookingForm form){
        if (form == null)
            return null;
        BookingEntity bookingEntity = new BookingEntity();
        bookingEntity.setUser(form.getUser());
        bookingEntity.setHotel(form.getHotel());
        bookingEntity.setRoom(form.getRoom());
        bookingEntity.setArrived(form.getArrived());
        bookingEntity.setDeparte(form.getDeparte());
        return bookingEntity;
    }
}
