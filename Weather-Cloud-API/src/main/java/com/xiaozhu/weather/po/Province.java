package com.xiaozhu.weather.po;

public class Province {
    private String code;
    private String name;
    private String url;

    public Province() {
    }

    public Province(String code, String name, String url) {
        this.code = code;
        this.name = name;
        this.url = url;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
