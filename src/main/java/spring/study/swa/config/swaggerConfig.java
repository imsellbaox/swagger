package spring.study.swa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import org.springframework.web.bind.annotation.GetMapping;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * @author: V
 * @param:
 * @description:
 */
@Configuration
@EnableSwagger2
public class swaggerConfig {


    @Bean                  //多判启动 第一步  获取environment
    public Docket docket(Environment environment){

//       多判启动 第二步  对比返回boolean
        Profiles profiles = Profiles.of("dev");
        boolean flag = environment.acceptsProfiles(profiles);

        return new Docket(DocumentationType.SWAGGER_2)
                 .apiInfo(info())
                .groupName("萧峰")
///*是否启动swagger*/ .enable(false)
//             多判启动 第三步  利用enable 来实现多环境判断启动swagger
                .enable(flag)
                  .select()
///*扫描所有*/       .apis(RequestHandlerSelectors.any())
///*扫描Class注解*/  .apis(RequestHandlerSelectors.withClassAnnotation(Controller.class))
///*扫描包*/         .apis(RequestHandlerSelectors.basePackage("spring.study.swa.controller"))
///*扫描null*/      .apis(RequestHandlerSelectors.none())
///*扫描方法注解*/     .apis(RequestHandlerSelectors.withMethodAnnotation(GetMapping.class))

//扫描访问路径                .paths(PathSelectors.ant("/kuang/**"))





                .build()
                ;

    }

    private ApiInfo info(){

        Contact contact = new Contact("萧峰","https://www.baidu.com","123@qq.com");

        return new ApiInfo("Api 萧峰的文档",
                "Api Documentation",
                "1.0",
                "https://www.baidu.com",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList<VendorExtension>());
    }
}
