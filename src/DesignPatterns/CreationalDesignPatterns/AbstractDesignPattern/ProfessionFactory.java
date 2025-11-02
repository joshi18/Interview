package src.DesignPatterns.CreationalDesignPatterns.AbstractDesignPattern;

public class ProfessionFactory implements AbstactFactory {

    @Override
    public Profession getabstactprofession(String typeOfprofession) {
        if (typeOfprofession == null){
            return null;
        }
        if (typeOfprofession.equalsIgnoreCase("Teacher")){
            return new Teacher();
        }
        else if (typeOfprofession.equalsIgnoreCase("Doctor")) {
            return new Doctor();

        }
        return null;
    }
}
