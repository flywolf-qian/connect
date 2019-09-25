package com.taiji.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="forms")
public class forminfo {
    forminfo1 forminfo1s;//定义form表单
    forminfo1 forminfo2s;//同上（需要几个定义几个）
    @XmlElement(name="form")
    public forminfo1 getForminfo1s() {
        return forminfo1s;
    }

    public void setForminfo1s(forminfo1 forminfo1s) {
        this.forminfo1s = forminfo1s;
    }
    @XmlElement(name="form")
    public forminfo1 getForminfo2s() {
        return forminfo2s;
    }

    public void setForminfo2s(forminfo1 forminfo2s) {
        this.forminfo2s = forminfo2s;
    }

}
