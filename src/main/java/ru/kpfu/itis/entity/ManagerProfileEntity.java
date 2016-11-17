package ru.kpfu.itis.entity;

import javax.persistence.*;

/**
 * Created by Kamil on 17.11.16.
 */

@Entity
@Table(name = "manager_file")
public class ManagerProfileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "hotel_id")
    private Integer hotel;

    @Column(name = "staff_id")
    private Integer staff;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHotel() {
        return hotel;
    }

    public void setHotel(Integer hotel) {
        this.hotel = hotel;
    }

    public Integer getStaff() {
        return staff;
    }

    public void setStaff(Integer staff) {
        this.staff = staff;
    }
}
