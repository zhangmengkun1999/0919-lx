package com.zmk.test;

import com.zmk.bean.Goods;
import com.zmk.utils.IOToFileUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.data.redis.core.BoundListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = "classpath:applicationContext-redis.xml")
class BaseTest {
    @Resource
    private RedisTemplate<String, Goods> redisTemplate;

    @Test
    public void testimmport(){
        List<String> strings = IOToFileUtils.readFileByLinesList("E:\\ideaworkspace\\0919-lx\\src\\test\\resources\\test.txt");
        //防止添加重复数据，如果有重复，就删掉
        redisTemplate.delete("goodslist");

        BoundListOperations<String, Goods> goodslist = redisTemplate.boundListOps("goodslist");


    }


}
