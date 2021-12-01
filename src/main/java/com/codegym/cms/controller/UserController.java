package com.codegym.cms.controller;

import com.codegym.cms.model.User;
import com.codegym.cms.service.impl.ICustomerService;
import com.codegym.cms.service.impl.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {

    @Autowired
    private ICustomerService customerService;

    @Autowired
    private IUserService userService;






}
