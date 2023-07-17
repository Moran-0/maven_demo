package com.moran.Util;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        System.out.println("preHandle!");
////        return true;
//        response.getWriter().println("!!!!!!!FBI WARNING!!!!!");
        String path = request.getRequestURI();
        if (path.contains("/login")||path.contains("/logout")){
            return true;
        }else {
            Object obj = request.getSession().getAttribute("Global User");
           if (obj != null)
               return true;
           else {
               response.getWriter().print("NOT LOGIN!");
               return false;
           }
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
