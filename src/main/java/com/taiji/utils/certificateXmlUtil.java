package com.taiji.utils;

import com.taiji.controller.BeanToXml;
import com.taiji.model.certificateinfo;
import com.taiji.model.certificateinfo1;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import javax.xml.bind.JAXBException;
import java.io.File;

public class certificateXmlUtil {
    public static void   createXml(certificateinfo certificateinfos) throws JAXBException, DocumentException {
        String str = BeanToXml.beanToXml(certificateinfos, certificateinfo.class);
        createXml(str);

    }
    public static void createXml(String formxml ) throws JAXBException, DocumentException {
        Document document=DocumentHelper.parseText(formxml);
        String classpath = BusinessXmlUtil.class.getResource("/").getPath();
        String filepath = classpath + File.separator + "banjie1.xml";
        xmlWrite2FileUtil.write2File(filepath, document);
    }
      /*  if(certificateid.isEmpty()||certificatename.isEmpty()||certificatestatus.isEmpty()||cvaliditydate.isEmpty()||
                certificatedept.isEmpty()||certificatetime.isEmpty())
        {
            System.out.println("certificate节点必填数据填写异常");
        }
        else {
            Document document = DocumentHelper.createDocument();
            Element certificate = document.addElement("certificate");
            Element head = certificate.addElement("head");
            Element nodename1 = head.addElement("nodename");
            Element version1 = head.addElement("version");
            Element sn1 = head.addElement("sn");
            Element operator1 = head.addElement("operator");
            Element operatorduty1 = head.addElement("operatorduty");
            Element deptcode1 = head.addElement("deptcode");
            Element handletime1 = head.addElement("handletime");
            Element handlestate1 = head.addElement("handlestate");
            Element prenodecode1=head.addElement("prenodecode");
            Element nextnodecode1=head.addElement("nextnodecode");
            Element handleadvice1 = head.addElement("handleadvice");
            Element completeresultscode1 = head.addElement("completeresultscode");


            Element data = certificate.addElement("data");
            Element node = data.addElement("node");
            Element title1 = node.addElement("title");
            Element key1 = node.addElement("key");
            Element value1 = node.addElement("value");

            nodecode1.setText(nodecode);
            nodename1.setText(nodename);
            version1.setText(version);
            sn1.setText(sn);
            operator1.setText(operator);
            operatorduty1.setText(operatorduty);
            deptcode1.setText(deptcode);
            handletime1.setText(handletime);

            handlestate1.setText(handlestate);
            handleadvice1.setText(handleadvice);
            completeresultscode1.setText(completeresultscode);
            prenodecode1.setText(prenodecode);
            nextnodecode1.setText(nextnodecode);
            String classpath = BusinessXmlUtil.class.getResource("/").getPath();
            String filepath = classpath + File.separator + "flow4.xml";
            xmlWrite2FileUtil.write2File(filepath, document);
        }
    }*/
}
