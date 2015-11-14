package com.theironyard;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.List;

/**
 * Created by DrScott on 11/13/15.
 */
@Entity
public class User {
    @Id
    @GeneratedValue
    Integer id;

    String name;
    String password;

    @ManyToOne
    List<Game> games;
}
