package com.truson.test.file;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * 各种获取路径方式测试
 * ******************************  路径概念  ******************************
 * 绝对路径：绝对路径就是你的主页上的文件或目录在硬盘上真正的路径(一般表现为URL和物理路径)
 * 例如：C:\xyz\est.txt    代表了test.txt文件的绝对路径
 *       http://www.sun.com/index.htm   代表了一个URL绝对路径
 *
 * 相对路径：相对于某个基准目录的路径。包含Web的相对路径（HTML中的相对目录）和物理路径的相对表示
 * 例如：Servlet中，"/"代表Web应用的跟目录
 *       linux文件系统中，"./" 代表当前目录,"../"代表上级目录。
 * *****************************  end  *************************************
 * Created by lezi on 2015/12/27.
 */
@Controller
@RequestMapping(value = "/pathTest")
public class PathTestController {

    /**
     * 测试servlet中的各类路径
     * 返回servletPath(1)、contextPath(2)、requestURI(3)
     * @param pathType
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/servletPath/{pathType}")
    public @ResponseBody Map getServletPath(@PathVariable String pathType, HttpServletRequest request, HttpServletResponse response){
        Map resultMap = new HashMap<>();
        String path = "";
        String realPath = "";
        if(StringUtils.equals("1", pathType))
            path = request.getServletPath();
        if(StringUtils.equals("2", pathType))
            path = request.getContextPath();
        if(StringUtils.equals("3", pathType))
            path = request.getRequestURI();
        realPath = request.getServletContext().getRealPath(path);
        resultMap.put("pathType:", pathType);
        resultMap.put("path:", path);
        resultMap.put("realPath:", realPath);
        return resultMap;
    }

    /**
     * 测试class和File中各类路径问题
     * @param args
     */
    public static void main(String[] args){
        System.out.println(Thread.currentThread().getContextClassLoader().getResource(""));
        System.out.println(PathTestController.class.getClassLoader().getResource(""));
        System.out.println(PathTestController.class.getResource(""));
        System.out.println(PathTestController.class.getResource("/"));
        System.out.println(new File("/").getAbsolutePath());
        System.out.println(System.getProperty("user.dir"));
    }



}
