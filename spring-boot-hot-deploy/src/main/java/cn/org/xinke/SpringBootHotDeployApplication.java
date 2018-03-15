package cn.org.xinke;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootHotDeployApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHotDeployApplication.class, args);
	}
}
