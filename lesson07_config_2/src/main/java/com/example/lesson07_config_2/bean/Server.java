package com.example.lesson07_config_2.bean;

public class Server {
    private String title;
    private String ip;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public String toString() {
        return "Server{" +
                "title='" + title + '\'' +
                ", ip=" + ip +
                '}';
    }
}
