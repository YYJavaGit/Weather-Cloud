package com.xiaozhu.weather.po;

public class City {
    private String id;
    private String url;
    private String code;
    private String city;
    private String province;

    public City(){
    };

    public City(String id, String url, String code, String city, String province) {
        this.id = id;
        this.url = url;
        this.code = code;
        this.city = city;
        this.province = province;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
