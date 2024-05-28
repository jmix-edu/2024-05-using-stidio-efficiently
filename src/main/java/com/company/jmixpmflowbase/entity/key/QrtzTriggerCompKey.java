package com.company.jmixpmflowbase.entity.key;

import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;

import java.util.Objects;

@JmixEntity
@Embeddable
public class QrtzTriggerCompKey {
    @Column(name = "sched_name", nullable = false, unique = true, length = 120)
    private String schedName;

    @Column(name = "trigger_group", nullable = false, unique = true, length = 200)
    private String triggerGroup;

    @Column(name = "trigger_name", nullable = false, unique = true, length = 200)
    private String triggerName;

    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    public String getTriggerGroup() {
        return triggerGroup;
    }

    public void setTriggerGroup(String triggerGroup) {
        this.triggerGroup = triggerGroup;
    }

    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    @Override
    public int hashCode() {
        return Objects.hash(triggerGroup, triggerName, schedName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QrtzTriggerCompKey entity = (QrtzTriggerCompKey) o;
        return Objects.equals(this.triggerGroup, entity.triggerGroup) &&
                Objects.equals(this.triggerName, entity.triggerName) &&
                Objects.equals(this.schedName, entity.schedName);
    }
}