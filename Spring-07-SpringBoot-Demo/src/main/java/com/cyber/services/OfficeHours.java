package com.cyber.services;

import com.cyber.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours implements ExtraSessions {
    @Override
    public int getExtraHours() {
        return 10;
    }
}
