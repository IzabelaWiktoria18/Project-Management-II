package com.uep.wap.service;

import com.uep.wap.dto.ReportDTO;
import com.uep.wap.model.Report;
import com.uep.wap.repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class ReportsService {
    @Autowired
    private ReportRepository reportRepository;

    public void addReport(ReportDTO reportDTO) {
        Report report = new Report();
        report.setReportName(reportDTO.getReportName());
        report.setReportProject(reportDTO.getProject());
        reportRepository.save(report);
        System.out.println("Report added!");
    }

    public Iterable<Report> getAllReports() {
        return reportRepository.findAll();
    }
    //get create update
}
