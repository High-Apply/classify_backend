package com.classify.Classifyserver.repository;

import com.classify.Classifyserver.entity.Scheduler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface SchedulerRepository extends JpaRepository<Scheduler,Long> {
    @Query(value = "SELECT DISTINCT s.schedule_name, s.schedule_start, s.schedule_end " +
            "FROM student AS st " +
            "JOIN timetable AS tt ON st.student_id = tt.student_id " +
            "JOIN class_timetable_junction AS ctj ON tt.timetable_id = ctj.timetable_id " +
            "JOIN lesson AS l ON ctj.class_id = l.class_id " +
            "JOIN schedule_class_junction AS scj ON l.class_id = scj.class_id " +
            "JOIN schedule AS s ON scj.schedule_id = s.schedule_id " +
            "WHERE st.student_id = ? ", nativeQuery = true)
    List<Scheduler> findByStudentId(Long StudentId);
}
