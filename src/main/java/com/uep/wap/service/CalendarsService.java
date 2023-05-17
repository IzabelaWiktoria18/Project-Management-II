package com.uep.wap.service;

import com.uep.wap.dto.CalendarDTO;
import com.uep.wap.model.Calendar;
import com.uep.wap.repository.CalendarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CalendarsService {
    @Autowired
    private CalendarRepository calendarRepository;

    public void addCalendar(CalendarDTO calendarDTO) {
        Calendar calendar = new Calendar();
        calendar.setCalendarUser(calendarDTO.getCalendarUser());
        calendarRepository.save(calendar);
        System.out.println("calendar added!");
    }

    public Iterable<Calendar> getAllCalendars() {
        return calendarRepository.findAll();
    }
    //get create update
}
