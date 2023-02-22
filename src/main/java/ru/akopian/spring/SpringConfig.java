package ru.akopian.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.akopian.spring")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

}
