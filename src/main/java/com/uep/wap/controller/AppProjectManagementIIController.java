package com.uep.wap.controller;

import com.uep.wap.dto.AppProjectManagementIIDTO;
import com.uep.wap.model.AppProjectManagementII;
import com.uep.wap.service.AppProjectManagementIIsService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api")
public class AppProjectManagementIIController {

        private final AppProjectManagementIIsService appProjectManagementIIsService;

        public AppProjectManagementIIController(AppProjectManagementIIsService appProjectManagementIIsService) {
            this.appProjectManagementIIsService = appProjectManagementIIsService;
        }

        @GetMapping(path = "/hello")
        public String sayHello(){
            return "Hello!";
        }

        @GetMapping(path = "/appProjectManagementIIs")
        public Iterable<AppProjectManagementII> getAllAppProjectManagementIIs(){
            return appProjectManagementIIsService.getAllAppProjectManagementIIs();
        }

        @PostMapping(path = "/appProjectManagementIIs")
        public String addAppProjectManagementIIs(@RequestBody AppProjectManagementIIDTO appProjectManagementIIDTO){
            appProjectManagementIIsService.addAppProjectManagementII(appProjectManagementIIDTO);
            return "AppProjectManagementII added!";


    }
}
