package ru.kpfu.itis.util;

import ru.kpfu.itis.entity.OfficeEntity;
import ru.kpfu.itis.entity.StaffEntity;
import ru.kpfu.itis.entity.StaffProfileEntity;
import ru.kpfu.itis.entity.enums.Position;
import ru.kpfu.itis.form.ProfileForm;

public class ProfileStaffEditForm {

    public static StaffProfileEntity transform(ProfileForm form, StaffProfileEntity staffProfile,
                                               StaffEntity staffEntity, OfficeEntity officeEntity) {
        if (form == null) {
            return null;
        }

        if (staffProfile == null) {
            staffProfile = new StaffProfileEntity();
        }


        staffProfile.setStaffEntity(staffEntity);
        staffProfile.setPosition(Position.valueOf(form.getPosition()));
        if (form.getSalary() != null) {
            staffProfile.setSalary(form.getSalary());
        }
        staffProfile.setOfficeId(officeEntity);
        staffProfile.setPhone(form.getPhone());
        return staffProfile;
    }

}
