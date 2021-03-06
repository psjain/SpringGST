package com.SpringGST.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.IOException;

@Controller
public class HomeController {
  protected final Log logger = LogFactory.getLog(getClass());
  
  @RequestMapping("/welcome")
  public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    logger.info("Return View");
    String message ="Welcome to GST Site";
    return new ModelAndView("SalesInvoices" , "message" ,  message);
  }
}