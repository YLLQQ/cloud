package self.yang.producer.order.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * self.yang.producer.order.endpoint.OrderPoint
 *
 * @author eleven
 * @date 2019/08/22
 */
@RestController
public class OrderPoint {

    @GetMapping("/info")
    public String info() {
        return "order";
    }
}
