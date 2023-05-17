package com.uep.wap.dto;

import com.uep.wap.model.Dashboard;

import java.util.List;

public class DashboardsDataDTO {
    List<DashboardDTO> dashboards;

    public List<DashboardDTO> getDashboards() {
        return dashboards;
    }

    public void setDashboards(List<DashboardDTO> dashboards) {
        this.dashboards = dashboards;
    }
}
