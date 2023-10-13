package com.qk.weekonework.controller;

import com.qk.weekonework.domain.Actor;
import com.qk.weekonework.mapper.ActorFilmMapper;
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
import java.util.List;

/**
 * @ClassName ActorFilmController
 * @Description: TODO
 * @Author: qk_678@163.com
 * @Date: 2023/10/13 15:58
 */
@RestController
@RequestMapping("actorfilm")
public class ActorFilmController {
    // 获取核心配置文件
    InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");

    // 获取 session 工厂对象
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);

    public ActorFilmController() throws IOException {
    }


    @GetMapping("/search")
    public List findAll(){
        SqlSession sqlSession = sqlSessionFactory.openSession();

        ActorFilmMapper mapper = sqlSession.getMapper(ActorFilmMapper.class);
        List list = mapper.selAll();

        sqlSession.close();

        return list;

    }
}
