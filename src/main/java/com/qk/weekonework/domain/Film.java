package com.qk.weekonework.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @ClassName Film
 * @Description: TODO
 * @Author: qk_678@163.com
 * @Date: 2023/10/13 15:48
 */
public class Film {

    private Integer film_id;

    private String title;

    private String description;

    private Object release_year;

    private Integer language_id;

    private Integer original_language_id;

    private Integer rental_duration;

    private BigDecimal rental_rate;

    private Integer length;

    private BigDecimal replacement_cost;

    private Object rating;

    private Object special_features;

    private Date last_update;

    public List<Film> getFilmList() {
        return filmList;
    }
    public void setFilmList(List<Film> filmList) {
        this.filmList = filmList;
    }

    private List<Film> filmList;

    public Film() {
    }

    public Film(Integer film_id, String title, String description, Object release_year, Integer language_id, Integer original_language_id, Integer rental_duration, BigDecimal rental_rate, Integer length, BigDecimal replacement_cost, Object rating, Object special_features, Date last_update) {
        this.film_id = film_id;
        this.title = title;
        this.description = description;
        this.release_year = release_year;
        this.language_id = language_id;
        this.original_language_id = original_language_id;
        this.rental_duration = rental_duration;
        this.rental_rate = rental_rate;
        this.length = length;
        this.replacement_cost = replacement_cost;
        this.rating = rating;
        this.special_features = special_features;
        this.last_update = last_update;
    }

    public Integer getFilm_id() {
        return film_id;
    }

    public void setFilm_id(Integer film_id) {
        this.film_id = film_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getRelease_year() {
        return release_year;
    }

    public void setRelease_year(Object release_year) {
        this.release_year = release_year;
    }

    public Integer getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(Integer language_id) {
        this.language_id = language_id;
    }

    public Integer getOriginal_language_id() {
        return original_language_id;
    }

    public void setOriginal_language_id(Integer original_language_id) {
        this.original_language_id = original_language_id;
    }

    public Integer getRental_duration() {
        return rental_duration;
    }

    public void setRental_duration(Integer rental_duration) {
        this.rental_duration = rental_duration;
    }

    public BigDecimal getRental_rate() {
        return rental_rate;
    }

    public void setRental_rate(BigDecimal rental_rate) {
        this.rental_rate = rental_rate;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public BigDecimal getReplacement_cost() {
        return replacement_cost;
    }

    public void setReplacement_cost(BigDecimal replacement_cost) {
        this.replacement_cost = replacement_cost;
    }

    public Object getRating() {
        return rating;
    }

    public void setRating(Object rating) {
        this.rating = rating;
    }

    public Object getSpecial_features() {
        return special_features;
    }

    public void setSpecial_features(Object special_features) {
        this.special_features = special_features;
    }

    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }

    @Override
    public String toString() {
        return "Film{" +
                "film_id=" + film_id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", release_year=" + release_year +
                ", language_id=" + language_id +
                ", original_language_id=" + original_language_id +
                ", rental_duration=" + rental_duration +
                ", rental_rate=" + rental_rate +
                ", length=" + length +
                ", replacement_cost=" + replacement_cost +
                ", rating=" + rating +
                ", special_features=" + special_features +
                ", last_update=" + last_update +
                ", filmList=" + filmList +
                '}';
    }
}
