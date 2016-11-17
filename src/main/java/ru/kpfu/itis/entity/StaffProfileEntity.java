package ru.kpfu.itis.entity;

import ru.kpfu.itis.entity.enums.Position;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "staff_profile")
public class StaffProfileEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "salary")
    private Integer salary;

    @ManyToOne
    @JoinColumn(name = "staff_person")
    private StaffEntity staffEntity;

    @Enumerated(EnumType.STRING)
    @Column(name = "position")
    private Position position;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "staff_interval",
            joinColumns = @JoinColumn(name = "staff_id"),
            inverseJoinColumns = @JoinColumn(name = "interval_id"))
    private List<Interval> intervals;

    @ManyToOne
    @JoinColumn(name = "office_id")
    private OfficeEntity officeId;

    @Column(name = "phone")
    private String phone;

    public List<Interval> getIntervals() {
        return intervals;
    }

    public void setIntervals(List<Interval> intervals) {
        this.intervals = intervals;
    }

    public OfficeEntity getOfficeId() {
        return officeId;
    }

    public void setOfficeId(OfficeEntity officeId) {
        this.officeId = officeId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public StaffEntity getStaffEntity() {
        return staffEntity;
    }

    public void setStaffEntity(StaffEntity staffEntity) {
        this.staffEntity = staffEntity;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
