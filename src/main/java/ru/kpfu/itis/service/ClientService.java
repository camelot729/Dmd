package ru.kpfu.itis.service;

import ru.kpfu.itis.entity.ClientEntity;
import ru.kpfu.itis.form.ReceptionForm;
import ru.kpfu.itis.form.RegistrationForm;

public interface ClientService {

    ClientEntity getClientEntityById(Integer id);

    ClientEntity getClientEntityByLogin(String login);

    void changeInterval(ReceptionForm form);

    void saveNewClient(RegistrationForm form);

}
