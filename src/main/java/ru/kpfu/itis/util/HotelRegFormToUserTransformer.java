package ru.kpfu.itis.util;

import ru.kpfu.itis.entity.HotelEntity;
import ru.kpfu.itis.form.HotelForm;

/**
 * Created by Kamil on 18.11.16.
 */
public class HotelRegFormToUserTransformer {
    public static HotelEntity transform(HotelForm form) {
        if (form == null)
            return null;

        HotelEntity hotelEntity = new HotelEntity();
        hotelEntity.setCountry(form.getCountry());
        hotelEntity.setCity(form.getCity());
        hotelEntity.setName(form.getName());
        return  hotelEntity;

    }
}
