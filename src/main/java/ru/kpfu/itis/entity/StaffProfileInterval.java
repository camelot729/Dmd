package ru.kpfu.itis.entity;

import javax.persistence.*;

@Entity
@Table(name = "staff_interval")
public class StaffProfileInterval {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "staff_id")
    private StaffProfileEntity staffProfile;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "interval_id")
    private Interval interval;

    public StaffProfileInterval() {
    }

    public StaffProfileInterval(StaffProfileEntity staffProfile, Interval interval) {
        this.staffProfile = staffProfile;
        this.interval = interval;
    }

    public StaffProfileEntity getInstructorProfile() {
        return staffProfile;
    }

    public void setInstructorProfile(StaffProfileEntity staffProfile) {
        this.staffProfile = staffProfile;
    }

    public Interval getInterval() {
        return interval;
    }

    public void setInterval(Interval interval) {
        this.interval = interval;
    }
}
