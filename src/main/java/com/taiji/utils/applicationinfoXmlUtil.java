package com.taiji.utils;

import net.sf.json.JSONObject;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileOutputStream;

public class applicationinfoXmlUtil {
    /**
     * @author flywolf
     * @param :
     *     String apptype;//申请人类型，1个人，2企业（机关单位），9其他
     *     String appname;//申请人名称或申请单位名称]
     *     String appcardtype;//申请人证件类型
     *     String  applicantid;//申请人证件号或申请单位组织机构代码
     *     String  appphone;//申请人或申请单位联系电话
     *     String  contactname;//联系人姓名
     *     String  contactnumber;//联系人电话
     *     String  contactcardtype;//联系人证件类型
     *     String   contactcardid;//联系人证件号码
     *     String   contactemail;//联系人电子邮箱
     *     String  contactaddress;//联系人住址
     *     String  contactpostcode;//联系人邮编
     * @return
     * @describe
     * @Date: 10:40 2019/9/23
    **/
    public static void createXml( String apptype,String appname,String appcardtype,String applicantid,
                                  String appphone, String contactname, String contactnumber,String  contactcardtype,
                                  String contactcardid,String contactemail,String contactaddress,String contactpostcode,
                                  String username,String usersex,String  userzctime,String useraddress,
                                  String useremail,String qyfrname,String qyfrsfzh ) {
        if (apptype.isEmpty()||appname.isEmpty()||applicantid.isEmpty()||appphone.isEmpty()||contactname.isEmpty()||contactnumber.isEmpty()||contactcardtype.isEmpty()||contactcardid.isEmpty()) {
            System.out.println("applicationinfo节点必填数据填写异常");
        }
        else {
            Document document = DocumentHelper.createDocument();
            Element applicationinfo = document.addElement("applicationinfo");
            Element appname1 = applicationinfo.addElement("appname");
            Element apptype1 = applicationinfo.addElement("apptype");
            Element appcardtype1 = applicationinfo.addElement("appcardtype");
            Element applicantid1 = applicationinfo.addElement("applicantid");
            Element appphone1 = applicationinfo.addElement("appphone");
            Element contactname1 = applicationinfo.addElement("contactname");
            Element contactnumber1 = applicationinfo.addElement("contactnumber");
            Element contactcardtype1 = applicationinfo.addElement("contactcardtype");
            Element contactcardid1 = applicationinfo.addElement("contactcardid");
            Element contactemail1 = applicationinfo.addElement("contactemail");
            Element contactaddress1 = applicationinfo.addElement("contactaddress");
            Element contactpostcode1 = applicationinfo.addElement("contactpostcode");
            Element wsuserxx=applicationinfo.addElement("wsuserxx");
            Element username1=wsuserxx.addElement("username");
            Element usersex1=wsuserxx.addElement("usersex");
            Element userzctime1=wsuserxx.addElement("userzctime");
            Element useraddress1=wsuserxx.addElement("useraddress");
            Element usermail1=wsuserxx.addElement("usermail");
            Element qyfrname1=wsuserxx.addElement("qyfrname");
            Element qyfrsfzh1=wsuserxx.addElement("qyfrsfzh");
            username1.setText(username);
            usersex1.setText(usersex);
            userzctime1.setText(userzctime);
            useraddress1.setText(useraddress);
            usermail1.setText(useremail);
            qyfrname1.setText(qyfrname);
            qyfrsfzh1.setText(qyfrsfzh);


            appname1.setText(appname);
            apptype1.setText(apptype);
            appcardtype1.setText(appcardtype);
            applicantid1.setText(applicantid);
            appphone1.setText(appphone);
            contactname1.setText(contactname);
            contactnumber1.setText(contactnumber);
            contactcardtype1.setText(contactcardtype);
            contactcardid1.setText(contactcardid);
            contactemail1.setText(contactemail);
            contactaddress1.setText(contactaddress);
            contactpostcode1.setText(contactpostcode);
            String classpath = BusinessXmlUtil.class.getResource("/").getPath();
            String filepath = classpath + File.separator + "flow2_.xml";
            xmlWrite2FileUtil.write2File(filepath, document);
        }
    }
}
