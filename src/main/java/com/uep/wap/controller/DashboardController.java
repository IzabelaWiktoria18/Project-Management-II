package com.uep.wap.controller;

import com.uep.wap.dto.DashboardDTO;
import com.uep.wap.dto.DashboardsDataDTO;
import com.uep.wap.model.Dashboard;
import com.uep.wap.service.DashboardsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class DashboardController {

    private final DashboardsService dashboardsService;

    public DashboardController(DashboardsService dashboardsService) {
        this.dashboardsService = dashboardsService;
    }

//    @GetMapping(path = "/hello")
//    public String sayHello(){
//        return "Hello!";
//    }

    @GetMapping(path = "/dashboards")
    public Iterable<Dashboard> getAllStudents(){
        return dashboardsService.getAllDashboards();
    }

    @PostMapping(path = "/dashboards")
    public String addStudents(@RequestBody DashboardDTO dashboardDTO){
        dashboardsService.addDashboard(dashboardDTO);
        return "Dashboard added!";
    }
}
