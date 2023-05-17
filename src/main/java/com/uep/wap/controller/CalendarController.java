package com.uep.wap.controller;

import com.uep.wap.dto.CalendarDTO;
import com.uep.wap.model.Calendar;
import com.uep.wap.service.CalendarsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class CalendarController {

    private final CalendarsService calendarsService;

    public CalendarController(CalendarsService calendarsService) {
        this.calendarsService = calendarsService;
    }

    @GetMapping(path = "/hello")
    public String sayHello(){
        return "Hello!";
    }

    @GetMapping(path = "/calendars")
    public Iterable<Calendar> getAllStudents(){
        return calendarsService.getAllCalendars();
    }

    @PostMapping(path = "/calendars")
    public String addStudents(@RequestBody CalendarDTO calendarDTO){
        calendarsService.addCalendar(calendarDTO);
        return "Calendar added!";
    }
}
