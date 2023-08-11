package com.example.lesson07_config.bean2;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@ConfigurationProperties(prefix = "myapp4.config")
public class MyApp4 {

    private String appname;
    private String appconfig;

    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname;
    }

    public String getAppconfig() {
        return appconfig;
    }

    public void setAppconfig(String appconfig) {
        this.appconfig = appconfig;
    }

    @Override
    public String toString() {
        return "MyApp4{" +
                "appname='" + appname + '\'' +
                ", appconfig='" + appconfig + '\'' +
                '}';
    }



}
