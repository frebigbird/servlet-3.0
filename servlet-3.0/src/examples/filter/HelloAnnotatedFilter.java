package examples.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter("/*")
public class HelloAnnotatedFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("HelloAnnotatedFilter init()");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        System.out.println("HelloAnnotatedFilter doFilter[" + request.getRequestURI() + "]");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {
        System.out.println("HelloAnnotatedFilter destroy()");
    }
}

