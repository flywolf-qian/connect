package com.taiji.utils;

import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileOutputStream;

/**
 * @author flywolf
 * @param：
 * String nodecode//环节代码
 * String nodename//环节名称
 * String version//数据版本号
 * String sn//序号
 * String operator//环节处理人
 * String operatorduty//环节处理人职务名称
 * String deptcode//环节处理部门组织机构代码 (如果为跨层级业务为必填)
 * String handletime //环节处理时间
 * String handlestate//环节处理状态
 * String handleadvice //环节处理意见
 * String completeresultscode //上一环节代码
 * String prenodecode //下一环节代码
 * String nextnodecode//办结结果代码
 * @return
 * @describe：通用环节信息
 * @Date: 16:41 2019/9/20
**/
public class nodeXmlUtil {
    public static void createXml(String nodecode, String nodename,String version,String sn,String operator,
                                 String operatorduty ,String deptcode, String handletime ,String handlestate,
                                 String handleadvice ,String completeresultscode , String prenodecode ,String nextnodecode)
    {
            if(nodecode.isEmpty()||nodename.isEmpty()||version.isEmpty()||sn.isEmpty()||
            deptcode.isEmpty()||handletime.isEmpty()||handlestate.isEmpty()||handleadvice.isEmpty())
            {
                    System.out.println("网上申请node节点必填数据填写异常");
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
                    String filepath = classpath + File.separator + "flow4.xml";
                    xmlWrite2FileUtil.write2File(filepath, document);
            }
    }
}
