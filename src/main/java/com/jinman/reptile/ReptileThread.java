package com.jinman.reptile;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.jinman.reptile.service.ReptileServiceImpl;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReptileThread extends Thread {

    double total = 0;

    double pro = 0;

    public ReptileThread(String uid) {
        this.uid = uid;
    }

    String uid;

    @Override
    public void run() {
        String url = "https://www.weibo.com/ajax/statuses/mymblog?uid=5593532821&page=1&feature=0";
        System.out.println("爬虫条件uid = " + uid);
        System.out.println("爬虫根路径url = " + url);
        // 登录微博的问题  进度条

        JSONObject data = new JSONObject();
        JSONArray series = new JSONArray();
        JSONObject seriesObj = new JSONObject();
        seriesObj.put("type","force");
        seriesObj.put("name","Force tree");
        seriesObj.put("itemStyle",getItemStyle());
        seriesObj.put("categories",getCategories());
        seriesObj.put("nodes",getNodes());
        seriesObj.put("links",getLinks());
        series.add(seriesObj);
        data.put("tooltip",getToolTip());
        data.put("series",series);

        total = 10;
        for (int i = 0; i < 10; i++) {
            try {
//                System.out.println(i);
                Thread.sleep(500);
            } catch (InterruptedException ignored) {
                log.info("InterruptedException");
            }
            pro++;
            ReptileServiceImpl.MAP_PRO.put(uid, genPro());
        }

        ReptileServiceImpl.MAP_DATA.put(uid, data);

    }

    private JSONArray getLinks() {
        JSONArray links = new JSONArray();
        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("source",1);
        jsonObject1.put("target",0);
        links.add(jsonObject1);
        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("source",4);
        jsonObject2.put("target",0);
        links.add(jsonObject2);
        JSONObject jsonObject3 = new JSONObject();
        jsonObject3.put("source",8);
        jsonObject3.put("target",0);
        links.add(jsonObject3);
        JSONObject jsonObject4 = new JSONObject();
        jsonObject4.put("source",2);
        jsonObject4.put("target",1);
        links.add(jsonObject4);
        JSONObject jsonObject5 = new JSONObject();
        jsonObject5.put("source",3);
        jsonObject5.put("target",1);
        links.add(jsonObject5);
        JSONObject jsonObject6 = new JSONObject();
        jsonObject6.put("source",5);
        jsonObject6.put("target",4);
        links.add(jsonObject6);
        JSONObject jsonObject7 = new JSONObject();
        jsonObject7.put("source",6);
        jsonObject7.put("target",4);
        links.add(jsonObject7);
        JSONObject jsonObject8 = new JSONObject();
        jsonObject8.put("source",7);
        jsonObject8.put("target",4);
        links.add(jsonObject8);
        JSONObject jsonObject9 = new JSONObject();
        jsonObject9.put("source",9);
        jsonObject9.put("target",8);
        links.add(jsonObject9);
        JSONObject jsonObject10 = new JSONObject();
        jsonObject10.put("source",10);
        jsonObject10.put("target",8);
        links.add(jsonObject10);
        JSONObject jsonObject11 = new JSONObject();
        jsonObject11.put("source",11);
        jsonObject11.put("target",8);
        links.add(jsonObject11);
        JSONObject jsonObject12 = new JSONObject();
        jsonObject12.put("source",12);
        jsonObject12.put("target",8);
        links.add(jsonObject12);
        JSONObject jsonObject13 = new JSONObject();
        jsonObject13.put("source",13);
        jsonObject13.put("target",6);
        links.add(jsonObject13);
        JSONObject jsonObject14 = new JSONObject();
        jsonObject14.put("source",14);
        jsonObject14.put("target",6);
        links.add(jsonObject14);
        JSONObject jsonObject15 = new JSONObject();
        jsonObject15.put("source",15);
        jsonObject15.put("target",6);
        links.add(jsonObject15);
        JSONObject jsonObject16 = new JSONObject();
        jsonObject16.put("source",16);
        jsonObject16.put("target",6);
        links.add(jsonObject16);
        return links;
    }

    private JSONArray getNodes() {
        JSONArray nodes = new JSONArray();
        JSONObject node1 = new JSONObject();
        node1.put("id",0);
        node1.put("category",0);
        node1.put("name","0");
        node1.put("label","大乱斗");
        node1.put("symbolSize",60);
        node1.put("ignore",false);
        node1.put("flag",true);
        nodes.add(node1);
        JSONObject node2 = new JSONObject();
        node2.put("id",1);
        node2.put("category",1);
        node2.put("name","1");
        node2.put("label","上单");
        node2.put("symbolSize",40);
        node2.put("ignore",true);
        node2.put("flag",true);
        nodes.add(node2);
        JSONObject node3 = new JSONObject();
        node3.put("id",2);
        node3.put("category",2);
        node3.put("name","2");
        node3.put("label","剑姬");
        node3.put("symbolSize",20);
        node3.put("ignore",true);
        node3.put("flag",true);
        nodes.add(node3);
        JSONObject node4 = new JSONObject();
        node4.put("id",3);
        node4.put("category",2);
        node4.put("name","3");
        node4.put("label","贾克斯");
        node4.put("symbolSize",20);
        node4.put("ignore",true);
        node4.put("flag",true);
        nodes.add(node4);
        JSONObject node17 = new JSONObject();
        node17.put("id",4);
        node17.put("category",1);
        node17.put("name","4");
        node17.put("label","中单");
        node17.put("symbolSize",40);
        node17.put("ignore",true);
        node17.put("flag",true);
        nodes.add(node17);
        JSONObject node5 = new JSONObject();
        node5.put("id",5);
        node5.put("category",2);
        node5.put("name","5");
        node5.put("label","辛德拉");
        node5.put("symbolSize",20);
        node5.put("ignore",true);
        node5.put("flag",true);
        nodes.add(node5);
        JSONObject node6 = new JSONObject();
        node6.put("id",6);
        node6.put("category",2);
        node6.put("name","6");
        node6.put("label","阿卡丽");
        node6.put("symbolSize",20);
        node6.put("ignore",true);
        node6.put("flag",true);
        nodes.add(node6);
        JSONObject node7 = new JSONObject();
        node7.put("id",7);
        node7.put("category",2);
        node7.put("name","7");
        node7.put("label","发条");
        node7.put("symbolSize",20);
        node7.put("ignore",true);
        node7.put("flag",true);
        nodes.add(node7);
        JSONObject node8 = new JSONObject();
        node8.put("id",8);
        node8.put("category",1);
        node8.put("name","8");
        node8.put("label","打野");
        node8.put("symbolSize",40);
        node8.put("ignore",true);
        node8.put("flag",true);
        nodes.add(node8);
        JSONObject node9 = new JSONObject();
        node9.put("id",9);
        node9.put("category",2);
        node9.put("name","9");
        node9.put("label","扎克");
        node9.put("symbolSize",20);
        node9.put("ignore",true);
        node9.put("flag",true);
        nodes.add(node9);
        JSONObject node10 = new JSONObject();
        node10.put("id",10);
        node10.put("category",2);
        node10.put("name","10");
        node10.put("label","男枪");
        node10.put("symbolSize",20);
        node10.put("ignore",true);
        node10.put("flag",true);
        nodes.add(node10);
        JSONObject node11 = new JSONObject();
        node11.put("id",11);
        node11.put("category",2);
        node11.put("name","11");
        node11.put("label","豹女");
        node11.put("symbolSize",20);
        node11.put("ignore",true);
        node11.put("flag",true);
        nodes.add(node11);
        JSONObject node12 = new JSONObject();
        node12.put("id",12);
        node12.put("category",2);
        node12.put("name","12");
        node12.put("label","千珏");
        node12.put("symbolSize",20);
        node12.put("ignore",true);
        node12.put("flag",true);
        nodes.add(node12);
        JSONObject node13 = new JSONObject();
        node13.put("id",13);
        node13.put("category",3);
        node13.put("name","13");
        node13.put("label","隼舞");
        node13.put("number",45);
        node13.put("symbolSize",20);
        node13.put("ignore",true);
        node13.put("flag",true);
        nodes.add(node13);
        JSONObject node14 = new JSONObject();
        node14.put("id",14);
        node14.put("category",3);
        node14.put("name","14");
        node14.put("label","寒影");
        node14.put("number",52);
        node14.put("symbolSize",20);
        node14.put("ignore",true);
        node14.put("flag",true);
        nodes.add(node14);
        JSONObject node15 = new JSONObject();
        node15.put("id",15);
        node15.put("category",3);
        node15.put("name","15");
        node15.put("label","霞阵");
        node15.put("number",52);
        node15.put("symbolSize",20);
        node15.put("ignore",true);
        node15.put("flag",true);
        nodes.add(node15);
        JSONObject node16 = new JSONObject();
        node16.put("id",16);
        node16.put("category",3);
        node16.put("name","16");
        node16.put("label","幻樱杀缭乱");
        node16.put("number",52);
        node16.put("symbolSize",30);
        node16.put("ignore",true);
        node16.put("flag",true);
        nodes.add(node16);
        return nodes;
    }

    private JSONArray getCategories() {
        JSONArray categories = new JSONArray();
        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("name","lol");
        categories.add(jsonObject1);
        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("name","位置");
        categories.add(jsonObject2);
        JSONObject jsonObject3 = new JSONObject();
        jsonObject3.put("name","英雄");
        categories.add(jsonObject3);
        JSONObject jsonObject4 = new JSONObject();
        jsonObject4.put("name","技能");
        categories.add(jsonObject4);
        return categories;
    }

    private JSONObject getItemStyle() {
        JSONObject itemStyle = new JSONObject();
        itemStyle.put("normal",getNormal());
        return itemStyle;
    }

    private JSONObject getNormal() {
        JSONObject normal = new JSONObject();
        normal.put("label",getLabel());
        normal.put("nodeStyle",getNodeStyle());
        return normal;
    }

    private JSONObject getNodeStyle() {
        JSONObject nodeStyle = new JSONObject();
        nodeStyle.put("brushType","both");
        nodeStyle.put("borderColor","rgba(0,215,0,0.4)");
        nodeStyle.put("borderWidth",1);
        return nodeStyle;
    }

    private JSONObject getLabel() {
        JSONObject label = new JSONObject();
        label.put("show",true);
        return label;
    }

    private JSONObject getToolTip() {
        JSONObject tooltip = new JSONObject();
        tooltip.put("show",false);
        return tooltip;
    }

    /**
     * 计算用double计算实际的百分比  返回用int防止页面样式改变
     *
     * @return
     */
    public int genPro() {
        if (total != 0 && pro != 0) {
            return (int) ((pro / total) * 100);
        }
        return 0;
    }
}
