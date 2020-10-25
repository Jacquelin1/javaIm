package com.imooc.chapter02.obj7;

public class Cat extends Animal{
    private double weight;

    public Cat(){

    }
    public Cat(String name,int month,double weight){
        super(name,month);
        this.weight=weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void run(){
        System.out.println("小猫快乐的奔跑");
    }

    @Override  //ctrl+o
    public void eat() {
        System.out.println("猫吃鱼");
    }

}
