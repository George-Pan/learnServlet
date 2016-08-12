package com.example.web;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.List;

/**
 * 作用：接收form.html发送的post信息
 */
public class BeerSelect extends HttpServlet{
    public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
//        out.println("Beer Selection Advice<br>");
        String c=request.getParameter("color");
        BeerExpert bExpert=new BeerExpert();
        List<String> ans=bExpert.getBrands(c);
//        out.println("Got beer color:<br>");
//        for (int i = 0; i <ans.size() ; i++) {
//            out.println(ans.get(i)+"<br>");
//        }
        request.setAttribute("styles", ans);
        RequestDispatcher view = request.getRequestDispatcher("result.jsp");
        view.forward(request, response);

    }

}
