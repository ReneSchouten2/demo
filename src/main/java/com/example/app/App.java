package com.example.app;

import com.example.dep.Dep;

import static spark.Spark.*;

public class GreetUser {
    public static void main(String[] args) {
        get("/", (req,res) -> Dep.hello("GitLab!") );
    }
}