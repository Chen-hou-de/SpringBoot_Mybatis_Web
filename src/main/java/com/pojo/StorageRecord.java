package com.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 入库记录
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "t_storage_record")
public class StorageRecord {
    /**
     * 主键ID
     */
    @TableId(value = "id", type = IdType.INPUT)
    private Long id;

    /**
     * 入库记录编码
     */
    @TableField(value = "sr_code")
    private String srCode;

    /**
     * 商品名称
     */
    @TableField(value = "goods_name")
    private String goodsName;

    /**
     * 商品描述
     */
    @TableField(value = "goods_desc")
    private String goodsDesc;

    /**
     * 商品单位
     */
    @TableField(value = "goods_unit")
    private String goodsUnit;

    /**
     * 入库数量
     */
    @TableField(value = "goods_count")
    private BigDecimal goodsCount;

    /**
     * 入库商品总额
     */
    @TableField(value = "total_amount")
    private BigDecimal totalAmount;

    /**
     * 支付状态（1：未支付 2：已支付）
     */
    @TableField(value = "pay_status")
    private Integer payStatus;

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
     * 修改人id
     */
    @TableField(value = "updated_user_id")
    private Long updatedUserId;

    /**
     * 修改时间
     */
    @TableField(value = "updated_time")
    private Date updatedTime;

    /**
     * 供货商ID
     */
    @TableField(value = "supplier_id")
    private Long supplierId;
}