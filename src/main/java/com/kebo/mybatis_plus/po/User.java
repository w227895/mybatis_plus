package com.kebo.mybatis_plus.po;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

/**
 * @description:
 * @author: kb
 * @create: 2019-12-22 20:14
 **/
@Data
public class User {
    //如果需要主键生成策略为自增长，就可以加上下面的标签
    //@TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private Integer age;
    private String email;
    @TableField(fill = FieldFill.INSERT) //指定属性在添加操作的时候进行自动补充
    private Date createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)//指定属性在添加和修改操作的时候自动补充
    private Date updateTime;
    //用户乐观锁修改版本号的
    @Version
    @TableField(fill = FieldFill.INSERT)
    private Integer version;

    @TableLogic
    @TableField(fill = FieldFill.INSERT)
    private Integer deleted;
}

