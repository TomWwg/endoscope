package com.iel.endoscope.swagger;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Created by wwg on 2017/11/24.
 */
public class SwaggerConfig {

    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any()).build().apiInfo(apiInfo());
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("内镜项目接口文档").description("内镜项目接口测试").version("V1.0.0").termsOfServiceUrl("").license("").licenseUrl("").build();
    }
}
