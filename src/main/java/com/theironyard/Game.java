package com.theironyard;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;
import java.util.List;

/**
 * Created by DrScott on 11/13/15.
 */
@Entity

public class Game{
    @Id
    @GeneratedValue
    Integer id;

    String name;
    String system;

    @ManyToOne
    User user;
}
