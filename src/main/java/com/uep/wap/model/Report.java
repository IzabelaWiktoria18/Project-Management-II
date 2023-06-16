package com.uep.wap.model;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "Calendar")
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long reportId;


    private String reportName;


    @JoinColumn(name = "projectReports")
    @ManyToOne
    private Project reportProject;

    public Report() {
    }


}
