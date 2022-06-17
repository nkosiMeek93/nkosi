package com.company;

public class Animal {
    private String name ;
    private int legs ;
    boolean hasTail ;

    // when creating a constructor manually
    // do not include any return type
    // leave it as public animal not public void/string/int

    public Animal(String name, int legs, boolean hasTail){
        this.name = name;
        this.legs = legs;
        this.hasTail = hasTail;

    }

    public void eat (){
        System.out.println(this.getName() + " eats a lot ");
    }

    public void bites(){
        System.out.println(this.getName() + " bites to leave dead");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }
}
