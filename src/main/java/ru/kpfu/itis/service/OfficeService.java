package ru.kpfu.itis.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import ru.kpfu.itis.entity.OfficeEntity;
import ru.kpfu.itis.form.OfficeForm;

public interface OfficeService {

    Page<OfficeEntity> getAllOffices(PageRequest pageRequest);

    OfficeEntity getOfficeById(Integer id);

    void saveNewOffice(OfficeForm form);

}
