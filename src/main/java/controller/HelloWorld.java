package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "helloWorld")
//@SessionScoped
public class HelloWorld {
    String msg = "hello world! a class here";

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void doSth() {
        System.out.println("do something");
    }
}
