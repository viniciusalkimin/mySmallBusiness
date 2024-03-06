package com.alkimin.mybusiness.core.usecase;

import com.alkimin.mybusiness.application.service.SchedulingService;
import com.alkimin.mybusiness.infrastructure.dto.SchedulingData;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Schedule {

    //private SchedulingService schedulingService;

    public void execute(SchedulingData schedulingData) {
       // var scheduling = schedulingService.scheduling(schedulingData);
    }
}
