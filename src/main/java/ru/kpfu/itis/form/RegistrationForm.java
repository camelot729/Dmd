package ru.kpfu.itis.form;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import ru.kpfu.itis.entity.enums.Role;
import ru.kpfu.itis.entity.enums.Sex;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class RegistrationForm {
    @NotEmpty(message = "Поле не может быть пустым")
    @Size(max = 30, message = "Максимальная длина 30 символов")
    private String surname;

    @NotEmpty(message = "Поле не может быть пустым")
    @Size(max = 30, message = "Максимальная длина 30 символов")
    private String firstname;

    @Pattern(message = "Поле должно содержать латинские символы или цифры", regexp = "^[a-zA-Z0-9_-]{3,16}")
    private String login;

    @Size(min = 6, message = "Минимальная длина пароля 6 символов")
    private String password;

    @Size(min = 6, max = 24, message = "Пароль неверной длины")
    private String repassword;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Enumerated(EnumType.STRING)
    private Sex sex;


//    @Enumerated(EnumType.STRING)
//    private Sex sex;

    @NotEmpty(message = "Поле не может быть пустым")
    @Email(message = "Невалидный email")
    private String email;

//    private String city;


    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRepassword() {
        return repassword;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

}
