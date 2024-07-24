package my.home.microservicepractiseapi.store;

import my.home.microservicepractiseapi.store.entities.ProjectEntity;
import my.home.microservicepractiseapi.store.entities.TaskEntity;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(ProjectEntity.class)
public class MyConfig {
}
