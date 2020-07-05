package com.github.jewelry;

import com.github.jewelry.pojo.orm.JewelryPriceDO;
import org.apache.commons.lang3.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.net.URL;


/**
 * @author 石少东
 * @date 2020-07-02 20:37
 * @since 1.0
 */


public class Main {
    public static void main(String[] args) throws IOException {
        String url = "http://www.yihaozuan.com/index.php?m=GoldCloud&c=Show&a=Index&store_id=155&gstore_id=155";
        Document doc = Jsoup.parse(new URL(url), 10000);
        System.out.println(StringUtils.substringBetween(doc.toString(), "window.key='", "';"));


    }

    private static JewelryPriceDO mapJewelryPrice(Element element) {
        element.childNodes().stream().filter(one -> StringUtils.isNotBlank(one.toString())).forEach(one -> System.out.println(one));
        return null;
    }


}
