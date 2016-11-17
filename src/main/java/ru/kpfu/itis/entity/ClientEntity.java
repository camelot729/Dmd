package ru.kpfu.itis.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "clients")
public class ClientEntity extends PersonEntity{
}
