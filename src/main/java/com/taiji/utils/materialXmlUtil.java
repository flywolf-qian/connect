package com.taiji.utils;

import com.taiji.controller.BeanToXml;
import com.taiji.model.materialinfo;
import com.taiji.model.materialinfo1;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import sun.misc.BASE64Encoder;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.util.*;

public class materialXmlUtil {

    public static void createXml(materialinfo materials ) throws JAXBException {
        String xml=createBase64Xml(materials);
        Document document = DocumentHelper.createDocument();
        Element materialxml = document.addElement("materialxml");
        materialxml.setText(xml);
        String classpath = BusinessXmlUtil.class.getResource("/").getPath();
        String filepath = classpath + File.separator + "flow5_.xml";
        xmlWrite2FileUtil.write2File(filepath, document);
    }
    public static String createBase64Xml(materialinfo materials) throws JAXBException {

      /*  materialinfo1.File file=new materialinfo1.File();
        materialinfo1.File file1=new materialinfo1.File();
        //第一个file
        file.setFilepath("a");
        file.setFilename("b");
        file.setFileid("c");
        file.setFiledel("d");
        //第二个file（需要自行添加）
        file1.setFilepath("d");
        file1.setFilename("e");
        file1.setFileid("f");
        file1.setFiledel("g");
        List<materialinfo1.File> fileList=new ArrayList<>();
        List<materialinfo1.File> fileList1=new ArrayList<>();
        fileList.add(file);
        fileList.add(file1);
        fileList1.add(file);
      *//*  fileList1.add(file1);
        fileList1.add(file1);*//*
        // materialinfo1 materialinfo1List = new ArrayList<>();
        materialinfo1 st1 = new materialinfo1("张三", "男", "10001", "a",
                "b","c","d","e","f","g","h","i",
                "j","k",fileList);
        materialinfo1 st2 = new materialinfo1("张三", "男", "10001", "a",
                "b","c","d","e","f","g","h","i",
                "j","k",fileList);
        materialinfo1 st3= new materialinfo1("张三", "男", "10001", "a",
                "b","c","d","e","f","g","h","i",
                "j","k",fileList);
        materialinfo1 st4 = new materialinfo1("张三", "男", "10001", "a",
                "b","c","d","e","f","g","h","i",
                "j","k",fileList);
        materialinfo1 st5= new materialinfo1("张三", "男", "10001", "a",
                "b","c","d","e","f","g","h","i",
                "j","k",fileList);
        // materialinfo1List.add(st);
        //* file.setFileid(st.getFileid());
      *//*  file.setFilename(st.getFilename());
        file.setFilepath(st.getFilepath());
        file.setFiledel(st.getFiledel());*//*
        //st.setFile(fileList);
        //st1.setFile(fileList);
        materialinfo materials = new materialinfo();
       // materialinfo materials1 = new materialinfo();
        materials.setMaterialinfo1s(st1);
        materials.setMaterialinfo2s(st2);
        materials.setMaterialinfo3s(st3);
        materials.setMaterialinfo4s(st4);
        materials.setMaterialinfo5s(st5);*/
       // materials1.setMaterialinfo1s(st1);
        String str = BeanToXml.beanToXml(materials, materialinfo.class);
        //String str1=BeanToXml.beanToXml(materials1, materialinfo.class);
        BASE64Encoder encode = new BASE64Encoder();
        String base64xml =encode.encode(str.getBytes());
        //System.out.print(base64xml);
        return base64xml;
      //System.out.print(str);
    }
}
  /*  public static String createXml(String )
    {
        Document document=DocumentHelper.createDocument();
        Element materialinfo=document.addElement("materialinfo");

    }*/
   /* public static String createXml1(List<HashMap> list)
    {
        ArrayList<HashMap> list1 = new ArrayList<>();
        HashMap<String,String> map1=new HashMap<>();
        Document document = DocumentHelper.createDocument();
        for ( HashMap<String,HashMap<String,String>> map: list) {
            Element materialinfo = document.addElement("materialinfo");
            Set<Map.Entry<String, HashMap<String, String>>> classa = map.entrySet();
            //迭代Set集合
            Iterator<Map.Entry<String, HashMap<String, String>>> it = classa.iterator();
            while (it.hasNext()) {
                Map.Entry<String, HashMap<String, String>> b = it.next();
                String n = b.getKey();
                HashMap<String, String> v = b.getValue();
                Element n1 = materialinfo.addElement(n);
                n1.setText(n);
                Set<Map.Entry<String, String>> x = v.entrySet();
                Iterator<Map.Entry<String, String>> its = x.iterator();
                while (its.hasNext()) {
                    Map.Entry<String, String> c = its.next();
                    String o = c.getKey();
                    String p = c.getValue();
                    Element o1 = n1.addElement(o);
                    o1.setText(p);
                }
            }
        }
        String xml=document.getRootElement().asXML();
        BASE64Encoder encode = new BASE64Encoder();
        String base64xml =encode.encode(xml.getBytes());
        return  base64xml;
    }*/

