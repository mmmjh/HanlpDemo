/*
 * <summary></summary>
 * <author>hankcs</author>
 * <email>me@hankcs.com</email>
 * <create-date>2015/5/6 18:44</create-date>
 *
 * <copyright file="DemoNumberAndQuantifier.java">
 * Copyright (c) 2003-2015, hankcs. All Right Reserved, http://www.hankcs.com/
 * </copyright>
 */
package test.java.com.hankcs.demo;

import com.hankcs.hanlp.tokenizer.StandardTokenizer;

/**
 * 演示数词和数量词识别
 *
 * @author hankcs
 */
public class DemoNumberAndQuantifierRecognition
{
    public static void main(String[] args)
    {
        StandardTokenizer.SEGMENT.enableNumberQuantifierRecognize(true);
        String[] testCase = new String[]
                {
                        "十九元套餐包括什么",
                        "九千九百九十九朵玫瑰",
                        "壹佰块都不给我",
                        "９０１２３４５６７８只蚂蚁",
                        "牛奶有3000袋",
                        "ChinaJoy“扫黄”细则露胸超2厘米罚款",
                        "维基解密称已公开文件仅1%\n" + 
                        "　　【深圳商报讯】据中新社1月24日报道，“维基解密”网站曾宣称掌握了逾25万份美国国务院的机密文件，并曝光了一些美国外交电报，波及世界多个 国家，成为史上最大规模的泄密事件。事实上，目前公开的文件仅占25万份资料的1%。“维基解密”创始人朱利安·阿桑奇已经表示将加快公开文件的速度。\n" + 
                        "　　据 统计，目前“维基解密”网站总计公开了2628份外交密件，约占251287份机密文件的1%。而可靠情报显示，美国《纽约时报》、英国《卫报》、德国 《明镜周刊》、西班牙《国家报》等媒体早在数周前就已经获得了“维基解密”的部分密件，不过还不清楚上述媒体将会在何时予以公开。美联社日前发邮件给“维 基解密”网站，询问是否可以透露一下未来的计划，但至今没有回应。不过创始人阿桑奇早些时候曾公开声明，将加速外交密件的曝光速度。\n" + 
                        "　　阿 桑奇表示，他仍在不断地获得更多的秘密。就在不久前，瑞士一家银行的前雇员埃尔默因向“维基解密”网站提供约2000位名人的逃税账户资料而被捕。阿桑奇 称，这一资料将于数周内公布",
                };
        for (String sentence : testCase)
        {
            System.out.println(StandardTokenizer.segment(sentence));
        }
    }
}
