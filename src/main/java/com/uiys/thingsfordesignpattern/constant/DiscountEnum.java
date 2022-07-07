package com.uiys.thingsfordesignpattern.constant;

/**
 * @author :uiys
 * 直接减去
 * 满多少减去
 * 指定
 */
public enum DiscountEnum {
    DIRECTLY_MINUS(1, "直接减"), HOW_MUCH_FULL_MINUS(2, "满减"), DIRECTLY_DISCOUNT(3, "直接打折"), HOW_MUCH_FULL_DISCOUNT(3, "满多少打折"), SPECIFY_SKU_DIRECTLY_MINUS(4, "包含选定商品直接减"), SPECIFY_SKU_HOW_MUCH_FULL_MINUS(5, "包含选定商品后金额满减"), SPECIFY_SKU_DIRECTLY_DISCOUNT(6, "包含选定商品直接打折"), SPECIFY_SKU_HOW_MUCH_FULL_DISCOUNT(7, "包含选定商品后满金额打折");
    public Integer discountType;
    public String discountTypeName;

    DiscountEnum(Integer discountType, String discountTypeName) {
        this.discountType = discountType;
        this.discountTypeName = discountTypeName;
    }



}
