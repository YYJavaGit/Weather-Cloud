package com.xiaozhu.weather.service.impl;

import com.xiaozhu.weather.po.City;
import com.xiaozhu.weather.service.CityService;
import com.xiaozhu.weather.utils.PureNetUtil;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Override
    public List<City> getCityByProvinceCode(String code) {
        List<City> city = null;
        try {
            city = PureNetUtil.getCity(code);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return city;
    }
}
