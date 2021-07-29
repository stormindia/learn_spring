package com.harshit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("mySamsung")
public class Samsung {

    @Autowired
    @Qualifier("mediaTek")
    MobileProcessor cpu;

    public MobileProcessor getCpu() {
        return cpu;
    }

    public void setCpu(MobileProcessor cpu) {
        this.cpu = cpu;
    }

    public void config(){
        System.out.println(" a a a b b b b b c c c c");
        cpu.process();
    }
}
