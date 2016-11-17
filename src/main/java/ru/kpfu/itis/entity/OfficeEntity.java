package ru.kpfu.itis.entity;

import javax.persistence.*;

@Entity
@Table(name = "office")
public class OfficeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "street", nullable = false)
    private String street;

    @Column(name = "rent", nullable = false)
    private Integer rent;

    @Column(name = "pict", nullable = true)
    private String picture;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "med_clinic_id")
    private MedClinicEntity medClinicId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getRent() {
        return rent;
    }

    public void setRent(Integer rent) {
        this.rent = rent;
    }

    public MedClinicEntity getMedClinicId() {
        return medClinicId;
    }

    public void setMedClinicId(MedClinicEntity medClinicId) {
        this.medClinicId = medClinicId;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
