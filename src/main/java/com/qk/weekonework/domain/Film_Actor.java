package com.qk.weekonework.domain;

import java.util.Date;
import java.util.List;

/**
 * @ClassName Film_Actor
 * @Description: TODO
 * @Author: qk_678@163.com
 * @Date: 2023/10/13 15:52
 */
public class Film_Actor {
    private Integer actor_id;

    private Integer film_id;

    private Date last_update;

    public List<Film> getFilmList() {
        return filmList;
    }

    public void setFilmList(List<Film> filmList) {
        this.filmList = filmList;
    }

    private List<Film> filmList;

    public List<Actor> getActorList() {
        return actorList;
    }

    public void setActorList(List<Actor> actorList) {
        this.actorList = actorList;
    }

    private List<Actor> actorList;

    public Film_Actor() {
    }

    public Film_Actor(Integer actor_id, Integer film_id, Date last_update) {
        this.actor_id = actor_id;
        this.film_id = film_id;
        this.last_update = last_update;
    }

    public Integer getActor_id() {
        return actor_id;
    }

    public void setActor_id(Integer actor_id) {
        this.actor_id = actor_id;
    }

    public Integer getFilm_id() {
        return film_id;
    }

    public void setFilm_id(Integer film_id) {
        this.film_id = film_id;
    }

    public Date getLast_update() {
        return last_update;
    }

    public void setLast_update(Date last_update) {
        this.last_update = last_update;
    }

    @Override
    public String toString() {
        return "Film_Actor{" +
                "actor_id=" + actor_id +
                ", film_id=" + film_id +
                ", last_update=" + last_update +
                ", filmList=" + filmList +
                ", actorList=" + actorList +
                '}';
    }
}
