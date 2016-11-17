package ru.kpfu.itis.util;


import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import ru.kpfu.itis.entity.StaffEntity;
import ru.kpfu.itis.entity.enums.Role;
import ru.kpfu.itis.form.RegistrationForm;

import java.util.Objects;

public class StaffRegFormToUserTransformer {

    static BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public static StaffEntity transform(RegistrationForm form) {
        if (form == null || (!Objects.equals(form.getPassword(), form.getRepassword()))) {
            return null;
        }
        StaffEntity user = new StaffEntity();
        user.setFirstname(form.getFirstname());
        user.setSurname(form.getSurname());
        user.setEmail(form.getEmail());
        user.setLogin(form.getLogin());
        user.setSex(form.getSex());
        user.setPassword(encoder.encode(form.getPassword()));
        user.setRole(Role.ROLE_STAFF);
        return user;
    }
}
