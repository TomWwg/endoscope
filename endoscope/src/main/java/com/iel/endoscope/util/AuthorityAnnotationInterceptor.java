package com.iel.endoscope.util;

import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

/**
 * 这个类的目的就是在打过Authority标签的方法及类上，进行权限验证
 * @author wwg
 * @date 2018/2/24
 */
public class AuthorityAnnotationInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        if (handler instanceof HandlerMethod){
            HandlerMethod handlerMethod = (HandlerMethod) handler;

            Class<?> clazz = handlerMethod.getBeanType();
            Method method = handlerMethod.getMethod();
            try {
                if (clazz != null && method != null){
                    boolean isClazAnnotation = clazz.isAnnotationPresent(Authority.class);
                    boolean isMethodAnnotation = method.isAnnotationPresent(Authority.class);
                    Authority authority = null;
                    if (isMethodAnnotation){
                        authority = method.getAnnotation(Authority.class);
                    } else if (isClazAnnotation){
                        authority = clazz.getAnnotation(Authority.class);
                    }
                    int code = -1;
                    String msg = "";
                    if (authority != null){
                        if (AuthorityType.NoValidate == authority.value()){
                            //标记为不验证，放行
                            return true;
                        } else if (AuthorityType.NoAuthority == authority.value()){
                            //不验证去权限，验证是否登录
                            //TODO;
                            return true;
                        } else {
                            //验证登录及权限
                            //TODO;
                            System.out.println("我已经开启权限验证了，你还没有设置过权限哦------------------------------");

                            code = 1;
                            msg = "验证成功";
                            return true;
                        }
                    }

                    // /跳转
                    // String url = "";
                    // response.getWriter().write("<script>top.location.href='")
                    // + url + "'</script>");
                    // return false;

                    //未通过验证，返回提示JSON
                    return false;
                }
            } catch (Exception e){

            }
        }
        return false;
    }
}
