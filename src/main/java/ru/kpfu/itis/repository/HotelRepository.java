package ru.kpfu.itis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.entity.HotelEntity;

import java.util.List;

/**
 * Created by Kamil on 16.11.16.
 */
@Repository
public interface HotelRepository extends JpaRepository<HotelEntity, Integer>{
    List<HotelEntity> findAll();
    List<HotelEntity> findAllById(Integer id);

    HotelEntity findOneById(Integer id);

}
