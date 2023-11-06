package com.classify.Classifyserver.repository;

import com.classify.Classifyserver.entity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
public interface ClassRepository extends JpaRepository<Lesson, Long> {
    @Query(value = "SELECT c.class_id, c.class_name, c.classroom, c.weekday, c.class_time, t.teacher_name " +
            "FROM lesson AS c " +
            "JOIN class_timetable_junction AS ctj ON c.class_id = ctj.class_id " +
            "LEFT JOIN teacher AS t ON c.teacher_id = t.teacher_id " +
            "WHERE ctj.timetable_id = ? ", nativeQuery = true)
    List<Lesson> findByTimetableId(Long timetableId);
}
