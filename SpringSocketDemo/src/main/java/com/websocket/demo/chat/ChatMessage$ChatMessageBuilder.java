// Source code is decompiled from a .class file using FernFlower decompiler.
package com.websocket.demo.chat;

public class ChatMessage$ChatMessageBuilder {
    private String content;
    private String timestamp;
    private String sender;
    private MessageType type;
    private int prevOnline;

    ChatMessage$ChatMessageBuilder() {
    }

    public ChatMessage$ChatMessageBuilder content(String content) {
        this.content = content;
        return this;
    }

    public ChatMessage$ChatMessageBuilder timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public ChatMessage$ChatMessageBuilder sender(String sender) {
        this.sender = sender;
        return this;
    }

    public ChatMessage$ChatMessageBuilder type(MessageType type) {
        this.type = type;
        return this;
    }

    public ChatMessage$ChatMessageBuilder prevOnline(int prevOnline) {
        this.prevOnline = prevOnline;
        return this;
    }

    public ChatMessage build() {
        return new ChatMessage(this.content, this.timestamp, this.sender, this.type, this.prevOnline);
    }

    public String toString() {
        String var10000 = this.content;
        return "ChatMessage.ChatMessageBuilder(content=" + var10000 + ", timestamp=" + this.timestamp + ", sender=" + this.sender + ", type=" + String.valueOf(this.type) + ", prevOnline=" + this.prevOnline + ")";
    }
}
