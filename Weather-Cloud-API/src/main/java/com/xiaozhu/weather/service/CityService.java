package com.xiaozhu.weather.service;

import com.xiaozhu.weather.po.City;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(value = "Weather-Cloud-Provider")
public interface CityService {

    @GetMapping("/Province/{code}")
    public List<City> getCityByProvinceCode(String code);

}
