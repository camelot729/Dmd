package ru.kpfu.itis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.entity.StaffEntity;
import ru.kpfu.itis.entity.StaffProfileEntity;

import java.util.List;

@Repository
public interface StaffProfileRepository extends JpaRepository<StaffProfileEntity, Integer> {

    List<StaffProfileEntity> findAll();

    StaffProfileEntity findOneById(Integer id);

    StaffProfileEntity findByStaffEntity(StaffEntity staffEntity);

}
