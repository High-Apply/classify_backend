package com.classify.Classifyserver.controller;


import com.classify.Classifyserver.repository.SchedulerRepository;
import com.classify.Classifyserver.entity.Scheduler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class SchedulerController {
    private final SchedulerRepository schedulerRepository;

    @Autowired
    public SchedulerController(SchedulerRepository schedulerRepository) {
        this.schedulerRepository = schedulerRepository;
    }

    @GetMapping("/scheduler/{student_id}")
    public List<Scheduler> findAll(@PathVariable Long student_id){
        return schedulerRepository.findByStudentId(student_id);
    }
}
