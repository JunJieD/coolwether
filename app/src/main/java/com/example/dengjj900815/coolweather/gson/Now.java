package com.example.dengjj900815.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dengjj900815 on 2017/7/10.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
