package com.codegym.cms.model;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
@Component
@Entity
@Table(name = "users")
public class User implements Validator {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @NotEmpty
    @Size(min = 2, max = 40)
    private String name;

    @NotEmpty
    @Size(min = 6, max = 10)
    private String password;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private RoleS roleS;

    public User() {
    }

    public User(@NotEmpty @Size(min = 2, max = 40) String name, @NotEmpty @Size(min = 2, max = 40) String password) {
        this.name = name;
        this.password = password;
    }

    public User(Long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public User(Long id, String name, String password, Customer customer, RoleS roleS) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.customer = customer;
        this.roleS = roleS;
    }

    public User(Long id, String name, String password, RoleS roleS) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.roleS = roleS;
    }

    public RoleS getRoleS() {
        return roleS;
    }

    public void setRoleS(RoleS roleS) {
        this.roleS = roleS;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public User(Long id, String name, String password, Customer customer) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.customer = customer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.isAssignableFrom(clazz) ;
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user = (User) target;
        String name = user.getName();
        String password = user.getPassword();
        ValidationUtils.rejectIfEmpty(errors,"name","name.empty");
        ValidationUtils.rejectIfEmpty(errors,"password", "password.empty");
        if (name.length()>20 || name.length() <5) {
            errors.rejectValue("name","name.length");
        }
        if (!name.matches("(^[a-zA-Z_0-9]*$)")) {
            errors.rejectValue("name", "name.matches");
        }

        if (password.length()>20 || name.length() <5) {
            errors.rejectValue("password","password.length");
        }
        if (!name.matches("(^[a-zA-Z_0-9]*$)")) {
            errors.rejectValue("password", "password.matches");
        }
    }



}
