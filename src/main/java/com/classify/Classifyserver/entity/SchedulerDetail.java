package com.classify.Classifyserver.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class SchedulerDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int schedule_id;
    private String schedule_name;
    private Date schedule_start,schedule_end;
    private String schedule_uploader;
    private String schedule_description;
    private String uploader_status;
    private int uploader_id;

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

    public String getSchedule_uploader() {
        return schedule_uploader;
    }

    public void setSchedule_uploader(String schedule_uploader) {
        this.schedule_uploader = schedule_uploader;
    }

    public String getSchedule_description() {
        return schedule_description;
    }

    public void setSchedule_description(String schedule_description) {
        this.schedule_description = schedule_description;
    }

    public String getUploader_status() {
        return uploader_status;
    }

    public void setUploader_status(String uploader_status) {
        this.uploader_status = uploader_status;
    }

    public int getUploader_id() {
        return uploader_id;
    }

    public void setUploader_id(int uploader_id) {
        this.uploader_id = uploader_id;
    }

    public int getSchedule_id() {
        return schedule_id;
    }

    public void setSchedule_id(int scheduler_id) {
        this.schedule_id = scheduler_id;
    }
}
