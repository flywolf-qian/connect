package com.taiji.utils;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.io.File;

public class bjnodeXmlUtil {
    public static void createXml(String nodecode, String nodename,String version,String sn,String operator,
                                 String operatorduty ,String deptcode, String handletime ,String handlestate,
                                 String handleadvice ,String completeresultscode , String prenodecode ,String nextnodecode)
    {
        if(nodecode.isEmpty()||nodename.isEmpty()||version.isEmpty()||sn.isEmpty()||
                deptcode.isEmpty()||operator.isEmpty()||handletime.isEmpty()||handlestate.isEmpty()||handleadvice.isEmpty())
        {
            System.out.println("网上办结node节点必填数据填写异常");
        }
        else {
            Document document = DocumentHelper.createDocument();
            Element node = document.addElement("node");
            Element nodecode1 = node.addElement("nodecode");
            Element nodename1 = node.addElement("nodename");
            Element version1 = node.addElement("version");
            Element sn1 = node.addElement("sn");
            Element operator1 = node.addElement("operator");
            Element operatorduty1 = node.addElement("operatorduty");
            Element deptcode1 = node.addElement("deptcode");
            Element handletime1 = node.addElement("handletime");
            Element handlestate1 = node.addElement("handlestate");
            Element prenodecode1=node.addElement("prenodecode");
            Element nextnodecode1=node.addElement("nextnodecode");
            Element handleadvice1 = node.addElement("handleadvice");
            Element completeresultscode1 = node.addElement("completeresultscode");

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
            String filepath = classpath + File.separator + "bj0node.xml";
            xmlWrite2FileUtil.write2File(filepath, document);
        }
    }
}
