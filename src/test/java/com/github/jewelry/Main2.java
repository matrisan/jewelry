package com.github.jewelry;

import org.apache.commons.lang3.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import javax.websocket.ContainerProvider;
import javax.websocket.DeploymentException;
import javax.websocket.WebSocketContainer;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;


/**
 * @author 石少东
 * @date 2020-07-02 20:37
 * @since 1.0
 */


public class Main2 {
    public static void main(String[] args) throws IOException, URISyntaxException, DeploymentException, InterruptedException {
        WebSocketContainer container = ContainerProvider.getWebSocketContainer();
        JavaClient client = new JavaClient();
        container.connectToServer(client, new URI("ws://120.24.164.224:8891/"));
        String url = "http://www.yihaozuan.com/index.php?m=GoldCloud&c=Show&a=Index&store_id=155&gstore_id=155";
        Document doc = Jsoup.parse(new URL(url), 10000);
        System.out.println(StringUtils.substringBetween(doc.toString(), "window.key='", "';"));
        client.send(StringUtils.substringBetween(doc.toString(), "window.key='", "';"));
        Thread.currentThread().sleep(999999);
    }



}
