package main.java.com.uep.wap.model;

@Entity
@Table(name = "Calendar")
public class Calendar {
    @Id
    @Column(name = "calendar_id")
    private long calendarId;

    @Column(name = "calendar_user")
    @OneToOne
    @JoinColumn(name = "user_id")
    private User calendarUser;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
}
