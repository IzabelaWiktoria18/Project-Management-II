package com.uep.wap.controller;

import com.uep.wap.dto.ReportDTO;
import com.uep.wap.dto.ReportsDataDTO;
import com.uep.wap.model.Report;
import com.uep.wap.service.ReportsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class ReportController {

    private final ReportsService reportsService;

    public ReportController(ReportsService reportsService) {
        this.reportsService = reportsService;
    }

//    @GetMapping(path = "/hello")
//    public String sayHello(){
//        return "Hello!";
//    }

    @GetMapping(path = "/report")
    public Iterable<Report> getAllReports(){
        return reportsService.getAllReports();
    }

    @PostMapping(path = "/reports")
    public String addReports(@RequestBody ReportDTO reportDTO){
        reportsService.addReport(reportDTO);
        return "Report added!";
    }
}
