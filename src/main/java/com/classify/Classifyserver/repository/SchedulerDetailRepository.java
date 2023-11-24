package com.classify.Classifyserver.repository;

import com.classify.Classifyserver.entity.Scheduler;
import com.classify.Classifyserver.entity.SchedulerDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SchedulerDetailRepository extends JpaRepository<SchedulerDetail, Long> {
    @Query(value = "select * " +
            "from schedule " +
            "where schedule_id = ? ", nativeQuery = true)

    List<SchedulerDetail> findBySchedulerId(Long ScheduleId);
}
