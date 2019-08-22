package self.yang.producer.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * self.yang.producer.endpoint.MainEndPoint
 *
 * @author eleven
 * @date 2019/08/22
 */
@RestController
public class MainEndPoint {

    @GetMapping("/index")
    public String index() {
        return "hello world!";
    }
}
