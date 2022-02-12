package cn.lab212.mall.portal.domain;

import lombok.Getter;

/**
 * @author yinck
 * @version 1.0
 * @date 2021-09-29 18:07
 */
@Getter
public enum QueueEnum {
    /**
     * 消息通知队列
     */
    QUEUE_ORDER_CANCEL("mall.order.direct", "mall.order.cancel", "mall.order.cancel"),
    /**
     * 消息通知ttl队列
     */
    QUEUE_TTL_ORDER_CANCEL("mall.order.direct.ttl", "mall.order.cancel.ttl", "mall.order.cancel.ttl");

    private String exchange;

    private String name;

    private String routingKey;

    QueueEnum(String exchange, String name, String routingKey) {
        this.exchange = exchange;
        this.name = name;
        this.routingKey = routingKey;
    }
}
