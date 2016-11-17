package ru.kpfu.itis.entity;

import javax.persistence.*;

/**
 * Created by Kamil on 17.11.16.
 */
@Entity
@Table(name = "room_category")
public class RoomCategoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column (name = "id", nullable = false)
    private int id;

    @Column(name = "id_room", nullable = false)
    private int room;

    @Column(name = "capacity", nullable = false)
    private int capacity;

    @Column(name = "price", nullable = false)
    private int price;

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
