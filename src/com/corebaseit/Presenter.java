package com.corebaseit;

/**
 * Created by vincentbevia on 29/09/16.
 */
public class Presenter {

    Contract.ShowMeTheStuffNow showMeTheStuffNow;
    Model model;

    public Presenter(Contract.ShowMeTheStuffNow showMeTheStuffNow, Model model) {
        this.showMeTheStuffNow = showMeTheStuffNow;
        this.model = model;
    }

    public void triggerTheView (Contract.ShowMeTheStuffNow showMeTheStuffNow) {
        showMeTheStuffNow.showItNow(model.getLastName());


    }
}
