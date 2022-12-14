package com.psj.controller.interceptor;

import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
// 定义拦截器类，实现HandlerInterceptor接口
// 注意当前类必须受Spring容器控制
public class ProjectInterceptor implements HandlerInterceptor {
    @Override
    // 原始方法调用前执行的内容
    // 返回值类型可以拦截控制的执行，true放行，false终止
    // 放行则会执行原始Controller类中要请求的方法，终止的话后面的就不会再执行(意味着postHandle和afterCompletion也不会执行)
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String contentType = request.getHeader("Content-Type");
        HandlerMethod hm = (HandlerMethod) handler;
        String name = hm.getMethod().getName();
        System.out.println("preHandle..." + contentType);
        System.out.println("preHandle..." + name);
        return true;
    }

    @Override
    // 原始方法调用后执行的内容
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle...");
    }

    @Override
    // 原始方法调用完成后执行的内容
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion...");
    }
}
