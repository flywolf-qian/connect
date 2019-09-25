package com.taiji.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name="certificate")

public class certificateinfo {
    certificateinfo1 certificateinfoS;
    String  filestream;
    List<bjnodeinfo1> node;
@XmlElement(name="head")
    public certificateinfo1 getCertificateinfoS() {
        return certificateinfoS;
    }

    public void setCertificateinfoS(certificateinfo1 certificateinfoS) {
        this.certificateinfoS = certificateinfoS;
    }
   @XmlElement(name="node")
    public List<bjnodeinfo1> getNode() {
        return node;
    }
    public void setNode(List<bjnodeinfo1> node) {
        this.node = node;
    }
@XmlElement(name="file_stream")
public String  getFilestream() {
    return filestream;
}

    public void setFilestream(String  filestream) {
        this.filestream = filestream;
    }


}
