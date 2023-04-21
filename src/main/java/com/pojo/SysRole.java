package com.pojo;

import com.baomidou.mybatisplus.annotation.*;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

/**
    * 系统角色
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "t_sys_role")
public class SysRole {
    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    /**
     * 角色编码
     */
    @TableField(value = "code")
    private String code;

    /**
     * 角色名称
     */
    @TableField(value = "role_name")
    private String roleName;

    /**
     * 创建者
     */
    @TableField(value = "created_user_id")
    private Long createdUserId;

    /**
     * 创建时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @TableField(value = "created_time",fill = FieldFill.INSERT)
    private Date createdTime;

    /**
     * 修改者
     */
    @TableField(value = "updated_user_id")
    private Long updatedUserId;

    /**
     * 修改时间
     */
    @TableField(value = "updated_time")
    private Date updatedTime;





}