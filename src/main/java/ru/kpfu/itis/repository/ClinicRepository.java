package ru.kpfu.itis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kpfu.itis.entity.MedClinicEntity;

public interface ClinicRepository extends JpaRepository<MedClinicEntity, Integer> {

    MedClinicEntity findOneById(Integer id);

}
