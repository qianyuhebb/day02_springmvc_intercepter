package cn.itcast.intercept;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 时间：  2020/1/26
 * 创建者：  Administrator 钟文
 * 描述：  自定义拦截器
 * 参数：
 * 返回值：
 **/
public class MyIntercepter1  implements HandlerInterceptor {


    /**
     * 预处理方法   return  true  表示放行，执行下一个拦截器  如果没有就执行controller里面的方法
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        System.out.println("MyIntercepter1 的 preHandle  执行了");
        return true;


    }
}
