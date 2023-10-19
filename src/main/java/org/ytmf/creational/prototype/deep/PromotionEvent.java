package org.ytmf.creational.prototype.deep;

import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 促销活动
 *
 * @author XieRongji
 * @date 2023/10/19 16:06
 **/
@Data
public class PromotionEvent implements Serializable,Cloneable{
    private String name;
    private Date startDate;
    private Date endDate;
    private List<PromotionRule> rules;
    // 在促销活动中的clone方法需要克隆里边所有的非基础数据类型
    @Override
    public PromotionEvent clone() {
        try {
            PromotionEvent clonedEvent = (PromotionEvent) super.clone();
            if(startDate != null){
                clonedEvent.startDate = (Date) startDate.clone();
            }
            if(endDate != null){
                clonedEvent.endDate = (Date) endDate.clone();
            }
            if(rules != null && !rules.isEmpty()){
                List<PromotionRule> copyRules = new ArrayList<>();
                for (PromotionRule rule : rules) {
                    copyRules.add((PromotionRule) rule.clone());
                }
                clonedEvent.setRules(copyRules);

            }
            return clonedEvent;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
