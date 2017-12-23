package io.github.hjipster.application.cucumber.stepdefs;

import io.github.hjipster.application.HjipsterApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = HjipsterApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
