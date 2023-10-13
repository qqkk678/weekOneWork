package com.qk.weekonework.mapper;

import com.qk.weekonework.domain.Actor;

import java.util.List;

/**
 * @ClassName ActorMapper
 * @Description: TODO
 * @Author: qk_678@163.com
 * @Date: 2023/10/13 13:20
 */
public interface ActorMapper {
    List<Actor> selAll();
    Boolean add(Actor actor);
    Boolean update(Actor actor);
    Boolean delete(Integer actor_id);
}
