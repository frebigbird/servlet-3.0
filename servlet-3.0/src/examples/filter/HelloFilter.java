package examples.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class HelloFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("HelloFilter init()");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        System.out.println("HelloFilter doFilter[" + request.getRequestURI() + "]");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void destroy() {
        System.out.println("HelloFilter destroy()");
    }
}


