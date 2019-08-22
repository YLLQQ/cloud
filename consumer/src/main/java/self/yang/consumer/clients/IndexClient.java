package self.yang.consumer.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * self.yang.consumer.clients.IndexClient
 *
 * @author eleven
 * @date 2019/08/22
 */
@FeignClient("Service-Producer")
public interface IndexClient {

    /**
     * 映射服务
     *
     * @return
     */
    @GetMapping(value = "/index", consumes = "application/json")
    String index();
}
