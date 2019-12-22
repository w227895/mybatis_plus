package com.kebo.mybatis_plus.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 在操作数据库的时候根据语句拦截，帮我们自动补充被拦截的语句的属性
 */
@Component
public class DataMetaObjectHandler implements MetaObjectHandler {
    //在执行insert语句的时候被拦截操作的
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("deleted",0,metaObject);
        this.setFieldValByName("version",1,metaObject);
        this.setFieldValByName("createTime",new Date(),metaObject);
        this.setFieldValByName("updateTime",new Date(),metaObject);
    }
    //修改语句
    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updateTime",new Date(),metaObject);
    }
}
