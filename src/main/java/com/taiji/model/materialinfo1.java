package com.taiji.model;

import javax.xml.bind.annotation.*;
import java.util.List;

/*
@XmlType(propOrder = { "id", "materialid", "materialname","submittype","orinum", "copynum",
        "isneed","status","formid", "formver", "dataid","certificateid","remark","username", "file"})
*/

public class materialinfo1 {

    String id;//材料实例ID
    String materialid;//材料定义ID
    String materialname;//材料名称
    String submittype;//递交方式]]（在线填报（1），证照共享（2），电子化上传（3），窗口递交（5）, 邮政速递（6））
    String orinum;//原件份数
    String copynum;//复印件份数
    String isneed;//是否必要(0非必要1必要)
    String status;//材料状态(0未提交1提交)
    String formid;//表单ID
    String formver;//表单版本号
    String dataid;//表单实例ID
    String certificateid;//证照编号
    String remark;//备注
    String username;//保留字段（注：保留字段留空）
    List<File> file;
    @XmlElement(name="file")
    public List<File> getFile() {
        return file;
    }
    public void setFile(List<File> file) {
        this.file = file;
    }
    //内部类
    public static class  File{

        String fileid;
        String filename;
        String filepath;
        String filedel;
        public File(String fileid,String filename,String filepath,String filedel)
        {
            this.filepath=filepath;
            this.fileid=fileid;
            this.filename=filename;
            this.filedel=filedel;
        }
        public String getFileid() {
            return fileid;
        }

        public String getFilename() {
            return filename;
        }

        public String getFilepath() {
            return filepath;
        }

        public String getFiledel() {
            return filedel;
        }

        @XmlElement(name="fileid")
        public void setFileid(String fileid) {
            this.fileid = fileid;
        }
        @XmlElement(name="filename")
        public void setFilename(String filename) {
            this.filename = filename;
        }
        @XmlElement(name="filepath")
        public void setFilepath(String filepath) {
            this.filepath = filepath;
        }
        @XmlElement(name="filedel")
        public void setFiledel(String filedel) {
            this.filedel = filedel;
        }

    }
/**
 * @author flywolf
 * @param:见materialinfo1中的注释(上面)
 * @return
 * @describe
 * @Date: 11:04 2019/9/23
**/
    public  materialinfo1(String id,String materialid, String materialname, String submittype,
                          String orinum, String copynum, String isneed, String status, String formid, String formver,
                          String dataid, String certificateid, String remark, String username,List<File> file )
    {
        if(id.isEmpty()||materialname.isEmpty()||submittype.isEmpty()||copynum.isEmpty()
            ||status.isEmpty())
        {
            System.out.println("material节点必填数据填写异常");
        }
        else {
            this.id = id;
            this.materialid = materialid;
            this.materialname = materialname;
            this.submittype = submittype;
            this.orinum = orinum;
            this.copynum = copynum;
            this.isneed = isneed;
            this.status = status;
            this.formid = formid;
            this.formver = formver;
            this.dataid = dataid;
            this.certificateid = certificateid;
            this.username = username;
            //this.file=file;
            this.remark = remark;
            this.file = file;
        }

    }
    @XmlElement(name="id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    @XmlElement(name="materialid")
    public String getMaterialid() {
        return materialid;
    }

    public void setMaterialid(String materialid) {
        this.materialid = materialid;
    }
    @XmlElement(name="materialname")
    public String getMaterialname() {
        return materialname;
    }

    public void setMaterialname(String materialname) {
        this.materialname = materialname;
    }
    @XmlElement(name="submittype")
    public String getSubmittype() {
        return submittype;
    }

    public void setSubmittype(String submittype) {
        this.submittype = submittype;
    }
    @XmlElement(name="orinum")
    public String getOrinum() {
        return orinum;
    }

    public void setOrinum(String orinum) {
        this.orinum = orinum;
    }
    @XmlElement(name="copynum")
    public String getCopynum() {
        return copynum;
    }

    public void setCopynum(String copynum) {
        this.copynum = copynum;
    }
    @XmlElement(name="isneed")
    public String getIsneed() {
        return isneed;
    }

    public void setIsneed(String isneed) {
        this.isneed = isneed;
    }
    @XmlElement(name="status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
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
    @XmlElement(name="dataid")
    public String getDataid() {
        return dataid;
    }

    public void setDataid(String dataid) {
        this.dataid = dataid;
    }
    @XmlElement(name="certificateid")
    public String getCertificateid() {
        return certificateid;
    }

    public void setCertificateid(String certificateid) {
        this.certificateid = certificateid;
    }
    @XmlElement(name="remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    @XmlElement(name="username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


   /* public void setFile(String fileid,String filename,String filepath,String filedel) {
        this.fileid=fileid;
        this.filename=filename;
        this.filepath=filepath;
        this.filedel=filedel;
    }*/
/*    String fileid;
    String filename;
    String filepath;
    String filedel;*/
  /*  public String getFileid() {
        return fileid;
    }

    public void setFileid(String fileid) {
        this.fileid = fileid;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }

    public String getFiledel() {
        return filedel;
    }

    public void setFiledel(String filedel) {
        this.filedel = filedel;
    }
*/


    //@XmlElementWrapper(name="files")

 /*   @XmlElement(name="file")
    public void  setFile(String filedel,String fileid,String filename,String filepath)
    {
     File file=new File();
     file.setFiledel( filedel);
     file.setFileid(fileid);
     file.setFilename(filename);
     file.setFilepath(filepath);
    }*/

}
