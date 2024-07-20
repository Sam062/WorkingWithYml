package base;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Data
@Configuration
@ConfigurationProperties(prefix = "event-definitions")
public class YmlConfig {
    private String name;
    private Map<String, Map<String, Object>> dataDistribution;
    private Map<String, Map<String, Object>> generateReport;

}
