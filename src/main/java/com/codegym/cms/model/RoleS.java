package com.codegym.cms.model;

import javax.persistence.*;

@Entity
@Table(name = "RoleS")
public class RoleS {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String nameRole;

    public RoleS(Long id, String nameRole) {
        this.id = id;
        this.nameRole = nameRole;
    }

    public RoleS() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameRole() {
        return nameRole;
    }

    public void setNameRole(String nameRole) {
        this.nameRole = nameRole;
    }
}
