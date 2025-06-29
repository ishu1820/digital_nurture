package com.example;

public class Service {
    private final App app;
    public Service(App app){
        this.app = app;

    }
    public String fetchData(){
        return app.getData();
    }
}
