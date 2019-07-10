package com.xiaozhu.weather.service;

import com.xiaozhu.weather.po.Province;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(value = "Weather-Cloud-Provider")
public interface ProvinceService {

    @GetMapping("/")
    public List<Province> getProvince();

}
