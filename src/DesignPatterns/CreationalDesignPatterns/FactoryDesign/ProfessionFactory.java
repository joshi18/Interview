package src.DesignPatterns.CreationalDesignPatterns.FactoryDesign;

import src.DesignPatterns.CreationalDesignPatterns.FactoryDesign.Doctor;
import src.DesignPatterns.CreationalDesignPatterns.FactoryDesign.Engineer;

public class ProfessionFactory {

    public Object getprofession(String typeofProfession) {

        if (typeofProfession == null) {
            return null;

        }
        if (typeofProfession.equalsIgnoreCase("Doctor")) {
            return new Doctor();
        } else if (typeofProfession.equalsIgnoreCase("Engineer")) {
            return new Engineer();

        } else if (typeofProfession.equalsIgnoreCase("Teacher")) {
            //return new DesignPatterns.CreationalDesignPatterns.FactoryDesign.Teacher();

        }
        return null;

    }
}
