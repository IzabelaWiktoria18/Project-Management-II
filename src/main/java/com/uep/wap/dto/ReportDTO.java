package com.uep.wap.dto;

import com.uep.wap.model.Project;


public class ReportDTO {
    private String reportName;

    private Project project;

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public String getReportName() {
        return reportName;
    }

    public Project getProject() {
        return project;
    }
}
