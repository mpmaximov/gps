package com.thedevcrew.gps.service.impl;

import com.thedevcrew.gps.dao.DataDao;
import com.thedevcrew.gps.entity.Data;
import com.thedevcrew.gps.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class DataServiceImpl implements DataService {

    @Autowired
    private DataDao dao;

    @Override
    public Data findOne(int id) {
        return dao.findOne(id);
    }

    @Override
    public List<Data> query(Long device, Timestamp from, Timestamp to) {
        return dao.query(device, from, to);
    }
}
