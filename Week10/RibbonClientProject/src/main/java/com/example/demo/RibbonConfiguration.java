package com.example.demo;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class RibbonConfiguration {
	@Autowired
	IClientConfig config;

    @Bean
    IPing ribbonPing(IClientConfig config) {
		return new PingUrl();
	}

    @Bean
    IRule ribbonRule(IClientConfig config) {
		return new AvailabilityFilteringRule();
	}

}