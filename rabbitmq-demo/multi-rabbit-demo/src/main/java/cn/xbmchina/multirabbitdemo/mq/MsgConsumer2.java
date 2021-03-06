package cn.xbmchina.multirabbitdemo.mq;

import cn.xbmchina.multirabbitdemo.config.AbstractMQConfig;
import com.rabbitmq.client.Channel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Slf4j
public class MsgConsumer2 {

	@RabbitListener(bindings = @QueueBinding(value = @Queue(value = "queue-2", autoDelete = "true"),
			exchange = @Exchange(value = AbstractMQConfig.EXCHANGE_TOPTIC_ROBOT_STATUS, type = ExchangeTypes.TOPIC),
			key = AbstractMQConfig.ROUTINGKEY_ROBOT_STATUS+ 1), containerFactory = "secondContainerFactory")
	public void receive(Message message, Channel channel) throws IOException {
		 //如果不允许出现消息的重复消费，自己要在代码里处理，确保幂等性，避免重复消费消息导致脏数据的出现。有时因为网络问题，MQ重复发送消息的情况没法避免。
		System.out.println("收到消息from Message1 : " + new String(message.getBody()));
		
		try {
			
			//处理业务逻辑.......
			
		}catch(Exception e) {
			//如果处理消息发送异常，比如插入数据库或更新数据库失败等，手动确认消息消费失败，更加业务属性决定是否重新放回队列或丢弃
			channel.basicNack(message.getMessageProperties().getDeliveryTag(), true , true); 
		}
		
		//手动确认消息已经成功发送
		channel.basicAck(message.getMessageProperties().getDeliveryTag(), false);

	}

}
