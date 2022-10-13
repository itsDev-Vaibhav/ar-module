package org.njhis.armodule.config;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

/**
 * @author vaibhav
 *@date 13-Oct-2022
 * 
 */

@Data
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "ar-api")
public class MessageConfig {
	Map<String, String> message = new LinkedHashMap<>();
}
