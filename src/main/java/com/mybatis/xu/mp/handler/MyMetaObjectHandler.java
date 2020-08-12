package com.mybatis.xu.mp.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName MyMetaObjectHandler.java
 * @Description TODO
 * @createTime 2020年08月11日 15:05:00
 */
@Slf4j
@Component // 注入到IOC容器中
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        // 自动填充值
        this.setFieldValByName("createTime", new Date(), metaObject);
        this.setFieldValByName("updateTime", new Date(), metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        // 自动填充值
        this.setFieldValByName("updateTime", new Date(), metaObject);
    }
}
