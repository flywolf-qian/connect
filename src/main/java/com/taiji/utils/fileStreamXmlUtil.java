package com.taiji.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class fileStreamXmlUtil {
    public static String match(String filepath)
    {
        String[] strArray = filepath.split("\\.");
        int suffixIndex = strArray.length -1;
        return strArray[suffixIndex];

    }
    /**
     * @author flywolf
     * @param
     * @return
     * @describe:对证明的图片或pdf的后缀进行判断，并转换成base64；
     * @Date: 9:39 2019/9/25
    **/
    public static String  judge(String filepath) throws Exception {
        String hzname=match(filepath);
        String imgbase;
        if(hzname=="pdf")
        {
              imgbase= PdfBase64Util.pdf2base64(filepath);

        }
        else
        {
             imgbase =PictureBase64Util.encodeBase64File(filepath);

        }
          return imgbase;
    }

}
