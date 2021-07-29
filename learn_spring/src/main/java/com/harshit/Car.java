package com.harshit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {

    @Autowired
    private Tyre tyre;

    public void drive(){
        System.out.println("drive");
    }

    public Tyre getTyre(){
        return tyre;
    }

    public void setTyre(Tyre tyre){
        this.tyre = tyre;
    }
}
