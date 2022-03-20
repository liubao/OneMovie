package com.liubao.onemovie.services.response;


import com.liubao.onemovie.services.entity.ConfigurationEntity;

public class GetImageConfigurationResponse {

    private ConfigurationEntity images;

    public ConfigurationEntity getImages() {
        return images;
    }

    public void setImages(ConfigurationEntity images) {
        this.images = images;
    }
}
