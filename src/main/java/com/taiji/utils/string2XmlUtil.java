package com.taiji.utils;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;

import javax.xml.bind.JAXBException;
import java.io.File;
/**
 * @author flywolf
 * @param
 * @return
 * @describe:将xml字符串写入xml文件
 * @Date: 11:08 2019/9/25
**/
public class string2XmlUtil {
    public static void createXml(String formxml,String filename ) throws JAXBException, DocumentException {
        Document document= DocumentHelper.parseText(formxml);
        String classpath = BusinessXmlUtil.class.getResource("/").getPath();
        String filepath = classpath + File.separator +filename+ ".xml";
        xmlWrite2FileUtil.write2File(filepath, document);
    }
}
