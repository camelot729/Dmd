package ru.kpfu.itis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kpfu.itis.entity.Interval;

@Repository
public interface IntervalRepository extends JpaRepository<Interval, Integer>{
}
