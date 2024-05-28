package com.company.jmixpmflowbase.entity;

import com.company.jmixpmflowbase.entity.key.QrtzJobDetailCompKey;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.data.DdlGeneration;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@DdlGeneration(value = DdlGeneration.DbScriptGenerationMode.DISABLED)
@JmixEntity
@Table(name = "qrtz_job_details")
@Entity
public class QrtzJobDetail {
    @EmbeddedId
    private QrtzJobDetailCompKey id;

    @InstanceName
    @Column(name = "description", length = 250)
    private String description;

    @Column(name = "is_durable", nullable = false)
    private Boolean isDurable = false;

    @Column(name = "is_nonconcurrent", nullable = false)
    private Boolean isNonconcurrent = false;

    @Column(name = "is_update_data", nullable = false)
    private Boolean isUpdateData = false;

    @Column(name = "job_class_name", nullable = false, length = 250)
    private String jobClassName;

    @Column(name = "job_data")
    private byte[] jobData;

    @Column(name = "requests_recovery", nullable = false)
    private Boolean requestsRecovery = false;

    public Boolean getRequestsRecovery() {
        return requestsRecovery;
    }

    public void setRequestsRecovery(Boolean requestsRecovery) {
        this.requestsRecovery = requestsRecovery;
    }

    public byte[] getJobData() {
        return jobData;
    }

    public void setJobData(byte[] jobData) {
        this.jobData = jobData;
    }

    public String getJobClassName() {
        return jobClassName;
    }

    public void setJobClassName(String jobClassName) {
        this.jobClassName = jobClassName;
    }

    public Boolean getIsUpdateData() {
        return isUpdateData;
    }

    public void setIsUpdateData(Boolean isUpdateData) {
        this.isUpdateData = isUpdateData;
    }

    public Boolean getIsNonconcurrent() {
        return isNonconcurrent;
    }

    public void setIsNonconcurrent(Boolean isNonconcurrent) {
        this.isNonconcurrent = isNonconcurrent;
    }

    public Boolean getIsDurable() {
        return isDurable;
    }

    public void setIsDurable(Boolean isDurable) {
        this.isDurable = isDurable;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public QrtzJobDetailCompKey getId() {
        return id;
    }

    public void setId(QrtzJobDetailCompKey id) {
        this.id = id;
    }
}