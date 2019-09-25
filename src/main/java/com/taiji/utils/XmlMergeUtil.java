package com.taiji.utils;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

import java.io.*;
import java.util.List;
import java.util.regex.Pattern;
/**
 * @author flywolf
 * @param
 * @return
 * @describe：合并所有的节点信息，形成一个完整的xml文件
 * @Date: 9:44 2019/9/24
**/
public class XmlMergeUtil {
    public static void merge() throws DocumentException {
        SAXReader saxReader = new SAXReader();
        String classpath = xmlWrite2FileUtil.class.getResource("/").getPath();
        String path = classpath + File.separator + "root.xml";
        Document rootDoc = null;
        try {
            rootDoc = saxReader.read(new File(path));
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        Element parent = rootDoc.getRootElement();
        // Element flows = parent.element("permission");
        File file = new File(classpath);
        if (file.exists()) {
            File[] files = file.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    String fileName = pathname.getName();
                    String pattern = "^flow.*.xml$";
                    boolean matches = Pattern.matches(pattern, fileName);
                    return matches;
                }
            });
            for (File f : files) {
                Document read = saxReader.read(f);
                Element root=read.getDocument().getRootElement();
                List<Element> elements = root.elements();
                parent.add(root);
                for (Element emt : elements) {
                    root.add(emt.detach());
                }
            }
        }
        String filePath = XmlMergeUtil.class.getResource("/").getPath();
        String filepath = filePath + File.separator + "sqsuccess.xml";
        xmlWrite2FileUtil.write2File(filepath,rootDoc);
       // System.out.println(rootDoc.asXML());
    }
    //网上受理节点合并
    public static void merge1() throws DocumentException {
        SAXReader saxReader = new SAXReader();
        String classpath = xmlWrite2FileUtil.class.getResource("/").getPath();
        String path = classpath + File.separator + "root.xml";
        Document rootDoc = null;
        try {
            rootDoc = saxReader.read(new File(path));
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        Element parent = rootDoc.getRootElement();
        // Element flows = parent.element("permission");
        File file = new File(classpath);
        if (file.exists()) {
            File[] files = file.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    String fileName = pathname.getName();
                    String pattern = "^.*_.xml$";
                    boolean matches = Pattern.matches(pattern, fileName);
                    return matches;
                }
            });
            for (File f : files) {
                Document read = saxReader.read(f);
                Element root=read.getDocument().getRootElement();
                List<Element> elements = root.elements();
                parent.add(root);
                for (Element emt : elements) {
                    root.add(emt.detach());
                }
            }
        }
        String filePath = XmlMergeUtil.class.getResource("/").getPath();
        String filepath = filePath + File.separator + "slsuccess.xml";
        xmlWrite2FileUtil.write2File(filepath,rootDoc);
        // System.out.println(rootDoc.asXML());
    }
   public static void  singlemerge() throws DocumentException, IOException {

        SAXReader saxReader = new SAXReader();
       String classpath = BusinessXmlUtil.class.getResource("/").getPath();
       String filepath1 = classpath + File.separator + "banjie1.xml";
       String filepath2 = classpath + File.separator + "banjie2.xml";
       String filepath3 = classpath + File.separator + "bj0merge.xml";
        Document a = saxReader.read(new File(filepath1));
        Document b = saxReader.read(new File(filepath2));
        List<Element> elements = b.getRootElement().elements();//获得根节点下的节点信息
        Element parent = (Element) a.getRootElement();//获得第一个xml的根节点
        Element data=parent.addElement("data");
        for (Element element : elements) {
            data.add(element.detach());//将b下的节点添加到a的根节点下
        }
        //System.out.println(a.asXML());
        OutputFormat format = OutputFormat.createPrettyPrint();
        format.setNewLineAfterDeclaration(false);
        format.setEncoding("UTF-8");
        format.setSuppressDeclaration(true);
        File file = new File(filepath3);
        XMLWriter writer = new XMLWriter(new FileOutputStream(file), format);
        // 设置是否转义，默认使用转义字符
        writer.setEscapeText(false);
        writer.write(a);
        writer.close();
    }
    public static void  singlemerge1() throws DocumentException, IOException {

        SAXReader saxReader = new SAXReader();
        String classpath = xmlWrite2FileUtil.class.getResource("/").getPath();
        String path = classpath + File.separator + "root.xml";
        Document rootDoc = null;
        try {
            rootDoc = saxReader.read(new File(path));
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        Element parent = rootDoc.getRootElement();
        // Element flows = parent.element("permission");
        File file = new File(classpath);
        if (file.exists()) {
            File[] files = file.listFiles(new FileFilter() {
                @Override
                public boolean accept(File pathname) {
                    String fileName = pathname.getName();
                    String pattern ="^(.*(0))(.*.xml)$";
                    boolean matches = Pattern.matches(pattern, fileName);
                    return matches;
                }
            });
            for (File f : files) {
                Document read = saxReader.read(f);
                Element root=read.getDocument().getRootElement();
                List<Element> elements = root.elements();
                parent.add(root);
                for (Element emt : elements) {
                    root.add(emt.detach());
                }
            }
        }
        String filePath = XmlMergeUtil.class.getResource("/").getPath();
        String filepath = filePath + File.separator + "bjsuccess.xml";
        xmlWrite2FileUtil.write2File(filepath,rootDoc);
    }

}
