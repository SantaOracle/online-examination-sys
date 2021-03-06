package online_examination_sys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import springfox.documentation.annotations.ApiIgnore;

@Controller
@SpringBootApplication
@MapperScan("online_examination_sys.mapper")
@ApiIgnore
@EnableScheduling 
public class BootMain extends WebMvcConfigurerAdapter{

	public static void main(String[] args) {
		SpringApplication.run(BootMain.class, args);
	}
	
	@RequestMapping("/help")
	public String help() {
		return "redirect:swagger-ui.html";
	}

}

