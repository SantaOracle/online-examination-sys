/**********************************************************************
* $Id: Application.java Application ,v0.1 2016年7月12日 下午4:39:40 DuanMinglei Exp $
* Copyright ©2016 yonyou . All rights reserved
***********************************************************************/

package test.comfig;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//import com.github.pagehelper.PageHelper;

/**
* 功能说明：应用配置
* 创建者：段明磊
* E-mail: duanml1@yonyou.com
* 创建时间：2016年7月13日
* <pre>
* 修改时间:       修改者:            
* 修改内容：
* </pre>
* 版本：0.1
 */
@Configuration
public class WebAppConfig extends WebMvcConfigurerAdapter {
    
    @Bean
    public RestTemplate getRestTemplate(){
    	return new RestTemplate();
    }
    
    @Bean  
    public WebInterceptor webInterceptor() {  
        return new WebInterceptor();  
    }  
    
//    @Bean
//    public PageHelper pageHelper() {
//        PageHelper pageHelper = new PageHelper();
//        Properties p = new Properties();
//        p.setProperty("offsetAsPageNum", "true");
//        p.setProperty("rowBoundsWithCount", "true");
//        p.setProperty("reasonable", "true");
//        pageHelper.setProperties(p);
//        return pageHelper;
//    }
//    
//    public void addInterceptors(InterceptorRegistry registry) {
//    	registry.addInterceptor(webInterceptor()).addPathPatterns("/**");
//	}
//    
    @Bean
    public CorsFilter corsFilter() {
        final UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
        final CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.setAllowCredentials(true);
        corsConfiguration.addAllowedOrigin("*");
        corsConfiguration.addAllowedHeader("*");
        corsConfiguration.addAllowedMethod("*");
        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
        return new CorsFilter(urlBasedCorsConfigurationSource);
    }
}
