package com.uep.wap.model;
import javax.persistence.*;

@Entity
@Table(name = "Calendar")
public class Calendar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long calendarId;


    @OneToOne
    @JoinColumn(name = "calendar")
    private User calendarUser;

    public Calendar() {
    }

    public void setCalendarId(long calendarId) {
        this.calendarId = calendarId;
    }

    public void setCalendarUser(User calendarUser) {
        this.calendarUser = calendarUser;
    }

    public long getCalendarId() {
        return calendarId;
    }

    public User getCalendarUser() {
        return calendarUser;
    }
}
