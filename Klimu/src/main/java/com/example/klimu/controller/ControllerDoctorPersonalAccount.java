package controller;

import model.Appointment;
import model.Patient;

import java.util.ArrayList;

public class ControllerDoctorPersonalAccount {
    private Appointment appointment;
    private ArrayList<Appointment> appointmentList;
    private ArrayList<Patient> patientList;
    private ControllerWork controllerWork;

    public ArrayList<Patient> getPatientList(){return patientList;};
    public ControllerWork createControllerProcessingTextMaterial(){ return controllerWork;}
    public Appointment createAppointment(){return appointment;}
    public ArrayList<Appointment> downloadAppointmentList(){return appointmentList;}
}
