package base;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Map;

@Data
@Configuration
@PropertySource(
        value = "classpath:MyProps.yml",
        factory = YamlPropertySourceFactory.class)
@ConfigurationProperties(prefix = "event-definitions")
public class MyPropsConfig {
    private String name;
    private Map<String, Map<String, Object>> dataDistribution;
    private Map<String, Map<String, Object>> generateReport;

}
