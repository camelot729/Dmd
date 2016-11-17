package ru.kpfu.itis.entity;

import javax.persistence.*;
import javax.print.attribute.IntegerSyntax;
import java.sql.Date;
import java.util.stream.Stream;

/**
 * Created by Kamil on 16.11.16.
 */
@Entity
@Table(name = "booking")
public class BookingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "user_id", nullable = false)
    private Integer user;

    @Column(name = "room_id", nullable = false)
    private int room;

    @Column(name = "hotel_id", nullable = false)
    private Integer hotel;

    @Column(name = "arrived", nullable = false)
    private Date arrived;

    @Column(name = "departe" , nullable = false)
    private Date departe;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user_id) {
        this.user = user_id;
    }

    public Integer getHotel() {
        return hotel;
    }

    public void setHotel(Integer hotel_id) {
        this.hotel = hotel_id;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public Date getDeparte() {
        return departe;
    }

    public void setDeparte(Date departe) {
        this.departe = departe;
    }

    public Date getArrived() {
        return arrived;
    }

    public void setArrived(Date arrived) {
        this.arrived = arrived;
    }
}
