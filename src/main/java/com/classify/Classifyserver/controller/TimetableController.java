package com.classify.Classifyserver.controller;

import com.classify.Classifyserver.entity.Lesson;
import com.classify.Classifyserver.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class TimetableController {

    private ClassRepository classRepository;
    @Autowired
    public TimetableController(ClassRepository classRepository) {
        this.classRepository = classRepository;
    }

    @GetMapping("/class/{timetableId}")
    public List<Lesson> getClassesByTimetableId(@PathVariable Long timetableId) {
        return classRepository.findByTimetableId(timetableId);
    }
}
