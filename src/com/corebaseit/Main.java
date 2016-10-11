package com.corebaseit;

public class Main {

    public static void main(String[] args) {

        /**
         * UML Diagramm

         The model is an interface defining the data to be displayed or otherwise acted upon in the user interface.
         *****
         The view is an interface that displays data (the model) and routes user commands (events) to the presenter
         to act upon that data. The view usually (excepted MVP Passive View variant) has a reference to its presenter.
         *****
         The presenter acts upon the model and the view. It retrieves data from repositories (the model), and formats
         it for display in the view and vice versa. You can say: The presenter is the "middle-man"
         (played by the controller in MVC) and has references to both, model and view. Normally the presenter
         observes the model to receive model updates. So when an model update has happend, the presenter will update
         the view by invoking the corresponding view method.

         */

        Contract.ShowMeTheStuffNow showMeTheStuffNow = new View();
        Model model = new Model("Vincent", "", 34);
        model.setLastName("Bevia");

        Presenter presenter = new Presenter(showMeTheStuffNow, model);
        presenter.triggerTheView(showMeTheStuffNow);

    }
}
