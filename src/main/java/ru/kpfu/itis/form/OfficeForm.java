package ru.kpfu.itis.form;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

public class OfficeForm {

    @NotEmpty(message = "Поле не может быть пустым")
    @Size(min = 2,max = 30, message = "Максимальная длина 30 символов")
    private String city;

    @NotEmpty(message = "Поле не может быть пустым")
    @Size(min = 2,max = 30, message = "Максимальная длина 30 символов")
    private String street;

    private Integer rent;

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
}
