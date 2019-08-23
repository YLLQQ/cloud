package self.yang.gateway.component;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * self.yang.gateway.component.MqService
 *
 * @author eleven
 * @date 2019/08/23
 */
@Slf4j
@Component
@RabbitListener(queues = "cloud")
public class MqService {
    @RabbitHandler
    public void process(String message) {
        log.info("receiver:" + message);
    }
}
