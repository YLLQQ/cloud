package self.yang.producer.order.endpoint;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * self.yang.producer.order.endpoint.OrderPoint
 *
 * @author eleven
 * @date 2019/08/22
 */
@Slf4j
@RestController
public class OrderPoint {

    @GetMapping("/info")
    public String info() {
        log.info("visit order info");

        return "order";
    }
}
