package com.taiji.controller;


import com.taiji.model.*;
import com.taiji.utils.*;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @author flywolf
 * @param：
 * flow1.xml....flow5都为节点信息
 * success.xml 为合并之后的xml文件
 * 合并之后的文件位于target/classes的目录之下
 * @return
 * @describe 下面为调用的案例
 * @Date: 15:50 2019/9/20
**/
/**********************************************************************************************************
 *      节点拼接简介：
 *                1.网上申请和网上受理拼接效果一直，只要node节点有区别（放置于target/classes下面的sjsuccess.xml和blsuccess.xml中）
 *                2.网上办结为单独的一种效果（放置于target/classes下面的bjsuccess.xml中）
 *                3.各个节点分别独立存放于flow1.xml（business节点）中，以此类推。
 *                4.参考下面的案例进行拼接调用。
 *        如有问题，可以咨询。
 * @Author:flywolf
 * email:491909800@qq.com
 ************************************************************************************************************/
//主入口
public class MainClass {

    public static void main(String[] args) throws Exception {

        /**************************************************
         *                                                *
         *          网上申请节点信息的生成                *
         *                                                *
         *************************************************/
        //（1）创建business节点（调用的方法），生成节点存放于flowl.xml
        BusinessXmlUtil.createXml("20190902105123818404","","","",
                "120000000000K00256941107", "00254K00256941","001--02","机动车载运危险物品许可--除剧毒、爆炸、放射以外的危险化学品",
                "1", "120000","K00256941","天津市公安交管局","机动车载运危险物品许可--除剧毒、爆炸、放射以外的危险化学品",
                "","1", "2019-09-02 10:48:56","2019-09-02 10:48:56",
                "","120000","120000","0","3","",
                "","","","","");


        //（2）创建applicationinfo节点（调用的方法）生成节点存放于flow2.xml
        applicationinfoXmlUtil.createXml("2","吉林市福源物流有限公司","营业执照",
                "91220201MA14Y6RKXL","13009188509","李志会",
                "13009188509","10","220204196604202135","j","k","l",
                "","","","","","","");


       //（3）创建form节点（注：forms中可能会有多个form子节点,自行添加）生成节点存放于flow3.xml
        HashMap<String, String> map=new HashMap<String,String>();
        map.put("nowDate","2019-09-03");//(hashmap中的信息存放）
        map.put("Name","朱守义");
        map.put("contact","17316100531");
        map.put("idCode","320322199012022216");
        map.put("address","行政服务中心");
        map.put("email","2@qq.com");
        String form1=formXmlUtil.createXml(map);//生成加密后的dataxml字符串
        String form2=formXmlUtil.createXml(map);//生成加密后的dataxml字符串
        forminfo forminfos = new forminfo();
        forminfo1 forminfo1s=new forminfo1("20190903182101474111",form1,"","0","");
       // forminfo1 forminfo2s=new forminfo1("c",form2,"d","","");
        forminfos.setForminfo1s(forminfo1s);
        //forminfos.setForminfo2s(forminfo2s);
        String str = BeanToXml.beanToXml(forminfos, forminfo.class);
        formXmlUtil.createXml(str);

        //(4)创建node节点,生成节点存放于flow4.xml
        nodeXmlUtil.createXml("WSSQ","网上申请","1","1","系统管理员","",
                "000177068","2019-09-12 17:28:44",
                "9","同意","","","SL");


        //(5)创建materialxml节点信息，生成节点存放于flow5.xml(案例位于materialXmlUtil.createXml()方法中)
        materialinfo1.File file=new materialinfo1.File("49050","营业执照","","0");

        materialinfo1.File file1=new materialinfo1.File("49051","授权委托书","","0");
        materialinfo1.File file2=new materialinfo1.File("49052","道路经营许可证","","0");

        materialinfo1.File file3=new materialinfo1.File("50192","行驶证","","0");
        materialinfo1.File file4=new materialinfo1.File("50193","行驶证","","0");
        materialinfo1.File file5=new materialinfo1.File("50194","行驶证","","0");
        materialinfo1.File file6=new materialinfo1.File("50195","行驶证","","0");
        materialinfo1.File file7=new materialinfo1.File("50196","运输证","","0");
        materialinfo1.File file8=new materialinfo1.File("50197","经营范围","","0");
        materialinfo1.File file9=new materialinfo1.File("50198","审验记录","","0");
        materialinfo1.File file10=new materialinfo1.File("50199","违章记录","","0");
        materialinfo1.File file11=new materialinfo1.File("50200","道路运输证","","0");

        materialinfo1.File file12=new materialinfo1.File("50371","驾驶证","","0");
        materialinfo1.File file13=new materialinfo1.File("50372","驾驶证","","0");
        materialinfo1.File file14=new materialinfo1.File("50373","一寸免冠照片","","0");
        materialinfo1.File file15=new materialinfo1.File("50374","身份证","","0");
        materialinfo1.File file16=new materialinfo1.File("50375","身份证","","0");
        materialinfo1.File file17=new materialinfo1.File("50376","从业资格证","","0");
        materialinfo1.File file18=new materialinfo1.File("50377","从业资格证","","0");
        materialinfo1.File file19=new materialinfo1.File("50378","从业资格证","","0");
        materialinfo1.File file20=new materialinfo1.File("50379","从业资格证","","0");

        materialinfo1.File file21=new materialinfo1.File("50210","身份证","","0");
        materialinfo1.File file22=new materialinfo1.File("50210","从业资格证","","0");
        materialinfo1.File file23=new materialinfo1.File("50212","从业资格证","","0");
        materialinfo1.File file24=new materialinfo1.File("50214","从业资格证","","0");
        materialinfo1.File file25=new materialinfo1.File("50215","从业资格证","","0");

        materialinfo1.File file26=new materialinfo1.File("583134","申请表","","0");

        List<materialinfo1.File> fileList=new ArrayList<>();
        List<materialinfo1.File> fileList1=new ArrayList<>();
        List<materialinfo1.File> fileList2=new ArrayList<>();
        List<materialinfo1.File> fileList3=new ArrayList<>();
        List<materialinfo1.File> fileList4=new ArrayList<>();
        List<materialinfo1.File> fileList5=new ArrayList<>();
        fileList.add(file);

        fileList1.add(file1);
        fileList1.add(file2);

        fileList2.add(file3);
        fileList2.add(file4);
        fileList2.add(file5);
        fileList2.add(file6);
        fileList2.add(file7);
        fileList2.add(file8);
        fileList2.add(file9);
        fileList2.add(file10);
        fileList2.add(file11);

        fileList3.add(file12);
        fileList3.add(file13);
        fileList3.add(file14);
        fileList3.add(file15);
        fileList3.add(file16);
        fileList3.add(file17);
        fileList3.add(file18);
        fileList3.add(file19);
        fileList3.add(file20);

        fileList4.add(file21);
        fileList4.add(file22);
        fileList4.add(file23);
        fileList4.add(file24);
        fileList4.add(file25);

       fileList5.add(file26);

        materialinfo1 st1 = new materialinfo1("sjm5004_843_1", "sjm5004", "运输企业取得的工商营业执照", "3",
                "1","0","1","1","","","","91220201MA14Y6RKXL",
                "","",fileList);//存在两个file节点
        materialinfo1 st2 = new materialinfo1("sjm5005_843_1", "sjm5005", "运输企业取得的危险货物道路运输许可", "a",
                "1","0","1","1","","","",
                "吉交运管许可吉市字220201400022号", "","",fileList1);//存在一个个file节点
        materialinfo1 st3= new materialinfo1("CL20919019016818688", "sjm5007", "运输车辆的行驶证、营运证", "3",
                "1","0","1","1","","","","吉BE2596",
                "","",fileList2);
        materialinfo1 st4 = new materialinfo1("JS2018040800000203", "sjm5008", "驾驶人员驾驶证、上岗资格的证明文件", "3",
                "1","0","1","1","","","","370502198109205211",
                "j","k",fileList3);
        materialinfo1 st5= new materialinfo1("YY2018041100002003", "sjm5009", "押运人员身份证、上岗资格的证明文件", "3",
                "1","0","1","1","","","","370303197110243929",
                "","",fileList4);
        materialinfo1 st6= new materialinfo1("TravelApply_2620306_1", "sjm5001", "危险化学品道路运输申报表", "3",
                "1","0","1","1","","","","",
                "","",fileList5);
        materialinfo materials = new materialinfo();
        materials.setMaterialinfo1s(st1);
        materials.setMaterialinfo2s(st2);
        materials.setMaterialinfo3s(st3);
        materials.setMaterialinfo4s(st4);
        materials.setMaterialinfo5s(st5);
        materialXmlUtil.createXml(materials);
        //合并多有的节点，生成success.xml文件
        XmlMergeUtil.merge();

        /**************************************************
         *                                                *
         *          网上受理节点信息的生成                *
         *                                                *
         *************************************************/
        //（1）创建business节点（调用的方法），生成节点存放于flowl.xml

        //（2）创建applicationinfo节点（调用的方法）生成节点存放于flow2.xml

        //（3）创建form节点（注：forms中可能会有多个form子节点,自行添加）生成节点存放于flow3.xml

        //(4)创建node节点,生成节点存放于flow4.xml
        nodeXmlUtil2.createXml("SL","受理","1","1","天津市公安交管局  驻政务办  庞涛",
                "0001","K00256941","2019-09-02 10:48:56",
                "1","同意","","SL","BJ");

        //(5)创建materialxml节点信息，生成节点存放于flow5.xml(案例位于materialXmlUtil.createXml()方法中)


       //合并多有的节点，生成success.xml文件
       XmlMergeUtil.merge1();

      /**************************************************
       *                                                *
       *          网上办结节点信息的生成                *
       *                                                *
       *************************************************/
       bjnodeXmlUtil.createXml("BJ","办结","1","1",
               "天津市公安交管局  驻政务办  庞涛","0001","K00256941",
               "2019-09-02 10:53:56", "1","同意","0",
               "SL","");
        bjnodeinfo1 node1=new bjnodeinfo1("编号","BH","20190902105123818404");
        bjnodeinfo1 node2=new bjnodeinfo1("单位名称","DWMC","吉林市福源物流有限公司");
        bjnodeinfo1 node3=new bjnodeinfo1("车牌号码","CPHM","吉BE2596");
        bjnodeinfo1 node4=new bjnodeinfo1("挂","G","吉BE802挂");
        bjnodeinfo1 node5=new bjnodeinfo1("运输时间","YSSJ","2019-10-01至2019-10-31");
        bjnodeinfo1 node6=new bjnodeinfo1("运输路线","YSLX","S11海滨高速,南港路,南航路,南港中路,东四路,南航东路");
        bjnodeinfo1 node7=new bjnodeinfo1("起点-终点","QDZD","滨海新区(S11海滨高速)-滨海新区(南航东路)");
        bjnodeinfo1 node8=new bjnodeinfo1("运输危化品种类及品名","YSWHPZLJPM","天然气[富含甲烷的]");
        bjnodeinfo1 node9=new bjnodeinfo1("是否涉及高速","SFSJGS","滨海新区(S11海滨高速)-滨海新区(南航东路)");
        bjnodeinfo1 node10=new bjnodeinfo1("备注","BZ","海滨（滨海南-临港）");


        List<bjnodeinfo1> nodeList=new ArrayList<>();
        nodeList.add(node1);
        nodeList.add(node2);
        nodeList.add(node3);
        nodeList.add(node4);
        nodeList.add(node5);
        nodeList.add(node6);
        nodeList.add(node7);
        nodeList.add(node8);
        nodeList.add(node9);
        nodeList.add(node10);
        String filepath = "J:/images/test.png";
        String imgbase64=fileStreamXmlUtil.judge(filepath);
        //System.out.print(imgbase64);
       certificateinfo1 certificateinfo1s=new certificateinfo1("a","b","c",
               "","","",""
       ,"","","","","",imgbase64);
        certificateinfo certificateinfos=new certificateinfo();
        certificateinfos.setCertificateinfoS(certificateinfo1s);
        certificateinfos.setFilestream(imgbase64);
       // certificateinfos.setNode(nodeList);
        certificateXmlUtil.createXml(certificateinfos);
        bjnodeinfo bjnodeinfos=new bjnodeinfo();
        bjnodeinfos.setNodes(nodeList);
        nodeXmlUtil1.bjcreatexml(bjnodeinfos);
        XmlMergeUtil.singlemerge();
        Document document=DocumentHelper.createDocument();
        XmlMergeUtil.singlemerge1();

    }
}

