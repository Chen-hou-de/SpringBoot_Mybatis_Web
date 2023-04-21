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
    * 药品供货商
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "t_supplier")
public class Supplier {
    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    /**
     * 供货商编号
     */
    @TableField(value = "sup_code")
    private String supCode;

    /**
     * 供货商名称
     */
    @TableField(value = "sup_name")
    private String supName;

    /**
     * 供货商描述
     */
    @TableField(value = "sup_desc")
    private String supDesc;

    /**
     * 供货商联系人
     */
    @TableField(value = "sup_contact")
    private String supContact;

    /**
     * 联系电话
     */
    @TableField(value = "sup_phone")
    private String supPhone;

    /**
     * 供货商地址
     */
    @TableField(value = "sup_address")
    private String supAddress;

    /**
     * 传真
     */
    @TableField(value = "sup_fax")
    private String supFax;

    /**
     * 创建人id
     */
    @TableField(value = "created_user_id")
    private Long createdUserId;

    /**
     * 创建时间
     */
    @TableField(value = "created_time")
    private Date createdTime;

    /**
     * 修改时间
     */
    @TableField(value = "updated_time")
    private Date updatedTime;

    /**
     * 修改人id
     */
    @TableField(value = "updated_user_id")
    private Long updatedUserId;
}