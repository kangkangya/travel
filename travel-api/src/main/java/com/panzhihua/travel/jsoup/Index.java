package com.panzhihua.travel.jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;

public class Index {

    public static void main(String[] args) throws Exception {
        Document document = Jsoup.parse(new File("E:\\workspace\\vue\\mfw-html\\scenic1.html"), "utf-8");

        Elements elements = document.getElementsByClass("ct-text");

        elements.forEach(element -> {
            Element firstElement = element.child(0);
            Element child = firstElement.child(0);

            System.out.println(child.text());
        });
    }
}
