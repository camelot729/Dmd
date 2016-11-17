package ru.kpfu.itis.util;


import ru.kpfu.itis.entity.enums.Role;
import ru.kpfu.itis.form.RegistrationForm;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import ru.kpfu.itis.entity.ClientEntity;

import java.util.Objects;

public class ClientRegFormToUserTransformer {

    static BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public static ClientEntity transform(RegistrationForm form) {
        if (form == null || (!Objects.equals(form.getPassword(), form.getRepassword()))) {
            return null;
        }

        ClientEntity user = new ClientEntity();
        user.setFirstname(form.getFirstname());
        user.setSurname(form.getSurname());
        user.setEmail(form.getEmail());
        user.setLogin(form.getLogin());
        user.setPassword(encoder.encode(form.getPassword()));
        user.setRole(Role.ROLE_CLIENT);
        user.setSex(form.getSex());
        return user;
    }
}
