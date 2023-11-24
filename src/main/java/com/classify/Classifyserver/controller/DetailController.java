package com.classify.Classifyserver.controller;

import com.classify.Classifyserver.entity.SchedulerDetail;
import com.classify.Classifyserver.repository.SchedulerDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping
public class DetailController {
    private final SchedulerDetailRepository schedulerDetailRepository;

    @Autowired
    public DetailController(SchedulerDetailRepository schedulerDetailRepository) {
        this.schedulerDetailRepository = schedulerDetailRepository;
    }
    @GetMapping("/schedulerDetail/{schedule_id}")
    public List<SchedulerDetail> findAll(@PathVariable Long schedule_id){
        return schedulerDetailRepository.findBySchedulerId(schedule_id);}
    }