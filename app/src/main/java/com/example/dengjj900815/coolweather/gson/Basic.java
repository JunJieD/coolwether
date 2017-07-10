package com.example.dengjj900815.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dengjj900815 on 2017/7/10.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
