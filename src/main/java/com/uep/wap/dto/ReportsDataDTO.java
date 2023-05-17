package com.uep.wap.dto;

import java.util.List;

public class ReportsDataDTO {
    public List<ReportDTO> getReports() {
        return reports;
    }

    public void setReports(List<ReportDTO> reports) {
        this.reports = reports;
    }

    List<ReportDTO> reports;
}
