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
    * 收货地址
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "t_address")
public class Address {
    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    /**
     * 联系人姓名
     */
    @TableField(value = "contact")
    private String contact;

    /**
     * 收货地址明细
     */
    @TableField(value = "address_desc")
    private String addressDesc;

    /**
     * 邮编
     */
    @TableField(value = "post_code")
    private String postCode;

    /**
     * 联系人电话
     */
    @TableField(value = "tel")
    private String tel;

    /**
     * 创建者
     */
    @TableField(value = "created_user_id")
    private Long createdUserId;

    /**
     * 创建时间
     */
    @TableField(value = "created_time")
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

    /**
     * 用户ID
     */
    @TableField(value = "user_id")
    private Long userId;
}