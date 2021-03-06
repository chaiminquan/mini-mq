package com.xcxcxcxcx.demo.condition2.consumer;

import com.xcxcxcxcx.demo.pub.config.TestConfig;
import com.xcxcxcxcx.demo.pub.consumer.ConsumerFastly;

/**
 * @author XCXCXCXCX
 * @since 1.0
 */
public class G2_1_T1 extends ConsumerFastly {

    /**
     * 订阅topic为t1，消费组ID为g2
     */
    public G2_1_T1() {
        super(TestConfig.group_g2, TestConfig.topic_t1);
    }

    public static void main(String[] args) {
        new G2_1_T1().startConsume();
    }
}
