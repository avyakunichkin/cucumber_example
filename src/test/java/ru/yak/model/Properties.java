package ru.yak.model;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Properties {

    private String baseUrl;

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public static Properties getProps(){
        try {
            return new ObjectMapper().readValue(User.class.getClass().getResourceAsStream("/properties.json"), Properties.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
