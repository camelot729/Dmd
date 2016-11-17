package ru.kpfu.itis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.entity.StaffEntity;

import java.util.List;

@Repository
public interface StaffRepository extends JpaRepository<StaffEntity, Long> {

    List<StaffEntity> findAll();

    StaffEntity findOneByLogin(String login);

    StaffEntity findOneById(Integer id);


    void deleteById(Integer id);
}
