package com.taiji.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name="data")
public class bjnodeinfo {
    List<bjnodeinfo1> nodes;
    @XmlElement(name="node")
    public List<bjnodeinfo1> getNodes() {
        return nodes;
    }

    public void setNodes(List<bjnodeinfo1> nodes) {
        this.nodes = nodes;
    }

}
