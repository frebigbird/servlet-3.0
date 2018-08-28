package examples.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class HelloListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("HelloListener contextInitialized()");
    }
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("HelloListener contextDestroyed()");
    }
}
