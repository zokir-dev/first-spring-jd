package com.cyber.services;

import com.cyber.interfaces.ExtraSession;
import org.springframework.stereotype.Component;

@Component
public class TutoringHours implements ExtraSession {
    @Override
    public int getHours() {
        return 7;
    }
}
