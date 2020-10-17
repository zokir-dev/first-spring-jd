package service;

import implementation.Mentor;

public class FullTimeMentor implements Mentor {
    @Override
    public void createAcccount() {
        System.out.println("Full time account is created");
    }
}
