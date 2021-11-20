package spring.study.swa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class SwaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SwaApplication.class, args);
		Environment environment = context.getBean(Environment.class);
		System.out.println("http://localhost:"+environment.getProperty("local.server.port")+"/swagger-ui.html");
	}

}
