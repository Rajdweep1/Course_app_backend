package com.springrest.springRest.services;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // This allows CORS for all endpoints
                .allowedOrigins("http://localhost:3000") // Replace with your frontend origin
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Specify the HTTP methods you want to allow
                .allowCredentials(true) // If your frontend includes credentials (e.g., cookies)
                .maxAge(3600); // Max age of the CORS options response (1 hour in this example)
    }
}

