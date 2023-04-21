package com.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 系统用户
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "t_sys_user")
public class SysUser {
    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    /**
     * 账号
     */
    @TableField(value = "account")
    private String account;

    /**
     * 真是姓名
     */
    @TableField(value = "real_name")
    private String realName;

    /**
     * 密码
     */
    @TableField(value = "`password`")
    private String password;

    /**
     * 性别（1:女、 2:男）
     */
    @TableField(value = "sex")
    private Integer sex;

    /**
     * 出生日期（年-月-日）
     */
    @TableField(value = "birthday")
    private Date birthday;

    /**
     * 手机号码
     */
    @TableField(value = "phone")
    private String phone;

    /**
     * 用户地址
     */
    @TableField(value = "address")
    private String address;

    /**
     * 用户角色id
     */
    @TableField(value = "role_id")
    private SysRole roleId;

    /**
     * 创建人
     */
    @TableField(value = "created_user_id")
    private Long createdUserId;

    /**
     * 创建时间
     */
    @TableField(value = "created_time")
    private Date createdTime;

    /**
     * 修改人
     */
    @TableField(value = "updated_user_id")
    private Long updatedUserId;

    /**
     * 修改时间
     */
    @TableField(value = "updated_time")
    private Date updatedTime;

    /**
     * 逻辑删除
     */
    @TableField(value = "deleted")
    private Integer deleted;
}