package com.example.wt_rdit;

public class ChatRecord {
    private String profile;
    private String name;
    private  String msg;
    private String time;
    private int unreadMessages;

    public ChatRecord() {
    }

    public ChatRecord(String profile, String name, String msg, String time, int unreadMessages) {
        this.profile = profile;
        this.name = name;
        this.msg = msg;
        this.time = time;
        this.unreadMessages = unreadMessages;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getUnreadMessages() {
        return unreadMessages;
    }

    public void setUnreadMessages(int unreadMessages) {
        this.unreadMessages = unreadMessages;
    }

    @Override
    public String toString() {
        return "ChatRecord{" +
                "profile='" + profile + '\'' +
                ", name='" + name + '\'' +
                ", msg='" + msg + '\'' +
                ", time='" + time + '\'' +
                ", unreadMessages=" + unreadMessages +
                '}';
    }
}
