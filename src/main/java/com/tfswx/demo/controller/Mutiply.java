package com.tfswx.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Mutiply {
  @ResponseBody
  @RequestMapping(value = "/test")
  public String test(){
    String s="";
    for (int i = 1; i < 10; i++) {
      for (int j = 1;j <= i; j++){

        s=s+i+"*"+j+"="+i*j;
        s=s+" ";
      }
      s=s+"<br/>";
    }
    s=s+"********************************************************************";
    s=s+"<br/>";
    for (int i = 9; i > 0; i--) {
      for (int j = 1;j <=i; j++){
        s=s+j+"*"+i+"="+i*j;
        s=s+" ";
      }
      s=s+"<br/>";
    }
    return s;
  }
}
