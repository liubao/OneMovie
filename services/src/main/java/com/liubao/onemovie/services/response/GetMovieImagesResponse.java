package com.liubao.onemovie.services.response;

import com.liubao.onemovie.services.entity.ImageEntity;

import java.util.List;

public class GetMovieImagesResponse {
    private List<ImageEntity> backdrops;
    private List<ImageEntity> posters;

    public List<ImageEntity> getBackdrops() {
        return backdrops;
    }

    public void setBackdrops(List<ImageEntity> backdrops) {
        this.backdrops = backdrops;
    }

    public List<ImageEntity> getPosters() {
        return posters;
    }

    public void setPosters(List<ImageEntity> posters) {
        this.posters = posters;
    }
}
