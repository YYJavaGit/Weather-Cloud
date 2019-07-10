package com.xiaozhu.weather.controller;

import com.netflix.discovery.converters.Auto;
import com.xiaozhu.weather.po.Province;
import com.xiaozhu.weather.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/Province")
public class ProvinceController_Provider {
    @Autowired
    ProvinceService provinceService;

    @GetMapping("/")
    public List<Province> getProvince(){
        return provinceService.getProvince();
    }

}
