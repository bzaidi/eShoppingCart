package com.renaissance.managedbean;

import javax.faces.bean.ManagedBean;

/**
 * Created with IntelliJ IDEA.
 * User: ali
 * Date: 6/11/12
 * Time: 2:55 PM
 * To change this template use File | Settings | File Templates.
 */
@ManagedBean(name = "welcome")
public class WelcomeBean {

  public WelcomeBean() {
    System.out.println("Welcome bean instantiated");
  }

  public String getMessage(){
    return "Welcome to Maven2 Project";
  }
}
