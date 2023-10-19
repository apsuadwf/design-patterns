package org.ytmf.creational.prototype.deep;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.*;

/**
 * @author XieRongji
 * @date 2023/10/19 16:03
 **/

public class DeepCopyTest {
    @Test
    public void test(){
        // 创建一个促销活动对象
        PromotionEvent promotionEvent = new PromotionEvent();
        // 设置促销活动的开始日期为当前日期
        promotionEvent.setStartDate(new Date());
        // 创建一个促销规则对象
        PromotionRule promotionRule = new PromotionRule();
        // 设置促销规则的类型为折扣
        promotionRule.setType("折扣");
        // 设置促销规则的折扣率为0.9，即9折
        promotionRule.setDiscount(0.9);
        // 创建一个产品对象
        Product product = new Product();
        // 设置促销规则的产品为该产品对象
        promotionRule.setProduct(product);
        // 用Arrays.asList和new ArrayList来创建一个可变的List，包含该促销规则对象
        promotionEvent.setRules(new ArrayList<>(Collections.singletonList(promotionRule)));

        // 深拷贝促销活动对象，得到一个新的促销活动对象
        PromotionEvent clonePromotionEvent = promotionEvent.clone();
        // 打印出深拷贝后的促销活动对象中的第一个促销规则对象中的产品对象是否和原来的产品对象相同，应该是false
        System.out.println(clonePromotionEvent.getRules().get(0).getProduct() == product);
        // 修改深拷贝后的促销活动对象中的第一个促销规则对象中的折扣率为0.7，即7折
        clonePromotionEvent.getRules().get(0).setDiscount(0.7);
        System.out.println(clonePromotionEvent.getRules());
    }

    @Test
    public void test2() throws IOException, ClassNotFoundException {
        // 创建一个促销活动对象
        PromotionEvent promotionEvent = new PromotionEvent();
        // 设置促销活动的开始日期为当前日期
        promotionEvent.setStartDate(new Date());
        // 创建一个促销规则对象
        PromotionRule promotionRule = new PromotionRule();
        // 设置促销规则的类型为折扣
        promotionRule.setType("折扣");
        // 设置促销规则的折扣率为0.9，即9折
        promotionRule.setDiscount(0.9);
        // 创建一个产品对象
        Product product = new Product();
        // 设置促销规则的产品为该产品对象
        promotionRule.setProduct(product);
        // 用Arrays.asList和new ArrayList来创建一个可变的List，包含该促销规则对象
        promotionEvent.setRules(new ArrayList<>(Collections.singletonList(promotionRule)));

        // 深拷贝
        // 1、将对象转化为二进制流
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(outputStream);
        oos.writeObject(promotionEvent);
        byte[] bytes = outputStream.toByteArray();

        // 2、使用字节流进行反序列化，得到一个实例
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bytes));
        PromotionEvent copyPromotionEvent = (PromotionEvent)ois.readObject();

        // 3、测试
        System.out.println(promotionEvent == copyPromotionEvent);
        System.out.println(
                copyPromotionEvent.getRules().get(0).getProduct() ==
                        promotionEvent.getRules().get(0).getProduct()
        );
    }
}
