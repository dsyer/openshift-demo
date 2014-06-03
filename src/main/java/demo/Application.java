package demo;

import java.util.Collections;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Configuration
@ComponentScan
@EnableAutoConfiguration
@Controller
public class Application {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, String> hello() {
		return Collections.singletonMap("message",
				"Hello World");
	}

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
