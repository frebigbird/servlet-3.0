package examples.initializer;

import examples.filter.HelloFilter;
import examples.listener.HelloListener;
import examples.servlet.HelloServlet;

import javax.servlet.*;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

// 지정된 타입의 클래스를 찾아서 set 파라미터로 넘겨준다.
@HandlesTypes({HelloWebInitializer.class})
public class HelloServletContainerInitializer implements ServletContainerInitializer {
    public void onStartup(Set<Class<?>> set, ServletContext servletContext) throws ServletException {
        for (Class<?> handleClass : set) {
            System.out.println(handleClass.getName());
        }
        servletContext.addListener(HelloListener.class);

        ServletRegistration.Dynamic servlet = servletContext.addServlet("helloServlet", HelloServlet.class);
        servlet.setLoadOnStartup(1);
        servlet.addMapping("/*");

        FilterRegistration.Dynamic filer = servletContext.addFilter("helloFilter", HelloFilter.class);
        filer.addMappingForUrlPatterns(null, true, "/*");
    }
}
