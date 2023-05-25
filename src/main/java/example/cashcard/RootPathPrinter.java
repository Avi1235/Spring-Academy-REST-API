package example.cashcard;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletPath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RootPathPrinter {

    @Autowired
    private ServletWebServerApplicationContext servletWebServerAppCtx;

    @PostConstruct
    public void printRootPath() {
        DispatcherServletPath dispatcherServletPath = servletWebServerAppCtx.getBean(DispatcherServletPath.class);
        System.out.println("Root Path: " + dispatcherServletPath.getPath());
    }
}