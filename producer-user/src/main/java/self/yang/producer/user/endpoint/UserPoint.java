package self.yang.producer.user.endpoint;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * self.yang.producer.user.endpoint.UserPoint
 *
 * @author eleven
 * @date 2019/08/22
 */
@Slf4j
@RestController
public class UserPoint {

    @GetMapping("/info")
    public String info() {
        log.info("visit user info");

        return "user";
    }
}
