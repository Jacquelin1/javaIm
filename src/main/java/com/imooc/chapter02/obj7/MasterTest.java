package com.imooc.chapter02.obj7;

public class MasterTest {
    public static void main(String[] args) {
        Cat one=new Cat();
        Dog two=new Dog();
        Master master=new Master();
        master.feed(one);
        master.feed(two);

        boolean time=false;
        Animal pet =master.raise(time);
    }
}
