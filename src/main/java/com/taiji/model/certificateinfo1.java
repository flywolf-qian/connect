package com.taiji.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

public class certificateinfo1 {
    String certificateid;
    String certificatename;
    String certificatedesc;
    String certificatestatus;
    String cvaliditydate;
    String certificatestartdate ;
    String certificateenddate;
    String certificatedept ;
    String certificatetime;
    String listcode ;
    String owner ;
    String usercode;
    List<Node> node;
    String file_stream;

    public static class File_stream{
        String file_stream;
        @XmlElement(name="file_stream")
        public String getFile_stream() {
            return file_stream;
        }

        public void setFile_stream(String file_stream) {
            this.file_stream = file_stream;
        }


    }
    public  certificateinfo1(String certificateid, String certificatename,String certificatedesc,String certificatestatus,String cvaliditydate,
                                  String certificatestartdate ,String certificateenddate, String certificatedept ,String certificatetime,
                                  String listcode ,String owner , String usercode,String file_stream )
    {
        this.certificateid=certificateid;
        this.certificatename=certificatename;
        this.certificatedesc=certificatedesc;
        this.certificatestatus=certificatestatus;
        this.cvaliditydate=cvaliditydate;
        this.certificatestartdate=certificatestartdate;
        this.certificateenddate=certificateenddate;
        this.certificatedept=certificatedept;
        this.certificatetime=certificatetime;
        this.listcode=listcode;
        this.owner=owner;
        this.usercode=usercode;
        this.file_stream=file_stream;
        //this.node=node;
    }
@XmlElement(name="certificateid")
    public String getCertificateid() {
        return certificateid;
    }

    public void setCertificateid(String certificateid) {
        this.certificateid = certificateid;
    }
    @XmlElement(name="certificatename")
    public String getCertificatename() {
        return certificatename;
    }

    public void setCertificatename(String certificatename) {
        this.certificatename = certificatename;
    }
    @XmlElement(name="certificatedesc")
    public String getCertificatedesc() {
        return certificatedesc;
    }

    public void setCertificatedesc(String certificatedesc) {
        this.certificatedesc = certificatedesc;
    }
    @XmlElement(name="certificatestatus")
    public String getCertificatestatus() {
        return certificatestatus;
    }

    public void setCertificatestatus(String certificatestatus) {
        this.certificatestatus = certificatestatus;
    }
    @XmlElement(name="cvaliditydate")
    public String getCvaliditydate() {
        return cvaliditydate;
    }

    public void setCvaliditydate(String cvaliditydate) {
        this.cvaliditydate = cvaliditydate;
    }
    @XmlElement(name="certificatestartdate")
    public String getCertificatestartdate() {
        return certificatestartdate;
    }

    public void setCertificatestartdate(String certificatestartdate) {
        this.certificatestartdate = certificatestartdate;
    }
    @XmlElement(name="certificateenddate")
    public String getCertificateenddate() {
        return certificateenddate;
    }

    public void setCertificateenddate(String certificateenddate) {
        this.certificateenddate = certificateenddate;
    }
    @XmlElement(name="certificatedept")
    public String getCertificatedept() {
        return certificatedept;
    }

    public void setCertificatedept(String certificatedept) {
        this.certificatedept = certificatedept;
    }
    @XmlElement(name="certificatetime")
    public String getCertificatetime() {
        return certificatetime;
    }

    public void setCertificatetime(String certificatetime) {
        this.certificatetime = certificatetime;
    }
    @XmlElement(name="listcode")
    public String getListcode() {
        return listcode;
    }

    public void setListcode(String listcode) {
        this.listcode = listcode;
    }
    @XmlElement(name="owner")
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    @XmlElement(name="usercode")
    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode;
    }
  //  @XmlElement(name="node")
    public List<Node> getNode() {
        return node;
    }

    public void setNode(List<Node> node) {
        this.node = node;
    }

   public static class  Node {

        String title;
        String key;
        String value;
        public Node(String title, String key, String value)
        {
            this.key=key;
            this.value=value;
            this.title=title;
        }
        public String getTitle() {
            return title;
        }
@XmlElement(name="title")
        public void setTitle(String title) {
            this.title = title;
        }

        public String getKey() {
            return key;
        }
        @XmlElement(name="key")
        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }
        @XmlElement(name="value")
        public void setValue(String value) {
            this.value = value;
        }
    }



}
