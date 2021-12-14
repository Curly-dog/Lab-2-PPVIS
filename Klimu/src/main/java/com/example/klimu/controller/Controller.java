package controller;



public class Controller {

    private ControllerAuthorization controllerAuthorization;
    private ControllerRegistration controllerRegistration;
    private ControllerDoctorPersonalAccount controllerDoctorPersonalAccount;
    private ControllerPatientPersonalAccount controllerPatientPersonalAccount;

    public Controller() {

    }


    public ControllerAuthorization createAuthorizationController(){ return controllerAuthorization;}
    public ControllerRegistration createControllerMainPageProcessing(){ return controllerRegistration;}
    public ControllerDoctorPersonalAccount createControllerReviewProcessing(){ return  controllerDoctorPersonalAccount;}
    public ControllerPatientPersonalAccount createControllerProcessingTextMaterial(){ return controllerPatientPersonalAccount;}

}


