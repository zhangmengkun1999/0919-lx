package com.zmk.controller;

import com.google.common.annotations.VisibleForTesting;
import com.zmk.bean.Goods;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.event.TransactionalEventListener;

import javax.annotation.Resource;

@Controller
public class GoodsController {

    @Resource
    private RedisTemplate<String, Goods> redisTemplate;





}
