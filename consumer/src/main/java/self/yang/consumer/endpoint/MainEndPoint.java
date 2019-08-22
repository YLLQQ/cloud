package self.yang.consumer.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * self.yang.consumer.endpoint.MainEndPoint
 *
 * @author eleven
 * @date 2019/08/22
 */
@RestController
public class MainEndPoint {

    /**
     * 查询注册的服务
     */
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    /**
     * 获取注册的服务
     */
    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * 获取所有服务
     */
    @GetMapping("/services")
    public Object services() {
        return discoveryClient.getServices();
    }

    /**
     * 从所有服务中选择一个服务（轮询）
     */
    @GetMapping("/discover/{serviceId}")
    public Object discover(@PathVariable("serviceId") String serviceId) {
        return loadBalancerClient.choose(serviceId).getUri().toString();
    }
}
