package main.java.com.uep.wap.model;

@Entity
@Table(name = "Calendar")
public class Report {
    @Id
    @Column(name = "report_id")
    private long reportId;

    @Column(name = "report_name")
    private String reportName;

    @Column(name = "project")
    @JoinColumn(name = "project_id")
    @ManyToOne
    private Project project;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
}
