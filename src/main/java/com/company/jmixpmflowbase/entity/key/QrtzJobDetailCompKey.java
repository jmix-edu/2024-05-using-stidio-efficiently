package com.company.jmixpmflowbase.entity.key;

import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;

import java.util.Objects;

@JmixEntity
@Embeddable
public class QrtzJobDetailCompKey {
    @Column(name = "job_group", nullable = false, unique = true, length = 200)
    private String jobGroup;

    @Column(name = "job_name", nullable = false, unique = true, length = 200)
    private String jobName;

    @Column(name = "sched_name", nullable = false, unique = true, length = 120)
    private String schedName;

    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobGroup() {
        return jobGroup;
    }

    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobName, jobGroup, schedName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QrtzJobDetailCompKey entity = (QrtzJobDetailCompKey) o;
        return Objects.equals(this.jobName, entity.jobName) &&
                Objects.equals(this.jobGroup, entity.jobGroup) &&
                Objects.equals(this.schedName, entity.schedName);
    }
}