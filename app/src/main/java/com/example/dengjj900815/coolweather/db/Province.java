package com.example.dengjj900815.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by dengjj900815 on 2017/7/4.
 */

public class Province extends DataSupport{
    private int id;
    private String provinceName;//省名
    private int provinceCode;//省代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
