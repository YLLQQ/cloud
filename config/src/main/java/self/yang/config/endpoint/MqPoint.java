package self.yang.config.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import self.yang.config.service.MqService;

/**
 * self.yang.config.endpoint.MqPoint
 *
 * @author eleven
 * @date 2019/08/23
 */
@RestController
public class MqPoint {

    @Autowired
    private MqService mqService;

    /**
     * 发送消息
     *
     * @return
     */
    @GetMapping("/message/send")
    public boolean sendMessage() {
        mqService.send();

        return true;
    }
}
