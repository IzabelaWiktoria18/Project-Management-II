package com.uep.wap.service;

import com.uep.wap.dto.AppProjectManagementIIDTO;
import com.uep.wap.model.AppProjectManagementII;
import com.uep.wap.repository.AppProjectManagementIIRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppProjectManagementIIsService {
    @Autowired
    private AppProjectManagementIIRepository appProjectManagementIIRepository;

    public void addAppProjectManagementII(AppProjectManagementIIDTO appProjectManagementIIDTO) {
        AppProjectManagementII appProjectManagementII = new AppProjectManagementII();
//        appProjectManagementII.setProjects(appProjectManagementIIDTO.getProjects());
        appProjectManagementII.setNotifications(appProjectManagementIIDTO.getNotifications());
        appProjectManagementII.setUsers(appProjectManagementIIDTO.getUsers());
        appProjectManagementIIRepository.save(appProjectManagementII);
        System.out.println("appProjectManagementII added!");
    }

    public Iterable<AppProjectManagementII> getAllAppProjectManagementIIs() {
        return appProjectManagementIIRepository.findAll();
    }
    //get create update
}
