package com.taiji.utils;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/*将xml结点信息存储到xml中
@param
 */
public class XmlUtil {
    public static Map<String, Object> doInfoXML(String infoXML) {
        Document document;
        Map<String, Object> map = new HashMap<String, Object>();
        try {
            document = DocumentHelper.parseText(infoXML);
            Element root = document.getRootElement();
            Iterator it = root.elements().iterator();
            while (it.hasNext()) {
                Element info = (Element) it.next();
                map.put(info.getName(), info.getText());
                Iterator itc = info.elements().iterator();
                while (itc.hasNext()) {
                    Element infoc = (Element) itc.next();
                    map.put(infoc.getName(), infoc.getText());
                }
            }
        } catch (DocumentException e1) {
            e1.printStackTrace();
        }
        return map;
    }
}
