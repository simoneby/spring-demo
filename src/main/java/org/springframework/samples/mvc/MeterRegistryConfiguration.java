//package org.springframework.samples.mvc;
//
//import io.micrometer.azuremonitor.AzureMonitorConfig;
//import io.micrometer.azuremonitor.AzureMonitorMeterRegistry;
//
//import javax.servlet.ServletContextEvent;
//import javax.servlet.ServletContextListener;
//import javax.servlet.annotation.WebListener;
//import java.time.Duration;
//
//@WebListener
//public class MeterRegistryConfiguration implements ServletContextListener {
//
//    @Override
//    public void contextInitialized(ServletContextEvent servletContextEvent) {
//
//        // Create AzureMonitorMeterRegistry
//         final AzureMonitorConfig config = new AzureMonitorConfig() {
//            @Override
//            public String get(String key) {
//                return null;
//            }
//            @Override
//            public Duration step() {
//                return Duration.ofSeconds(60);}
//
//            @Override
//            public boolean enabled() {
//                return false;
//            }
//        };
//
//        AzureMonitorMeterRegistry.Builder azureMeterRegistry = AzureMonitorMeterRegistry.builder(config);
//
//        //set the config to be used elsewhere
//        servletContextEvent.getServletContext().setAttribute("AzureMonitorMeterRegistry", azureMeterRegistry);
//
//    }
//
//    @Override
//    public void contextDestroyed(ServletContextEvent servletContextEvent) {
//
//    }
//}
