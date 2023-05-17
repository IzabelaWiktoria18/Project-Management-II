package com.uep.wap.dto;

import com.uep.wap.model.User;

import javax.persistence.*;

public class CalendarDTO {
    private User calendarUser;

    public void setCalendarUser(User calendarUser) {
        this.calendarUser = calendarUser;
    }

    public User getCalendarUser() {
        return calendarUser;
    }
}
