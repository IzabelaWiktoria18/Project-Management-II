package com.uep.wap.model;
import javax.persistence.*;
@Entity
@Table(name = "Calendar")
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long reportId;


    private String reportName;


    @JoinColumn(name = "projectReports")
    @ManyToOne
    private Project project;

    public Report() {
    }

    public void setReportId(long reportId) {
        this.reportId = reportId;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public long getReportId() {
        return reportId;
    }

    public String getReportName() {
        return reportName;
    }

    public Project getProject() {
        return project;
    }
}
