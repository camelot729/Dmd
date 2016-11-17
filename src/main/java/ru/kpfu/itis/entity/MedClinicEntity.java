package ru.kpfu.itis.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "med_clinic")
public class  MedClinicEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "creating_date", nullable = false)
    private Date creatingDate;

    @Column(name = "licence_number", nullable = false)
    private Integer licenceNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatingDate() {
        return creatingDate;
    }

    public void setCreatingDate(Date creatingDate) {
        this.creatingDate = creatingDate;
    }

    public Integer getLicenceNumber() {
        return licenceNumber;
    }

    public void setLicenceNumber(Integer licenceNumber) {
        this.licenceNumber = licenceNumber;
    }
}
