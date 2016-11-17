package ru.kpfu.itis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kpfu.itis.entity.ClientEntity;
import ru.kpfu.itis.form.ReceptionForm;
import ru.kpfu.itis.form.RegistrationForm;
import ru.kpfu.itis.repository.ClientRepository;
import ru.kpfu.itis.service.ClientService;
import ru.kpfu.itis.service.StaffService;
import ru.kpfu.itis.util.ClientRegFormToUserTransformer;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    ClientRepository clientRepository;

    @Autowired
    StaffService staffService;

    @Override
    @Transactional
    public void saveNewClient(RegistrationForm form) {
        ClientEntity clientEntity = ClientRegFormToUserTransformer.transform(form);
        clientRepository.save(clientEntity);
    }

    @Override
    public ClientEntity getClientEntityById(Integer id) {
        return clientRepository.findOneById(id);
    }

    @Override
    public ClientEntity getClientEntityByLogin(String login) {
        return clientRepository.findOneByLogin(login);
    }

    @Override
    public void changeInterval(ReceptionForm form) {

    }


}
