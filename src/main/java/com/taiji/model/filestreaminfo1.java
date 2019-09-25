package com.taiji.model;

import javax.xml.bind.annotation.XmlElement;

public class filestreaminfo1 {
    @XmlElement(name="file_stream")
    public String getFile_stream() {
        return file_stream;
    }

    public void setFile_stream(String file_stream) {
        this.file_stream = file_stream;
    }

    String file_stream;

}
