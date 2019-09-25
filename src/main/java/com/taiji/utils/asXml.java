package com.taiji.utils;

import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.IOException;
import java.io.StringWriter;

public class asXml {

    // 转换为标准格式（避免自闭合的问题）
    private static String asXml(Element body) {
        OutputFormat format = new OutputFormat();
        format.setEncoding("UTF-8");
        format.setExpandEmptyElements(true);
        StringWriter out = new StringWriter();
        XMLWriter writer = new XMLWriter(out, format);
        try {
            writer.write(body);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return out.toString();
    }

}
