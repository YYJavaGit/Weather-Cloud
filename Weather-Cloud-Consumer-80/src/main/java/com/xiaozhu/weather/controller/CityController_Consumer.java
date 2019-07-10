package com.xiaozhu.weather.controller;

import com.xiaozhu.weather.po.City;
import com.xiaozhu.weather.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CityController_Consumer {

    @Autowired
    CityService cityService;

    @GetMapping("/Province/{code}")
    public List<City> getCityByProvinceCode(String code){
        return cityService.getCityByProvinceCode(code);
    }

}
