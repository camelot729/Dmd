package ru.kpfu.itis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.entity.OfficeEntity;

import java.util.List;

@Repository
public interface OfficeRepository extends JpaRepository<OfficeEntity, Integer>{

    List<OfficeEntity> findAll();

    OfficeEntity findOneById(Integer id);

}
