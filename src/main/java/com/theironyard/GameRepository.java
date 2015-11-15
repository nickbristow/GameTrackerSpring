package com.theironyard;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by DrScott on 11/13/15.
 */
public interface GameRepository extends CrudRepository<Game, Integer>{
    List<Game> findBySystemOrderByNameAsc(String system);

    @Query("SELECT g FROM Game g WHERE LOWER(name) LIKE '%' || LOWER(?) || '%'")
    List<Game> searchByName(String search);
}
