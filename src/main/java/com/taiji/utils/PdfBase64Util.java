package com.taiji.utils;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.*;

public class PdfBase64Util {

        static BASE64Encoder encoder = new sun.misc.BASE64Encoder();
        //static BASE64Decoder decoder = new sun.misc.BASE64Decoder();

        public static String pdf2base64(String filepath) {

            // 将PDF格式文件转成base64编码
            String base64String = getPDFBinary(new File(filepath));
            // 将base64的编码转成PDF格式文件
            return base64String;
        }

        /**
         *  将PDF转换成base64编码
         *  1.使用BufferedInputStream和FileInputStream从File指定的文件中读取内容；
         *  2.然后建立写入到ByteArrayOutputStream底层输出流对象的缓冲输出流BufferedOutputStream
         *  3.底层输出流转换成字节数组，然后由BASE64Encoder的对象对流进行编码
         * */
        static String getPDFBinary(File file) {
            FileInputStream fin = null;
            BufferedInputStream bin = null;
            ByteArrayOutputStream baos = null;
            BufferedOutputStream bout = null;
            try {
                // 建立读取文件的文件输出流
                fin = new FileInputStream(file);
                // 在文件输出流上安装节点流（更大效率读取）
                bin = new BufferedInputStream(fin);
                // 创建一个新的 byte 数组输出流，它具有指定大小的缓冲区容量
                baos = new ByteArrayOutputStream();
                // 创建一个新的缓冲输出流，以将数据写入指定的底层输出流
                bout = new BufferedOutputStream(baos);
                byte[] buffer = new byte[1024];
                int len = bin.read(buffer);
                while (len != -1) {
                    bout.write(buffer, 0, len);
                    len = bin.read(buffer);
                }
                // 刷新此输出流并强制写出所有缓冲的输出字节，必须这行代码，否则有可能有问题
                bout.flush();
                byte[] bytes = baos.toByteArray();
                // sun公司的API
                return encoder.encodeBuffer(bytes).trim();
                // apache公司的API
                // return Base64.encodeBase64String(bytes);

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fin.close();
                    bin.close();
                    // 关闭 ByteArrayOutputStream 无效。此类中的方法在关闭此流后仍可被调用，而不会产生任何 IOException
                    // IOException
                    // baos.close();
                    bout.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }
        }
