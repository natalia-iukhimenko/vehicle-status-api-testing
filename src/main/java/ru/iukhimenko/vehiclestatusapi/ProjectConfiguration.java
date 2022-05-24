package ru.iukhimenko.vehiclestatusapi;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;

@Config.Sources({"classpath:config.properties"})
public interface ProjectConfiguration extends Config {
    ProjectConfiguration CONFIGURATION = ConfigFactory.create(ProjectConfiguration.class);

    String baseUrl();

    String authToken();
}
