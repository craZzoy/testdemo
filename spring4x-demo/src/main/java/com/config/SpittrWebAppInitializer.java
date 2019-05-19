package com.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 通过java来配置DispatherServlet(使用servlet3的规范，spring3.1以上)，而非web.xml的方式
 * 实现AbstractAnnotationConfigDispatcherServletInitializer的类会自动配置DispatherServlet和Spring应用上下文
 * Spring上下文位于servlet上下文中
 * Created by zwz on 2019/5/13.
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{

    /**
     * 指定配置类用于构建root上下文，即Servlet上下文
     * @return
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] {RootConfig.class};
    }

    /**
     * 指定配置类用于构建web上下文，即Spring上下文
     * @return
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[] {WebConfig.class};
    }

    /**
     * DispatherServlet的映射，这里映射到“/”
     * @return
     */
    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
