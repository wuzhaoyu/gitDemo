package com.wzy.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

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
@TableName("user")
public class User extends Model<User> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    @NotNull(message = "密码不为空")
    @Length(max = 1000,min = 10,message = "请输入正确字符长度")
    private Integer id;

    @TableField
    @NotBlank(message = "名字不为空")
    private String UserName ;

    @TableField
    @NotBlank(message = "密码")
    private String password ;

    /**
     * 姓名
     */
    private String name;
    /**
     * 联系电话
     */
    private String phone;
    /**
     * 锁定：0：未锁定，1：锁定
     */
    private Integer locked;
    /**
     * 作废：0：未作废，1：作废
     */
    private Integer obsolete;
    /**
     * 创建时间
     */
    @TableField("created_at")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createdAt;
    /**
     * 创建人
     */
    @TableField("created_by")
    private Integer createdBy;
    /**
     * 更新时间
     */
    @TableField("updated_at")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date updatedAt;
    /**
     * 更新人
     */
    @TableField("updated_by")
    private Integer updatedBy;
    /**
     * 是否删除：0 ：未删除，1：已删除
     */
    private Integer deleted;
    /**
     * 删除时间
     */
    @TableField("deleted_at")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date deletedAt;
    /**
     * 管理员：0 否，1 是
     */
    private Integer manager;
    /**
     * 加密
     */
    private String  salt;


    @Override
    protected Serializable pkVal() {
        return null;
    }
}
