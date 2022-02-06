package zw.co.abn.generic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class GenericApplication {

	public static void main(String[] args) {
		SpringApplication.run(GenericApplication.class, args);
	}

}
