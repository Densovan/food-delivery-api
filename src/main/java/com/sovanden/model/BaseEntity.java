package com.sovanden.model;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BaseEntity {

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "updated_by")
    private String updatedBy;

    @Column(name = "created_at", insertable = true, updatable = false)
    private Date createdDate;

    @Column(name = "updated_at", insertable = false, updatable = true)
    private Date updatedDate;
}
