package cn.itcast.intercept;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 时间：  2020/1/26
 * 创建者：  Administrator 钟文
 * 描述：  自定义拦截器
 * 参数：
 * 返回值：
 **/
public class MyIntercepter2 implements HandlerInterceptor {


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

        System.out.println("MyIntercepter1 的 preHandle*******前22222*******  执行了");
        //  request.getRequestDispatcher("/WEB-INF/pages/error.jsp").forward(request,response);


        return true;


    }

    /**
     * 后处理方法 ，controller 中的方法执行以后，success.jsp 执行以前
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("MyIntercepter1 的 postHandle*******后222222*******  执行了");
    }


    /**
     * 一般用于关闭流，等释放资源的操作
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("MyIntercepter1 的 postHandle*******最后22222*******  执行了");
    }
}
