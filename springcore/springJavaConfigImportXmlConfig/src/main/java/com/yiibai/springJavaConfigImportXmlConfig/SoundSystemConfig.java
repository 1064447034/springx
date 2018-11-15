package com.yiibai.springJavaConfigImportXmlConfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(CDPlayerConfig.class)
@ImportResource("classpath:applicationContext.xml")
public class SoundSystemConfig {
	
}