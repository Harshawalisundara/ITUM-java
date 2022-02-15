package com.itum;

abstract class Animal {
    public void sleep(){
        System.out.println("Animal is sleeping");
    }
    public abstract void animalsound();
}
class  Lion extends Animal{
    public void animalsound(){
        System.out.println("Lion is roaring");
    }
}
class TestAnimal{
    Lion lion = new Lion();
    lion.animalsound();
    lion.sleep()
}