package com.thedevcrew.gps.service;

import com.thedevcrew.gps.entity.Data;

import java.sql.Timestamp;
import java.util.List;

public interface DataService {

    Data findOne(int id);
    List<Data> query(Long device, Timestamp from, Timestamp to);

}
