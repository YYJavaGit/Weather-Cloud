package com.xiaozhu.weather.service.impl;

import com.xiaozhu.weather.po.Province;
import com.xiaozhu.weather.service.ProvinceService;
import com.xiaozhu.weather.utils.PureNetUtil;

import java.io.IOException;
import java.util.List;

public class ProvinceServiceImpl implements ProvinceService {

    @Override
    public List<Province> getProvince() {
        List<Province> province = null;
        try {
            province = PureNetUtil.getProvince();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return province;
    }
}
