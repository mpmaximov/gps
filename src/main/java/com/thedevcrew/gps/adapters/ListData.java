package com.thedevcrew.gps.adapters;

import com.thedevcrew.gps.entity.Data;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "KGKXML")
@XmlAccessorType(XmlAccessType.FIELD)
public class ListData {
    @XmlElement(name = "state")
    private List<Data> list;
    @XmlAttribute
    final private String version = "1.01";

    public ListData() {
    }

    public ListData(List<Data> list) {
        this.list = list;
    }

    public List<Data> getList() {
        return list;
    }
    public void setList(List<Data> list) {
        this.list = list;
    }
}
