//package com.alex.study.config;
//
//import io.swagger.annotations.ApiOperation;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//import static com.google.common.base.Predicate;
//
//@Configuration
//@EnableSwagger2
//public class swaggerConfig {
//
//    @Bean
//    public Docket createRestApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo()).select()
//                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
//                .paths(PathSelectors.any())
//                .build();
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title("Fast")
//                .description("Fast")
//                .contact(new Contact("Alex", "https://github.com/alex-airwallex","alex.zheng@airwallex.com"))
//                .version("1.0.0")
//                .build();
//    }
//}
