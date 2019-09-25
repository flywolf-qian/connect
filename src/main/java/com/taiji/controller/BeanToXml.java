package com.taiji.controller;

import com.taiji.model.materialinfo;
import com.taiji.model.materialinfo1;
import sun.misc.BASE64Encoder;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
//model 映射成xml
public class BeanToXml {
    /**
     * 18      * java对象转换为xml文件
     * 19      * @param xmlPath  xml文件路径
     * 20      * @param load    java对象.Class
     * 21      * @return    xml文件的String
     * 22      * @throws JAXBException
     * 23
     */
    public static String beanToXml(Object obj, Class<?> load) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(load);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, true);
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
        StringWriter writer = new StringWriter();
        marshaller.marshal(obj, writer);
        return writer.toString();
    }
    /**
     * @author flywolf
     * @param
     * @return
     * @describe:测试使用时创建
     * @Date: 14:45 2019/9/23
    **/
   /* public static void main(String[] args) throws JAXBException, IOException {

        materialinfo1.File file=new materialinfo1.File();
        materialinfo1.File file1=new materialinfo1.File();
        //第一个file
        file.setFilepath("a");
        file.setFilename("b");
        file.setFileid("c");
        file.setFiledel("d");
        //第二个file（..需要的自己定义）
        file1.setFilepath("d");
        file1.setFilename("e");
        file1.setFileid("f");
        file1.setFiledel("g");
        List<materialinfo1.File> fileList=new ArrayList<>();
        fileList.add(file);
        fileList.add(file1);
       // materialinfo1 materialinfo1List = new ArrayList<>();
        materialinfo1 st = new materialinfo1("张三", "男", "10001", "尖子班","","","","","","","","","","",fileList);
        st.setFile(fileList);
        materialinfo materials = new materialinfo();
        materials.setMaterialinfo1s(st);
        String str = BeanToXml.beanToXml(materials, materialinfo.class);
        BASE64Encoder encode = new BASE64Encoder();
        String base64xml =encode.encode(str.getBytes());
        System.out.print(base64xml);
        //写入到xml文件中
       *//* String xmlPath = "J:/images/success.xml";
        BufferedWriter bfw = new BufferedWriter(new FileWriter(new File(xmlPath)));
        bfw.write(str);
        bfw.close();*//*
    }*/

}
