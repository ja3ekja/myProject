package com.epam.app.models;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * Created by jacek on 21.04.17.
 */
@Entity

@Table(name = "userRegistration")
public class UserRegistration {

    @Id
    @GeneratedValue
    private long id;
    @OneToMany(fetch = FetchType.LAZY)
    private LocalDateTime dateTime;

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn
    private User user;
}
