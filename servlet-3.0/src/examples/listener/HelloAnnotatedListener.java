package examples.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class HelloAnnotatedListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("HelloAnnotatedListener contextInitialized()");
    }
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("HelloAnnotatedListener contextDestroyed()");
    }
}
