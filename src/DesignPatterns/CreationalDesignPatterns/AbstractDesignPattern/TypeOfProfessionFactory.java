package DesignPatterns.CreationalDesignPatterns.AbstractDesignPattern;
// Factory Producer class
public class TypeOfProfessionFactory  {

    public static AbstactFactory getabstactprofession(String typeProfession) {
       if (typeProfession == null){
           return null;
       }
       if (typeProfession.equalsIgnoreCase("MainProfession")){
           return  new ProfessionFactory();
       } else if (typeProfession.equalsIgnoreCase("TranieeProfession")) {
           return new TraineeProfessionFactory();

       }
       return null;
    }


}
