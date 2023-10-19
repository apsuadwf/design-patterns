package org.ytmf.creational.prototype.deep;

import lombok.Data;

import java.io.Serializable;

/**
 * 促销规则
 *
 * @author XieRongji
 * @date 2023/10/19 16:04
 **/
@Data
public class PromotionRule implements Cloneable, Serializable {
    private String type;
    private double discount;
    private Product product;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        PromotionRule promotionRule = (PromotionRule)super.clone();
        if(product != null){
            Product cloneProduct = product.clone();
            promotionRule.setProduct(cloneProduct);
        }
        return promotionRule;
    }
}
