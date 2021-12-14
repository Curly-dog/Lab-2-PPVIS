package controller;

import model.Appointment;
import model.Card;
import model.Patient;

import java.util.ArrayList;

public class ControllerPatientPersonalAccount {
    private ArrayList<Appointment> appointmentList;
    private Patient patient;
    private ControllerFormFill controllerFormFill;

    public void cardCheck(){}
    public void diagnosisCheck(){}
    public ArrayList<Appointment> appointmentCheck(Patient patient){return appointmentList;}
    public ControllerFormFill createControllerProcessingTextMaterial(){ return controllerFormFill;}
}
