package com.liubao.onemovie.services.response;

import com.liubao.onemovie.services.entity.MovieEntity;

import java.util.List;

public class SearchMovieResponse {
    private List<MovieEntity> results;

    public List<MovieEntity> getResults() {
        return results;
    }

    public void setResults(List<MovieEntity> results) {
        this.results = results;
    }
}
