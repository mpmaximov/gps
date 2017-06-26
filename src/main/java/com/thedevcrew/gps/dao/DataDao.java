package com.thedevcrew.gps.dao;

import com.thedevcrew.gps.entity.Data;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.sql.Timestamp;
import java.util.List;

public interface DataDao extends CrudRepository<Data, Integer> {

    @Query("select d from Data d where imei=:device and dt>=:from and dt<=:to order by dt asc")
    public List<Data> query(@Param("device") Long device, @Param("from") Timestamp from, @Param("to") Timestamp to);

}
