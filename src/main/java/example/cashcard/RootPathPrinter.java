package example.cashcard;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletPath;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RootPathPrinter {

    private static final Logger logger = LoggerFactory.getLogger(RootPathPrinter.class);

    @Autowired
    private ServletWebServerApplicationContext servletWebServerAppCtx;

    @PostConstruct
    public void printRootPath() {
        DispatcherServletPath dispatcherServletPath = servletWebServerAppCtx.getBean(DispatcherServletPath.class);
        logger.info("Root Path: {}", dispatcherServletPath.getPath());
    }
}