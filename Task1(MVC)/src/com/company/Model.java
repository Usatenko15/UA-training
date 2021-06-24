package com.company;

public class Model {
    private String valueHello;
    private String valueWorld;

    public void finalSum(){
        System.out.println(getValueHello() + " " + getValueWorld());
    }

    public void setValueHello(String valueHello) {
        this.valueHello = valueHello;
    }

    public void setValueWorld(String valueWorld) { this.valueWorld = valueWorld; }

    public String getValueHello() {
        return valueHello;
    }

    public String getValueWorld() { return valueWorld; }
}
