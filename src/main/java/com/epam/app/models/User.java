package com.epam.app.models;

import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

/**
 * Created by jacek on 21.04.17.
 */
@Entity
public class User {

    @Type(type = "uuid-char")
    @Id @GeneratedValue
    private UUID uuid;
    private String firstName;
    private String lastName;
    private long number;
    private int age;
    private String adressStreet;
    private String adressCity;
    private String adressPostalCode;

    public User() {
    }
}
