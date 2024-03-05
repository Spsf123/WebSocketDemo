// Source code is decompiled from a .class file using FernFlower decompiler.
package com.websocket.demo.chat;

public class ChatMessage {
    private String content;
    private String timestamp;
    private String sender;
    private MessageType type;
    private static int countOnline = 0;
    private int prevOnline;

    public static void addCount() {
        ++countOnline;
    }

    public static void cutCount() {
        --countOnline;
        if (countOnline <= 0) {
            countOnline = 0;
        }

    }

    public static int GetCount() {
        return countOnline;
    }

    public void setCount() {
        this.prevOnline = countOnline;
    }

    ChatMessage(String content, String timestamp, String sender, MessageType type, int prevOnline) {
        this.content = content;
        this.timestamp = timestamp;
        this.sender = sender;
        this.type = type;
        this.prevOnline = prevOnline;
    }

    public static ChatMessageBuilder builder() {
        return new ChatMessageBuilder();
    }

    public String getContent() {
        return this.content;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public String getSender() {
        return this.sender;
    }

    public MessageType getType() {
        return this.type;
    }

    public int getPrevOnline() {
        return this.prevOnline;
    }
}
