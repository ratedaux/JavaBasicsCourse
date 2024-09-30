package homework15;

import javax.print.Doc;

public class Doctor {

    String name;
    String subject;
    int experience;

    public Doctor(String name, String subject, int experience){
        this.name=name;
        this.subject=subject;
        this.experience=experience;
    }

    public static void treatPatient(){
        System.out.println("Treating a patient.");
    }

    public static void inspectPatient(){
        System.out.println("Inspecting a patient.");
    }
}
