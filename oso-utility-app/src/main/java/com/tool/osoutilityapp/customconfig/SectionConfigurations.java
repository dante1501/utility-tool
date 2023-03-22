package com.tool.osoutilityapp.customconfig;


import com.tool.osoutilityapp.customconfig.model.Content;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import java.util.List;
import java.util.Map;

@Configuration
@PropertySource(value="classpath:utility-customization.yaml", ignoreResourceNotFound = true)
@ConfigurationProperties(prefix = "utility.customization")
public class SectionConfigurations {

    private Map<String, List<Content>> section;

    public Map<String, List<Content>> getSection() {
        return section;
    }

    public void setSection(Map<String, List<Content>> section) {
        this.section = section;
    }
}
