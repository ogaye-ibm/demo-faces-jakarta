package com.bofa.demo.faces.view;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;


@SuppressWarnings("serial")
@Named
@SessionScoped
public class LegacyHelloBean implements Serializable {
    private String name;
    private String message;

    public LegacyHelloBean() {
        System.out.println("  ***** LegacyHelloBean created!");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void createMessage() {
        message = "Hello, " + name + "!";
    }

    public String getMessage() {
        return message;
    }

    public String getDate() {
        return new java.util.Date().toString();
    }
}
