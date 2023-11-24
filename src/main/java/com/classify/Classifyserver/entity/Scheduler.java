package com.classify.Classifyserver.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class Scheduler {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String schedule_name;
    private Date schedule_start;
    private Date schedule_end;

    public String getSchedule_name() {
        return schedule_name;
    }

    public void setSchedule_name(String schedule_name) {
        this.schedule_name = schedule_name;
    }

    public Date getSchedule_start() {
        return schedule_start;
    }

    public void setSchedule_start(Date schedule_start) {
        this.schedule_start = schedule_start;
    }

    public Date getSchedule_end() {
        return schedule_end;
    }

    public void setSchedule_end(Date schedule_end) {
        this.schedule_end = schedule_end;
    }
}
