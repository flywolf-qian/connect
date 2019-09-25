package com.taiji.utils;

import net.sf.json.JSONObject;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.XMLWriter;

import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;

public class BusinessXmlUtil {
    /**
     * @author flywolf
     * @param ：
     *     String businessid;//原系统业务流水号
     *     String cbusinessid;//协同业务流水号
     *     String citemid;//协同事项编号
     *     String citemversion;//协同事项版本号
     *     String permid;//审批事项ID
     *     String largeitemid;//审批事项大项编号
     *     String smallitemid;//审批事项小项编号
     *     String smallitemname;//审批事项小项名称
     *     String itemversion;//审批事项版本号
     *     String regionid;//行政区划代码
     *     String deptcode;//部门组织机构代码
     *     String deptname;//部门名称
     *     String projectname;//申请项目名称
     *     String receiptid;//业务回执号
     *     String submittype;//提交方式
     *     String createtime;//登记时间（窗口受理时间或网上申请时间）
     *     String applytime;//申请时间
     *     String lawaddr;//法律规定管辖地
     *     String realaddr;//发生业务管辖地
     *     String status;//办理状态0:在办1:办结2:作废3:补交挂起4:特别程序5:暂存6:已归档;
     *     String state;//业务来源【1:窗口申报;2:窗口协同申报;3:网上申报;4:网上协同申报;5:手机申报;6终端申报;】
     *     String groupid;//事项分组ID（可为空）
     *     String groupname;//事项分组名称（可为空）
     *     String networkid;//受理网点ID（可为空）
     *     String lnetworkid;//领证网点（可为空）
     *     String ywgsd;//业务归属地（可为空）
     *     String ywgsdmc;//业务归属地名称（可为空）
     * @return
     * @describe
     * @Date: 16:29 2019/9/20
    **/
    public static void createXml(String businessid,String cbusinessid,String citemid ,String citemversion ,String permid,String largeitemid,String smallitemid,String smallitemname,String itemversion,String regionid,String deptcode,String deptname,String projectname,String receiptid,String submittype,String createtime,String applytime,String endtime,String lawaddr,String realaddr,String status,String state,String groupid,String groupname,
                                 String networkid,String lnetworkid,String ywgsd,String ywgsdmc) {
            if (businessid.isEmpty() || permid.isEmpty()||largeitemid.isEmpty()||smallitemid.isEmpty()||smallitemname.isEmpty()
                    ||itemversion.isEmpty()||regionid.isEmpty()||deptcode.isEmpty()||deptname.isEmpty()||submittype.isEmpty()||createtime.isEmpty()
                    ||lawaddr.isEmpty()||realaddr.isEmpty()||state.isEmpty()||createtime.isEmpty()||applytime.isEmpty()) {
                    System.out.println("business节点必填数据填写异常");
            }
            else {
                    Document document = DocumentHelper.createDocument();
                    // Element permission = document.addElement("permission");
                    Element business = document.addElement("business");
                    Element businessid1 = business.addElement("businessid");
                    Element cbusinessid1 = business.addElement("cbusinessid");
                    Element citemid1 = business.addElement("citemid");
                    Element citemversion1 = business.addElement("citemversion");
                    Element permid1 = business.addElement("permid");
                    Element largeitemid1 = business.addElement("largeitemid");
                    Element smallitemid1 = business.addElement("smallitemid");
                    Element smallitemname1 = business.addElement("smallitemname");
                    Element itemversion1 = business.addElement("itemversion");
                    Element regionid1 = business.addElement("regionid");
                    Element deptcode1 = business.addElement("deptcode");
                    Element deptname1 = business.addElement("deptname");
                    Element projectname1 = business.addElement("projectname");
                    Element receiptid1 = business.addElement("receiptid");
                    Element submittype1 = business.addElement("submittype");
                    Element createtime1 = business.addElement("createtime");
                    Element applytime1 = business.addElement("applytime");
                    Element endtime1=business.addElement("endtime");
                    Element lawaddr1 = business.addElement("lawaddr");
                    Element realaddr1 = business.addElement("realaddr");
                    Element status1 = business.addElement("status");
                    Element state1 = business.addElement("state");
                    Element groupid1 = business.addElement("groupid");
                    Element groupname1 = business.addElement("groupname");
                    Element networkid1 = business.addElement("networkid");
                    Element lnetworkid1 = business.addElement("lnetworkid");
                    Element ywgsd1 = business.addElement("ywgsd");
                    Element ywgsdmc1 = business.addElement("ywgsdmc");
                    //设置标签值
                    businessid1.setText(businessid);
                    cbusinessid1.setText(cbusinessid);
                    citemid1.setText(citemid);
                    citemversion1.setText(citemversion);
                    permid1.setText(permid);
                    largeitemid1.setText(largeitemid);
                    smallitemid1.setText(smallitemid);
                    smallitemname1.setText(smallitemname);
                    itemversion1.setText(itemversion);
                    regionid1.setText(regionid);
                    deptcode1.setText(deptcode);
                    deptname1.setText(deptname);
                    projectname1.setText(projectname);
                    submittype1.setText(submittype);
                    createtime1.setText(createtime);
                    applytime1.setText(applytime);
                    endtime1.setText(endtime);
                    lawaddr1.setText(lawaddr);
                    realaddr1.setText(realaddr);
                    status1.setText(status);
                    state1.setText(state);
                    groupid1.setText(groupid);
                    groupname1.setText(groupname);
                    networkid1.setText(networkid);
                    lnetworkid1.setText(lnetworkid);
                    ywgsd1.setText(ywgsd);
                    ywgsdmc1.setText(ywgsdmc);
                    String classpath = BusinessXmlUtil.class.getResource("/").getPath();
                    String filepath = classpath + File.separator + "flow1_.xml";//节点存放路径
                    xmlWrite2FileUtil.write2File(filepath, document);//写入文件
            }

    }
}
