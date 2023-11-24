package com.classify.Classifyserver.controller;

import com.classify.Classifyserver.entity.Lesson;
import com.classify.Classifyserver.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping
public class TimetableController {

    private final ClassRepository classRepository;
    @Autowired
    public TimetableController(ClassRepository classRepository) {
        this.classRepository = classRepository;
    }

    @GetMapping("/class/{timetable_Id}")
    public List<Lesson> findAll(@PathVariable Long timetable_Id) {
        return classRepository.findByTimetableId(timetable_Id);
    }
}
