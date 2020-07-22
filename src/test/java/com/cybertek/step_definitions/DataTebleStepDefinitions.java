package com.cybertek.step_definitions;

import io.cucumber.java.en.Then;

import java.util.List;

public class DataTebleStepDefinitions {

    @Then("User sgould see below words displayed")
    public void user_sgould_see_below_words_displayed(List<String> fruitList) {

        System.out.println("fruitList.size() = "+fruitList.size());//fruitList.size().soutv
        System.out.println("fruitList = " + fruitList);
    }

}
