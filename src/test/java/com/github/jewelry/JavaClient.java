package com.github.jewelry;

import javax.websocket.ClientEndpoint;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;

/**
 * @author 石少东
 * @date 2020-07-02 23:37
 * @since 1.0
 */


@ClientEndpoint
public class JavaClient {

    private Session session;

    @OnOpen
    public void open(Session session) {
        this.session = session;
    }

    @OnMessage
    public void onMessage(String message) {
        System.out.println("----------------------------------------------------");
        System.out.println(message);

    }

    @OnClose
    public void onClose() {
        System.out.println("Websocket closed");
    }

    /**
     * 发送客户端消息到服务端
     *
     * @param message 消息内容
     */
    public void send(String message) {
        this.session.getAsyncRemote().sendText(message);
    }

}
