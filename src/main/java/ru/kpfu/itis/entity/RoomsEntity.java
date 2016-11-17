package ru.kpfu.itis.entity;

import javax.persistence.*;

/**
 * Created by Kamil on 17.11.16.
 */
@Entity
@Table(name = "rooms")
public class RoomsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable = false)
    private int id;

    @Column(name = "number",nullable = false)
    private int number;

    @Column(name = "idHotel", nullable = false)
    private int hotel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getHotel() {
        return hotel;
    }

    public void setHotel(int hotel) {
        this.hotel = hotel;
    }
}
