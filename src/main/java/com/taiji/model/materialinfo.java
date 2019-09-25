package com.taiji.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name="materials")
public class materialinfo {

    materialinfo1 materialinfo1s;//定义映射的bean对象
    materialinfo1 materialinfo2s;//同上
    materialinfo1 materialinfo3s;
    materialinfo1 materialinfo4s;
    materialinfo1 materialinfo5s;
    @XmlElement(name="materialinfo")
    public materialinfo1 getMaterialinfo1s()
    {
        return materialinfo1s;
    }
    public void setMaterialinfo1s(materialinfo1 materialinfo1s)
    {
        this.materialinfo1s=materialinfo1s;
    }
    @XmlElement(name="materialinfo")
    public materialinfo1 getMaterialinfo2s()
    {
        return materialinfo2s;
    }
    public void setMaterialinfo2s(materialinfo1 materialinfo2s)
    {
        this.materialinfo2s=materialinfo2s;
    }
    @XmlElement(name="materialinfo")
    public materialinfo1 getMaterialinfo3s()
    {
        return materialinfo3s;
    }
    public void setMaterialinfo3s(materialinfo1 materialinfo3s)
    {
        this.materialinfo3s=materialinfo3s;
    }
    @XmlElement(name="materialinfo")
    public materialinfo1 getMaterialinfo4s()
    {
        return materialinfo4s;
    }
    public void setMaterialinfo4s(materialinfo1 materialinfo4s)
    {
        this.materialinfo4s=materialinfo4s;
    }
    @XmlElement(name="materialinfo")
    public materialinfo1 getMaterialinfo5s()
    {
        return materialinfo5s;
    }
    public void setMaterialinfo5s(materialinfo1 materialinfo5s)
    {
        this.materialinfo5s=materialinfo5s;
    }
}
