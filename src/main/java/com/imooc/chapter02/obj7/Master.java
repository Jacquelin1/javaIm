package com.imooc.chapter02.obj7;

public class Master {
    /*喂宠物
     * 喂猫咪：吃完东西后，主人会带着去玩线球
     * 喂狗狗：吃完东西后，主人会带着狗狗去睡觉
     * 养兔子、养鹦鹉、养乌龟。。。。
     */
    //方案1：编写方法，传入不同类型的动物，调用各自的方法
//    public void feed(Cat cat){
//        cat.eat();
//        cat.playBall();
//    }
//    public void feed(Dog dog){
//        dog.eat();
//        dog.sleep();
//    }

    //方案2：编写方法传入动物的父类，方法中通过类型转换，调用指定子类的方法
    public void feed(Animal obj){
        obj.eat();
        if(obj instanceof Cat){
            ((Cat) obj).playBall();
        }else if(obj instanceof Dog){
            ((Dog) obj).sleep();
        }
    }
}
