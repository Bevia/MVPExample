package com.corebaseit;

/**
 * Created by vincentbevia on 29/09/16.
 */
public class View implements Contract.ShowMeTheStuffNow{


    @Override
    public void showItNow(String showMe) {
        System.out.println("show me the stuff...." +  showMe);
    }
}
