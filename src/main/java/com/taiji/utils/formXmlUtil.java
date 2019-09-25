package com.taiji.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;
import sun.misc.BASE64Encoder;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Handler;

public class formXmlUtil {
    /**
     * @author flywolf
     * @param:
     * String dataid;//表单实例ID
     * String dataxml://BASE64Helper.encode(表单数据内容)
     * String formtype://表单版本号，默认是1.0
     * @return
     * @describe
     * @Date: 10:41 2019/9/23
    **/
   /* public static void createXml(String dataid,String dataxml,String formtype)
    {
        if(dataid.isEmpty()||dataxml.isEmpty()||formtype.isEmpty())
        {
            System.out.print("form节点必填数据填写异常");
        }
        else {

           *//* Document document = DocumentHelper.createDocument();
            Element form = document.addElement("form");
            Element dataid1 = form.addElement("dataid");
            Element dataxml1 = form.addElement("dataxml");
            Element formtype1 = form.addElement("formtype");
            dataid1.setText(dataid);
            dataxml1.setText(dataxml);
            formtype1.setText(formtype);
            String classpath = BusinessXmlUtil.class.getResource("/").getPath();
            String filepath = classpath + File.separator + "flow"+ UuidUtil.getUUID32()+".xml";//文件存放路径
            xmlWrite2FileUtil.write2File(filepath, document);*//*
            Document document = DocumentHelper.createDocument();
            Element dataxml1 = document.addElement("dataxml");
            dataxml1.setText(dataxml);
            String classpath = BusinessXmlUtil.class.getResource("/").getPath();
            String filepath = classpath + File.separator + "flow3_.xml";
            xmlWrite2FileUtil.write2File(filepath, document);
        }
    }*/
    public static void createXml(String formxml ) throws JAXBException, DocumentException {
        Document document=DocumentHelper.parseText(formxml);
        String classpath = BusinessXmlUtil.class.getResource("/").getPath();
        String filepath = classpath + File.separator + "flow3_.xml";
        xmlWrite2FileUtil.write2File(filepath, document);
    }
    /**
     * @author flywolf
     * @param：
     * HashMap<String,String> map 中存放的是form表单的内容（dataxml加密之前的内容）
     * @return 返回加密后的xml字符串（dataxml标签）
     * @describe 用于接收表单中传过来的hashmap（数据）
     * @Date: 14:17 2019/9/19
    **/
    public static String createXml(HashMap<String,String> map)
    {
        Document document=DocumentHelper.createDocument();
        Element data=document.addElement("data");
        for (String key : map.keySet())
        {
            Element key1=data.addElement(key);
            key1.setText(map.get(key));
        }
        String xml=document.getRootElement().asXML();
        BASE64Encoder encode = new BASE64Encoder();
        String base64xml =encode.encode(xml.getBytes());
        //String xml=document.asXML();
        //xml.replaceAll("","");
       // System.out.print(base64xml);
        return base64xml;
    }
}
