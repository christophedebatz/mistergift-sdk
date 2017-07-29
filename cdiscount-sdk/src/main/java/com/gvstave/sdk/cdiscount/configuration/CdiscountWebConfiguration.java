package com.gvstave.sdk.cdiscount.configuration;

import com.gvstave.sdk.cdiscount.Cdiscount;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackageClasses = Cdiscount.class)
@PropertySource("classpath:/WEB-INF/cdiscount-sdk.properties")
public class CdiscountWebConfiguration {

}
