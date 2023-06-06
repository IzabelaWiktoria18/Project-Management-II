package com.uep.wap.model;
import jakarta.persistence.*;

@Entity
@Table(name = "Calendar")
public class Calendar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long calendarId;


    @OneToOne
    @JoinColumn(name = "calendar")
    private _User calendarUser;

    public Calendar() {
    }

    public void setCalendarId(long calendarId) {
        this.calendarId = calendarId;
    }

    public void setCalendarUser(_User calendarUser) {
        this.calendarUser = calendarUser;
    }

    public long getCalendarId() {
        return calendarId;
    }

    public _User getCalendarUser() {
        return calendarUser;
    }
}
