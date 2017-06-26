package com.thedevcrew.gps.controller;

import com.thedevcrew.gps.adapters.ListData;
import com.thedevcrew.gps.entity.Data;
import com.thedevcrew.gps.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@RestController
public class GpsController {

    @Autowired
    private DataService ds;

    @RequestMapping(value = "/api/api1.php", method = RequestMethod.GET, produces = { "application/xml", "text/xml" })
    @ResponseBody
    public ResponseEntity<Data> getResult(@RequestParam("key") String key, @RequestParam("id") int id) {
        return new ResponseEntity<Data>(ds.findOne(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/api/api.php", method = RequestMethod.GET, produces = { "application/xml", "text/xml" })
    @ResponseBody
    public ResponseEntity<ListData> getList(@RequestParam("key") String key, @RequestParam("device") Long id, @RequestParam("from") Timestamp from, @RequestParam("to") Timestamp to) {
        return new ResponseEntity<ListData>(new ListData(ds.query(id, from, to)), HttpStatus.OK);
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        return "ok";
    }

}
