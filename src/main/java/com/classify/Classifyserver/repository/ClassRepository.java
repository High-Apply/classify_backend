package com.classify.Classifyserver.repository;
import com.classify.Classifyserver.entity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClassRepository extends JpaRepository<Lesson, Long> {

    List<Lesson> findByTimetableId(Long timetableId);
}
