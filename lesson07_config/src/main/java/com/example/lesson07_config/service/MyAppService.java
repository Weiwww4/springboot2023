package com.example.lesson07_config.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MyAppService {

    private String memo;

    public String getMemo() {
        return memo;
    }

    @Value("${myapp.memo:default}")
    public void setMemo(String memo) {
        this.memo = memo;
    }


}
