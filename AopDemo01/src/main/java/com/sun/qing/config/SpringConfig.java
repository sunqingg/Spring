package com.sun.qing.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = {"com.sun.qing"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class SpringConfig {
}
