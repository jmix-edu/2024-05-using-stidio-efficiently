package com.company.jmixpmflowbase.entity;

import com.company.jmixpmflowbase.entity.key.QrtzTriggerCompKey;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.data.DdlGeneration;
import jakarta.persistence.*;

@DdlGeneration(value = DdlGeneration.DbScriptGenerationMode.DISABLED)
@JmixEntity
@Table(name = "qrtz_triggers")
@Entity
public class QrtzTrigger {
    @EmbeddedId
    private QrtzTriggerCompKey id;

    @Column(name = "calendar_name", length = 200)
    private String calendarName;

    @InstanceName
    @Column(name = "description", length = 250)
    private String description;

    @Column(name = "end_time")
    private Long endTime;

    @Column(name = "job_data")
    private byte[] jobData;

    @Column(name = "misfire_instr")
    private Integer misfireInstr;

    @Column(name = "next_fire_time")
    private Long nextFireTime;

    @Column(name = "prev_fire_time")
    private Long prevFireTime;

    @Column(name = "priority")
    private Integer priority;

    @JoinColumns({
            @JoinColumn(name = "job_name", referencedColumnName = "job_name", nullable = false),
            @JoinColumn(name = "job_group", referencedColumnName = "job_group", nullable = false),
            @JoinColumn(name = "sched_name", referencedColumnName = "sched_name", nullable = false)
    })
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private QrtzJobDetail qrtzJobDetail;

    @Column(name = "start_time", nullable = false)
    private Long startTime;

    @Column(name = "trigger_state", nullable = false, length = 16)
    private String triggerState;

    @Column(name = "trigger_type", nullable = false, length = 8)
    private String triggerType;

    public String getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    public String getTriggerState() {
        return triggerState;
    }

    public void setTriggerState(String triggerState) {
        this.triggerState = triggerState;
    }

    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public QrtzJobDetail getQrtzJobDetail() {
        return qrtzJobDetail;
    }

    public void setQrtzJobDetail(QrtzJobDetail qrtzJobDetail) {
        this.qrtzJobDetail = qrtzJobDetail;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Long getPrevFireTime() {
        return prevFireTime;
    }

    public void setPrevFireTime(Long prevFireTime) {
        this.prevFireTime = prevFireTime;
    }

    public Long getNextFireTime() {
        return nextFireTime;
    }

    public void setNextFireTime(Long nextFireTime) {
        this.nextFireTime = nextFireTime;
    }

    public Integer getMisfireInstr() {
        return misfireInstr;
    }

    public void setMisfireInstr(Integer misfireInstr) {
        this.misfireInstr = misfireInstr;
    }

    public byte[] getJobData() {
        return jobData;
    }

    public void setJobData(byte[] jobData) {
        this.jobData = jobData;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCalendarName() {
        return calendarName;
    }

    public void setCalendarName(String calendarName) {
        this.calendarName = calendarName;
    }

    public QrtzTriggerCompKey getId() {
        return id;
    }

    public void setId(QrtzTriggerCompKey id) {
        this.id = id;
    }
}