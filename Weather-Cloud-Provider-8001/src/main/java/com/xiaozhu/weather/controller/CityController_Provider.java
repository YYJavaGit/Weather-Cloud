package com.xiaozhu.weather.controller;

import com.xiaozhu.weather.po.City;
import com.xiaozhu.weather.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/City")
public class CityController_Provider {

    @Autowired
    CityService cityService;

    @GetMapping("/{code}")
    public List<City> getCityByProvinceCode(String code){
        return cityService.getCityByProvinceCode(code);
    }

}
