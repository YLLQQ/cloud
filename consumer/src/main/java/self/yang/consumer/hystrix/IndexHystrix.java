package self.yang.consumer.hystrix;

import org.springframework.stereotype.Component;
import self.yang.consumer.clients.IndexClient;

/**
 * self.yang.consumer.hystrix.IndexHystrix
 *
 * @author eleven
 * @date 2019/08/22
 */
@Component
public class IndexHystrix implements IndexClient {
    @Override
    public String index() {
        return "visit index has error!";
    }
}
