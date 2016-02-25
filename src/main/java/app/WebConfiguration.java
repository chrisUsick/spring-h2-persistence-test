package app;

import org.h2.server.web.WebServlet;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

/**
 * Created by chris.usick on 2/25/16.
 */
@Configuration
public class WebConfiguration {
//    @Bean
//    ServletRegistrationBean h2servletRegistration() {
//        ServletRegistrationBean regBean = new ServletRegistrationBean(new WebServlet());
//        regBean.addUrlMappings("/console/*");
//        return regBean;
//    }
}
