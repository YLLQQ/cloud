package self.yang.gateway.endpoint;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * self.yang.gateway.endpoint.ConfigPoint
 *
 * @author eleven
 * @date 2019/08/23
 */
@RefreshScope
@RestController
public class ConfigPoint {

    @Value("${define}")
    private String defineConfig;

    @GetMapping("/getDefine")
    public String getDefine() {
        return defineConfig;
    }
}
