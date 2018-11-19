package com.abrarzahin.landon.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<com.abrarzahin.landon.data.entity.Room,Long> {
    com.abrarzahin.landon.data.entity.Room findByNumber(String number);
}
