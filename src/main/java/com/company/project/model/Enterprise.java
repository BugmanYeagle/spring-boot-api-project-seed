package com.company.project.model;

import javax.persistence.*;

public class Enterprise {
    @Id
    @Column(name = "enterprise_id")
    private Integer enterpriseId;

    @Column(name = "enterprise_name")
    private String enterpriseName;

    /**
     * @return enterprise_id
     */
    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    /**
     * @param enterpriseId
     */
    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    /**
     * @return enterprise_name
     */
    public String getEnterpriseName() {
        return enterpriseName;
    }

    /**
     * @param enterpriseName
     */
    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }
}