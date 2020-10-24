package com.cyber.services;

import com.cyber.interfaces.Course;
import com.cyber.interfaces.ExtraSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

   // @Autowired
    //@Qualifier("officeHours")
   private ExtraSession extraSession;



    public Java(@Qualifier("officeHours") ExtraSession extraSession) {
        this.extraSession = extraSession;
    }

    @Override
    public void getTeachingHours() {

        System.out.println("Calculating Java hours as:"+(30 + extraSession.getHours()));
    }
}
