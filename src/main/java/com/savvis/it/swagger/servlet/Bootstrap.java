package com.savvis.it.swagger.servlet;

import javax.servlet.http.HttpServlet;

import com.wordnik.swagger.jaxrs.JaxrsApiReader;

public class Bootstrap extends HttpServlet {
  static {
    JaxrsApiReader.setFormatString("");
  }
}