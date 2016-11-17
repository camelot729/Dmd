package ru.kpfu.itis.util;


import ru.kpfu.itis.entity.MedClinicEntity;
import ru.kpfu.itis.entity.OfficeEntity;
import ru.kpfu.itis.form.OfficeForm;

public class OfficeRegFormToUserTransformer {

    public static OfficeEntity transform(OfficeForm form, MedClinicEntity clinicEntity, Integer id) {
        if (form == null) {
            return null;
        }
        OfficeEntity officeEntity = new OfficeEntity();
        officeEntity.setId(id);
        officeEntity.setCity(form.getCity());
        officeEntity.setStreet(form.getStreet());
        officeEntity.setRent(form.getRent());
        officeEntity.setMedClinicId(clinicEntity);
        return officeEntity;
    }
}
