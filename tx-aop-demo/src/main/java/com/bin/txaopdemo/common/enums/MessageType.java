package com.bin.txaopdemo.common.enums;

public enum MessageType {
    ALARMMESSAGE("100", "报警消息"),
    SYSTEMMESSAGE("200", "系统消息");

    private String code;
    private String desc;

    MessageType(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return desc;
    }

    public String getDesc() {
        return desc;
    }
}
