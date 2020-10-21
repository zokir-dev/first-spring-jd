package com.cyber.services;

import com.cyber.interfaces.Course;
import com.cyber.interfaces.ExtraSessions;
import lombok.Data;

@Data
public class  Java implements Course {

    private OfficeHours officeHours;
    //ExtraSessions extraSessions;
    @Override
    public void getTeachingHours() {
        System.out.println("Java weekly teaching hours: "+ (20 + officeHours.getHours()));
    }

//    public OfficeHours getOfficeHours() {
//        return officeHours;
//    }
//
//    public void setOfficeHours(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }
}
