package com.example.prince.googlemapapps;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Points {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("lat")
    @Expose
    private String lat;
    @SerializedName("lng")
    @Expose
    private String lng;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("cost_per_minute")
    @Expose
    private String costPerMinute;
    @SerializedName("max_reserve_time_mins")
    @Expose
    private Integer maxReserveTimeMins;
    @SerializedName("min_reserve_time_mins")
    @Expose
    private Integer minReserveTimeMins;
    @SerializedName("is_reserved")
    @Expose
    private Boolean isReserved;
    @SerializedName("reserved_until")
    @Expose
    private String reservedUntil;

    public Points(Integer id, String lat, String lng, String name, String costPerMinute, Integer maxReserveTimeMins, Integer minReserveTimeMins, Boolean isReserved, String reservedUntil) {
        this.id = id;
        this.lat = lat;
        this.lng = lng;
        this.name = name;
        this.costPerMinute = costPerMinute;
        this.maxReserveTimeMins = maxReserveTimeMins;
        this.minReserveTimeMins = minReserveTimeMins;
        this.isReserved = isReserved;
        this.reservedUntil = reservedUntil;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCostPerMinute() {
        return costPerMinute;
    }

    public void setCostPerMinute(String costPerMinute) {
        this.costPerMinute = costPerMinute;
    }

    public Integer getMaxReserveTimeMins() {
        return maxReserveTimeMins;
    }

    public void setMaxReserveTimeMins(Integer maxReserveTimeMins) {
        this.maxReserveTimeMins = maxReserveTimeMins;
    }

    public Integer getMinReserveTimeMins() {
        return minReserveTimeMins;
    }

    public void setMinReserveTimeMins(Integer minReserveTimeMins) {
        this.minReserveTimeMins = minReserveTimeMins;
    }

    public Boolean getReserved() {
        return isReserved;
    }

    public void setReserved(Boolean reserved) {
        isReserved = reserved;
    }

    public String getReservedUntil() {
        return reservedUntil;
    }

    public void setReservedUntil(String reservedUntil) {
        this.reservedUntil = reservedUntil;
    }
}
