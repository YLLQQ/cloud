package self.yang.gateway.component;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * self.yang.gateway.component.MqService
 *
 * @author eleven
 * @date 2019/08/23
 */
@Component
@RabbitListener(queues = "cloud")
public class MqService {
    @RabbitHandler
    public void process(String message) {
        System.out.println("receiver:" + message);
    }
}
