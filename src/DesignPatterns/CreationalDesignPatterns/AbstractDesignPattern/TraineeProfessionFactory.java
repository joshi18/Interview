package DesignPatterns.CreationalDesignPatterns.AbstractDesignPattern;

public class TraineeProfessionFactory  implements AbstactFactory{

    @Override
    public Profession getabstactprofession(String typeOfprofession) {
        if (typeOfprofession ==null){
            return null;
        }
        if (typeOfprofession.equalsIgnoreCase("TranieeDoctor")){
            return new TraineeDoctor();
        } else if (typeOfprofession.equalsIgnoreCase("TranieeTeacher")) {
            return new TraineeTeacher();

        }
        return null;
    }
}
