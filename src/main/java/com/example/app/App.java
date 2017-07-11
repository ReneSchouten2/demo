package com.example.app;

import com.example.dep.Dep;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        port(5000);
        get("/", (req,res) -> Dep.hello("GitLab!") );
    }
}