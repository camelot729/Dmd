package ru.kpfu.itis.form;

import org.hibernate.validator.constraints.NotBlank;
import ru.kpfu.itis.entity.enums.Sex;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.Date;

public class ProfileForm {

    private String position;

    private Date hireDate;

    private Date dateOfBirth;

    private Integer salary;

    @NotBlank(message = "Поле обязательно для заполнения")
    private String phone;

    private String email;

    @Enumerated(EnumType.STRING)
    private Sex sex;

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
}
