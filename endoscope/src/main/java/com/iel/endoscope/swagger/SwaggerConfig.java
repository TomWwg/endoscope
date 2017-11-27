package com.iel.endoscope.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by wwg on 2017/11/24.
 * @author wwg
 */

/**
 * 重要！如果你的项目引入Junit测试，此处需要使用@WebAPPConfiguration，如果没有使用Junit使用@Configuration
 */
@Configuration
@EnableSwagger2//重要
@EnableWebMvc
//扫描controller所在的package
@ComponentScan(basePackages = "com.iel.controller")
public class SwaggerConfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any()).build().apiInfo(apiInfo());
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("内镜项目接口文档").description("内镜项目接口测试").version("V1.0.0").termsOfServiceUrl("").license("").licenseUrl("").build();
    }
}
