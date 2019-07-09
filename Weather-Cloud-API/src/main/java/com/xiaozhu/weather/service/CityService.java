package com.xiaozhu.weather.service;

import com.xiaozhu.weather.po.City;

import java.util.List;

public interface CityService {

    public List<City> getCityByProvinceCode(String code);

}
