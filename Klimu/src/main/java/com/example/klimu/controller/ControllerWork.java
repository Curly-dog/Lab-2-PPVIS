package controller;

import model.Patient;
import model.Survay;

import java.util.ArrayList;

public class ControllerWork {
    private ArrayList<Patient> patientList;

    public ArrayList<Patient> downloadPatientList(){return patientList;}
    public void changeTherapy(){}
    public Survay addSurvay(){return new Survay();}
}
