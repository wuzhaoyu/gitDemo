package com.wzy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 类功能说明:
 * 类修改者	创建日期2019/2/18
 * 修改说明
 * <p>Title: User.java</p>
 *
 * @author Wzy
 * @version V1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_user")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField
    private String name ;
    @TableField("role_id")
    private Integer roleId;

}
