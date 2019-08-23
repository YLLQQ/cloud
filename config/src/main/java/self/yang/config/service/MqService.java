package self.yang.config.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * self.yang.config.service.MqService
 *
 * @author eleven
 * @date 2019/08/23
 */
@Service
public class MqService {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String msg = "hello rabbitmq:" + LocalDateTime.now();

        this.rabbitTemplate.convertAndSend("cloud", msg);
    }
}
