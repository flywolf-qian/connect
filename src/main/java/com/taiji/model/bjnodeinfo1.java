package com.taiji.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


public class bjnodeinfo1 {
    String title;
    String key;
    String value;

    public bjnodeinfo1(String title,String key,String value)
    {
        this.key=key;
        this.value=value;
        this.title=title;
    }
@XmlElement(name="title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @XmlElement(name="key")
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
    @XmlElement(name="value")
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
