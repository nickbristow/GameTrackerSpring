package com.theironyard;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Created by DrScott on 11/13/15.
 */
@Entity
public class Game {
    @Id
    @GeneratedValue
    Integer id;

    String name;
    String system;


}
