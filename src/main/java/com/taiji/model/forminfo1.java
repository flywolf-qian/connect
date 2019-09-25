package com.taiji.model;

import javax.xml.bind.annotation.XmlElement;
/**
 * @author flywolf
 * @param:
 *     String dataid;表单实例ID
 *     String dataxml;BASE64Helper.encode(表单数据内容)
 *     String formid;表单模版ID，默认是20100708180715106800
 *     String formtype;表单类型，默认是0
 *     String formver;表单版本号，默认是1.0
 * @return
 * @describe
 * @Date: 11:36 2019/9/24
**/
public class forminfo1 {
    String dataid;
    String dataxml;
    String formid;
    String formtype;
    String formver;
@XmlElement(name="formid")
    public String getFormid() {
        return formid;
    }

    public void setFormid(String formid) {
        this.formid = formid;
    }
@XmlElement(name="formver")
    public String getFormver() {
        return formver;
    }

    public void setFormver(String formver) {
        this.formver = formver;
    }

    public forminfo1(String dataid, String dataxml, String formid,String formtype,String formver)
    {
        this.dataid=dataid;
        this.dataxml=dataxml;
        this.formtype=formtype;
        this.formid=formid;
        this.formver=formver;
    }
    @XmlElement(name="dataid")
    public String getDataid() {
        return dataid;
    }

    public void setDataid(String dataid) {
        this.dataid = dataid;
    }
    @XmlElement(name="dataxml")
    public String getDataxml() {
        return dataxml;
    }

    public void setDataxml(String dataxml) {
        this.dataxml = dataxml;
    }
    @XmlElement(name="formtype")
    public String getFormtype() {
        return formtype;
    }

    public void setFormtype(String formtype) {
        this.formtype = formtype;
    }


}
