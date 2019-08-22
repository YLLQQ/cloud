package self.yang.producer.user.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * self.yang.producer.user.endpoint.UserPoint
 *
 * @author eleven
 * @date 2019/08/22
 */
@RestController
public class UserPoint {

    @GetMapping("/info")
    public String info() {
        return "user";
    }
}
