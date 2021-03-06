package com.lingdonge.spring.annotation;

import com.lingdonge.spring.configuration.RestTemplateAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 自动启用 RestTemplateConfiguration
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(RestTemplateAutoConfiguration.class)
@Documented
public @interface EnableKyleRestTemplate {
}