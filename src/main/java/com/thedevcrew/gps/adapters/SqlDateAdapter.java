package com.thedevcrew.gps.adapters;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SqlDateAdapter extends XmlAdapter<String, java.sql.Timestamp> {

    final private SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");

    @Override
    public String marshal(java.sql.Timestamp sqlDate) throws Exception {
        if(null == sqlDate) {
            return null;
        }
        return formatter.format(new java.util.Date(sqlDate.getTime()));
    }

    @Override
    public java.sql.Timestamp unmarshal(String utilDate) throws Exception {
        if(null == utilDate) {
            return null;
        }
        return new java.sql.Timestamp(formatter.parse(utilDate).getTime());
    }

}