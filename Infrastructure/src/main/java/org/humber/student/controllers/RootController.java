package org.humber.student.controllers;

import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

@RestController
@RequestMapping("/")
@Hidden
public class RootController {

    @GetMapping
    public RedirectView redirectToSwaggerUi() {
        return new RedirectView("/swagger-ui.html");
    }

}
