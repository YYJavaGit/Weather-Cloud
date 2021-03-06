package com.xiaozhu.weather.controller;

import com.xiaozhu.weather.po.Province;
import com.xiaozhu.weather.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProvinceController_Provider {

    @Autowired
    ProvinceService provinceService;

    @GetMapping("/Province")
    public List<Province> getProvince(){
        return provinceService.getProvince();
    }

}
