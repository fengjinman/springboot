package com.jinman.reptile.controller;

import com.alibaba.fastjson.JSONObject;
import com.jinman.reptile.service.ReptileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReptileController {

    @Autowired
    ReptileService reptileService;

    /**
     * 异步接口，接收信息之后开始异步爬取数据，直接返还成功 拿到url列表之后维护进度条list
     * @param uid
     * @return
     */
    @ResponseBody
    @RequestMapping("/reptile/start")
    public Object reptile(String uid) {

        reptileService.asynchronous(uid);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 200);
        jsonObject.put("uid", uid);
        return jsonObject;
    }

    @RequestMapping("/reptilePage")
    public String reptilePage() {
        return "reptile/reptile";
    }

    @ResponseBody
    @RequestMapping("/reptile/queryPro")
    public Object queryPro(String uid) {
        int pro = reptileService.queryPro(uid);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 200);
        jsonObject.put("pro", pro);
        return jsonObject;
    }

    @ResponseBody
    @RequestMapping("/reptile/queryData")
    public Object queryData(String uid) {
        String jsonstr = "{\n" +
                "            tooltip: {\n" +
                "                show: false\n" +
                "            },\n" +
                "            series: [{\n" +
                "                type: 'force',\n" +
                "                name: \"Force tree\",\n" +
                "                itemStyle: {\n" +
                "                    normal: {\n" +
                "                        label: {\n" +
                "                            show: true\n" +
                "                        },\n" +
                "                        nodeStyle: {\n" +
                "                            brushType: 'both',\n" +
                "                            borderColor: 'rgba(0,215,0,0.4)',\n" +
                "                            borderWidth: 1\n" +
                "                        }\n" +
                "                    }\n" +
                "                },\n" +
                "                categories: [{\n" +
                "                    name: 'lol'\n" +
                "                }, {\n" +
                "                    name: '位置'\n" +
                "                }, {\n" +
                "                    name: '英雄'\n" +
                "                }, {\n" +
                "                    name: '技能'\n" +
                "                }],\n" +
                "                nodes: [{\n" +
                "                    id: 0,\n" +
                "                    category: 0,\n" +
                "                    name: '0',\n" +
                "                    label: '大乱斗',\n" +
                "                    symbolSize: 60,\n" +
                "                    ignore: false,\n" +
                "                    flag: true\n" +
                "                }, {\n" +
                "                    id: 1,\n" +
                "                    category: 1,\n" +
                "                    name: '1',\n" +
                "                    label: '上单',\n" +
                "                    symbolSize: 40,\n" +
                "                    ignore: true,\n" +
                "                    flag: true\n" +
                "                }, {\n" +
                "                    id: 2,\n" +
                "                    category: 2,\n" +
                "                    name: '2',\n" +
                "                    label: '剑姬',\n" +
                "                    symbolSize: 20,\n" +
                "                    ignore: true,\n" +
                "                    flag: true\n" +
                "                }, {\n" +
                "                    id: 3,\n" +
                "                    category: 2,\n" +
                "                    name: '3',\n" +
                "                    label: '贾科斯',\n" +
                "                    symbolSize: 20,\n" +
                "                    ignore: true,\n" +
                "                    flag: true\n" +
                "                }, {\n" +
                "                    id: 4,\n" +
                "                    category: 1,\n" +
                "                    name: '4',\n" +
                "                    label: '中单',\n" +
                "                    symbolSize: 40,\n" +
                "                    ignore: true,\n" +
                "                    flag: true\n" +
                "                }, {\n" +
                "                    id: 5,\n" +
                "                    category: 2,\n" +
                "                    name: '5',\n" +
                "                    label: '辛德拉',\n" +
                "                    symbolSize: 20,\n" +
                "                    ignore: true,\n" +
                "                    flag: true\n" +
                "                }, {\n" +
                "                    id: 6,\n" +
                "                    category: 2,\n" +
                "                    name: '6',\n" +
                "                    label: '阿卡丽',\n" +
                "                    symbolSize: 20,\n" +
                "                    ignore: true,\n" +
                "                    flag: true\n" +
                "                }, {\n" +
                "                    id: 7,\n" +
                "                    category: 2,\n" +
                "                    name: '7',\n" +
                "                    label: '发条',\n" +
                "                    symbolSize: 20,\n" +
                "                    ignore: true,\n" +
                "                    flag: true\n" +
                "                }, {\n" +
                "                    id: 8,\n" +
                "                    category: 1,\n" +
                "                    name: '8',\n" +
                "                    label: '打野',\n" +
                "                    symbolSize: 40,\n" +
                "                    ignore: true,\n" +
                "                    flag: true\n" +
                "                }, {\n" +
                "                    id: 9,\n" +
                "                    category: 2,\n" +
                "                    name: '9',\n" +
                "                    label: '扎克',\n" +
                "                    symbolSize: 20,\n" +
                "                    ignore: true,\n" +
                "                    flag: true\n" +
                "                }, {\n" +
                "                    id: 10,\n" +
                "                    category: 2,\n" +
                "                    name: '10',\n" +
                "                    label: '男枪',\n" +
                "                    symbolSize: 20,\n" +
                "                    ignore: true,\n" +
                "                    flag: true\n" +
                "                }, {\n" +
                "                    id: 11,\n" +
                "                    category: 2,\n" +
                "                    name: '11',\n" +
                "                    label: '豹女',\n" +
                "                    symbolSize: 20,\n" +
                "                    ignore: true,\n" +
                "                    flag: true\n" +
                "                }, {\n" +
                "                    id: 12,\n" +
                "                    category: 2,\n" +
                "                    name: '12',\n" +
                "                    label: '千珏',\n" +
                "                    symbolSize: 20,\n" +
                "                    ignore: true,\n" +
                "                    flag: true\n" +
                "                }, {\n" +
                "                    id: 13,\n" +
                "                    category: 3,\n" +
                "                    name: '13',\n" +
                "                    label: '隼舞',\n" +
                "                    number: 45,\n" +
                "                    symbolSize: 20,\n" +
                "                    ignore: true,\n" +
                "                    flag: true\n" +
                "                }, {\n" +
                "                    id: 14,\n" +
                "                    category: 3,\n" +
                "                    name: '14',\n" +
                "                    label: '寒影',\n" +
                "                    number: 52,\n" +
                "                    symbolSize: 20,\n" +
                "                    ignore: true,\n" +
                "                    flag: true\n" +
                "                }, {\n" +
                "                    id: 15,\n" +
                "                    category: 3,\n" +
                "                    name: '15',\n" +
                "                    label: '霞阵',\n" +
                "                    number: 52,\n" +
                "                    symbolSize: 20,\n" +
                "                    ignore: true,\n" +
                "                    flag: true\n" +
                "                }, {\n" +
                "                    id: 16,\n" +
                "                    category: 3,\n" +
                "                    name: '16',\n" +
                "                    label: '幻樱杀缭乱',\n" +
                "                    number: 52,\n" +
                "                    symbolSize: 30,\n" +
                "                    ignore: true,\n" +
                "                    flag: true\n" +
                "                }],\n" +
                "                links: [{\n" +
                "                    source: 1,\n" +
                "                    target: 0\n" +
                "                }, {\n" +
                "                    source: 4,\n" +
                "                    target: 0\n" +
                "                }, {\n" +
                "                    source: 8,\n" +
                "                    target: 0\n" +
                "                }, {\n" +
                "                    source: 2,\n" +
                "                    target: 1\n" +
                "                }, {\n" +
                "                    source: 3,\n" +
                "                    target: 1\n" +
                "                }, {\n" +
                "                    source: 5,\n" +
                "                    target: 4\n" +
                "                }, {\n" +
                "                    source: 6,\n" +
                "                    target: 4\n" +
                "                }, {\n" +
                "                    source: 7,\n" +
                "                    target: 4\n" +
                "                }, {\n" +
                "                    source: 9,\n" +
                "                    target: 8\n" +
                "                }, {\n" +
                "                    source: 10,\n" +
                "                    target: 8\n" +
                "                }, {\n" +
                "                    source: 11,\n" +
                "                    target: 8\n" +
                "                }, {\n" +
                "                    source: 12,\n" +
                "                    target: 8\n" +
                "                }, {\n" +
                "                    source: 13,\n" +
                "                    target: 6\n" +
                "                }, {\n" +
                "                    source: 14,\n" +
                "                    target: 6\n" +
                "                }, {\n" +
                "                    source: 15,\n" +
                "                    target: 6\n" +
                "                }, {\n" +
                "                    source: 16,\n" +
                "                    target: 6\n" +
                "                }]\n" +
                "            }]\n" +
                "        }";
        JSONObject data = reptileService.queryData(uid);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 200);
        jsonObject.put("data", data);
        return jsonObject;
//        JSONObject data = JSONObject.parseObject(jsonstr);
//        JSONObject jsonObject = new JSONObject();
//        jsonObject.put("code", 200);
//        jsonObject.put("data", data);
//        return jsonObject;
    }
}
