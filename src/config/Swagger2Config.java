package config;

@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors
                        .basePackage("com.lambdaschool.javazoos")) //Location of where the controller file is.
                .paths(PathSelectors.regex("/.*"))
                .build().apiInfo(apiEndPointsInfo());
    }

    private ApiInfo apiEndPointsInfo() {
        return new ApiInfoBuilder().title("Java Zoos")
                .description("Java Zoos with Swagger")
                .contact(new Contact("Pablo Ogata", "http://www.lambdaschool.com", "pogata@gmail.com"))
                .license("MIT")
                .licenseUrl("https://github.com/pogata0210/java-zoos/blob/master/LICENSE")
                .version("1.0.0")
                .build();
    }
}
