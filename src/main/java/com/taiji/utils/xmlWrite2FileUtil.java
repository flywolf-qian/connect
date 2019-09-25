package com.taiji.utils;

import org.dom4j.Document;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class xmlWrite2FileUtil {
    public static void write2File(String filepath, Document document) {
        try {
            File file = new File(filepath);
            OutputFormat format = OutputFormat.createPrettyPrint();
            // 设置编码格式
            format.setNewLineAfterDeclaration(false);
            format.setEncoding("UTF-8");

            format.setSuppressDeclaration(true);
            XMLWriter writer = null;
            try {
                writer = new XMLWriter(new FileOutputStream(file), format);
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
            // 设置是否转义，默认使用转义字符
            writer.setEscapeText(false);
            writer.write(document);
            writer.close();
            System.out.println("生成"+filepath+"成功");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("生成"+filepath+"失败");
        }
    }
}
