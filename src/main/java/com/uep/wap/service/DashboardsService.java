package com.uep.wap.service;

import com.uep.wap.dto.DashboardDTO;
import com.uep.wap.model.Dashboard;
import com.uep.wap.repository.DashboardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class DashboardsService {
    @Autowired
    private DashboardRepository dashboardRepository;

    public void addDashboard(DashboardDTO dashboardDTO) {
        Dashboard dashboard = new Dashboard();
        dashboard.setDashboardName(dashboardDTO.getDashboardName());
//        dashboard.setProjects(dashboardDTO.getProjects());
        dashboard.setUser(dashboardDTO.getUser());
        dashboardRepository.save(dashboard);
        System.out.println("calendar added!");
    }

    public Iterable<Dashboard> getAllDashboards() {
        return dashboardRepository.findAll();
    }
    //get create update
}
