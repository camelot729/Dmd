package ru.kpfu.itis.util;

import ru.kpfu.itis.entity.StaffEntity;
import ru.kpfu.itis.form.ProfileForm;

public class StaffEntityEditForm {

    public static StaffEntity transform(ProfileForm form, StaffEntity staffEntity) {
        if (form == null) {
            return null;
        }

        staffEntity.setSex(form.getSex());
        staffEntity.setEmail(form.getEmail());

        return staffEntity;
    }

}
