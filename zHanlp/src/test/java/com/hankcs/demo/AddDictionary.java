/*
 * <summary></summary>
 * <author>He Han</author>
 * <email>hankcs.cn@gmail.com</email>
 * <create-date>2014/12/9 13:04</create-date>
 *
 * <copyright file="DemoCustomDictionary.java" company="上海林原信息科技有限公司">
 * Copyright (c) 2003-2014, 上海林原信息科技有限公司. All Right Reserved, http://www.linrunsoft.com/
 * This source is subject to the LinrunSpace License. Please contact 上海林原信息科技有限公司 to get more information.
 * </copyright>
 */
package test.java.com.hankcs.demo;

import com.hankcs.hanlp.HanLP;
import com.hankcs.hanlp.collection.AhoCorasick.AhoCorasickDoubleArrayTrie;
import com.hankcs.hanlp.dictionary.BaseSearcher;
import com.hankcs.hanlp.dictionary.CoreDictionary;
import com.hankcs.hanlp.dictionary.CustomDictionary;

import java.util.Map;

/**
 * 演示用户词典的动态增删
 *
 * @author hankcs
 */
public class AddDictionary
{
    public static void main(String[] args)
    {
    	
        // 动态增加
        //CustomDictionary.add("王任义");
        // 强行插入
     //   CustomDictionary.insert("没机会", "nz 1024");
        // 删除词语（注释掉试试）
//      CustomDictionary.remove("攻城狮");
        String text = "这里有我是谁的有关事迹，王任义很牛了";  // 怎么可能噗哈哈！
        // 标准分词
        System.out.println(HanLP.segment(text));

        // Note:动态增删不会影响词典文件
        // 目前CustomDictionary使用DAT储存词典文件中的词语，用BinTrie储存动态加入的词语，前者性能高，后者性能低
        // 之所以保留动态增删功能，一方面是历史遗留特性，另一方面是调试用；未来可能会去掉动态增删特性。
    }
}
