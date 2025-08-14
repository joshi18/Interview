package DesignPatterns.CreationalDesignPatterns.FactoryDesign;

public class ProfessionFactory {

    public Profession getprofession(String typeofProfession){

        if (typeofProfession == null){
            return null;
        }
        if (typeofProfession.equalsIgnoreCase("Doctor")){
            return new Doctor();
        } else if (typeofProfession.equalsIgnoreCase("Engineer")) {
            return new Engineer();

        } else if (typeofProfession.equalsIgnoreCase("Teacher")) {
            return new Teacher();

        }
        return null;

    }
}
