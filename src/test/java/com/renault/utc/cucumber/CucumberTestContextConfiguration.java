package com.renault.utc.cucumber;

import com.renault.utc.UserRightsApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = UserRightsApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
