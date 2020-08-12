package com.mybatis.xu.mp.pojo;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author admin
 * @version 1.0.0
 * @ClassName User.java
 * @Description TODO
 * @createTime 2020年08月06日 14:51:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class User {

    @TableId(type = IdType.ID_WORKER)
    private Long id;


    private String name;


    private Integer age;


    private String email;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @Version
    private Integer version;
}
