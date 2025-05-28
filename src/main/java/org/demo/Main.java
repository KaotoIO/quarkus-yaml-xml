package org.demo;

import org.apache.camel.quarkus.main.CamelMainApplication;
import org.eclipse.microprofile.config.Config;
import org.eclipse.microprofile.config.ConfigProvider;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;
import io.smallrye.config.SmallRyeConfig;

@QuarkusMain
public class Main {

    public static void main(String... args) {
        Config config = ConfigProvider.getConfig();

        String profiles = String.join(", ", config.unwrap(SmallRyeConfig.class).getProfiles());
        System.out.println("[RUN] Running in " + profiles + " mode");

        Quarkus.run(CamelMainApplication.class);
    }

}
