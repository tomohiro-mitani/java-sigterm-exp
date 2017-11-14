package hello;

/**
 * Created by tmitani on 11/14/17.
 */

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class DrainFilter implements Filter{

    private AtomicInteger activeConnections = new AtomicInteger(0);

    public void init(FilterConfig filterConfig) throws ServletException { }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        activeConnections.incrementAndGet();
        filterChain.doFilter(servletRequest, servletResponse);
        activeConnections.decrementAndGet();
    }

    public void destroy() {
        while (activeConnections.get() > 0) {
            try { Thread.sleep(1000); } catch (InterruptedException e) { throw new RuntimeException(e); }
        }
    }

}
