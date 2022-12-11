package task.telkom.appium.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties
@EnableConfigurationProperties
public class ConfigProperties {
    @Value("${capability.deviceName}")
    private String deviceName;

    @Value("${capability.appPackage}")
    private String appPackage;

    @Value("${capability.appActivity}")
    private String appActivity;

    @Value("${capability.fullReset}")
    private String fullReset;

    @Value("${capability.noReset}")
    private String noReset;

    @Value("${capability.appiumURL}")
    private String appiumURL;

    @Value("${spring.profiles.active}")
    private String profile;



}
