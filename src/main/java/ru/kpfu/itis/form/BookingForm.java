package ru.kpfu.itis.form;

import java.sql.Date;

/**
 * Created by Kamil on 16.11.16.
 */
public class BookingForm {
    private Integer user;
    private Integer hotel;
    private Integer room;
    private Date arrived;
    private Date departe;

    public void setHotel(Integer hotel) {
        this.hotel = hotel;
    }

    public Date getArrived() {
        return arrived;
    }

    public void setArrived(Date arrived) {
        this.arrived = arrived;
    }

    public Date getDeparte() {
        return departe;
    }

    public void setDeparte(Date departe) {
        this.departe = departe;
    }

    public Integer getHotel() {
        return hotel;
    }

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public Integer getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }
}
