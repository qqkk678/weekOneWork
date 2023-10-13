package com.qk.weekonework.controller;

import com.qk.weekonework.domain.Actor;
import com.qk.weekonework.mapper.ActorMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * @ClassName ActorController
 * @Description: TODO
 * @Author: qk_678@163.com
 * @Date: 2023/10/13 13:21
 */
@RestController
@RequestMapping("actor")
public class ActorController {
    // 获取核心配置文件
    InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");

    // 获取 session 工厂对象
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

    public ActorController() throws IOException {
    }


    @GetMapping("/search")
    public List<Actor> findAll() {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        ActorMapper mapper = sqlSession.getMapper(ActorMapper.class);
        List<Actor> actorList = mapper.selAll();

        sqlSession.close();

        return actorList;

    }

    @GetMapping("/add")
    public String add(Integer id, String firstName, String lastName) {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        ActorMapper mapper = sqlSession.getMapper(ActorMapper.class);
        Timestamp date = new Timestamp(new Date().getTime());

        Actor actor = new Actor(id, firstName, lastName, date);
        Boolean res = mapper.add(actor);
        String result;
        if (res) {
            result = "添加成功！~";
        } else {
            result = "添加失败！~";
        }

        sqlSession.commit();
        sqlSession.close();

        return result;

    }

    @GetMapping("/update")
    public String update(Integer id, String firstName, String lastName) {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        ActorMapper mapper = sqlSession.getMapper(ActorMapper.class);
        Timestamp date = new Timestamp(new Date().getTime());

        Actor actor = new Actor(id, firstName, lastName, date);

        Boolean res = mapper.update(actor);
        String result;
        if (res) {
            result = "修改成功！~";
        } else {
            result = "修改失败！~";
        }
        sqlSession.commit();
        sqlSession.close();

        return result;

    }

    @GetMapping("/delete")
    public String delete(Integer id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();

        ActorMapper mapper = sqlSession.getMapper(ActorMapper.class);
        Boolean res = mapper.delete(id);
        String result;
        if (res) {
            result = "删除成功！~";
        } else {
            result = "删除失败！~";
        }
        sqlSession.commit();
        sqlSession.close();

        return result;

    }
}
