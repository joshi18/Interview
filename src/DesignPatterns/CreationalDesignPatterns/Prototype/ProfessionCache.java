package DesignPatterns.CreationalDesignPatterns.Prototype;

import java.util.Hashtable;

public class ProfessionCache {


    private static Hashtable<Integer,Profession> professionHashtable = new Hashtable<>();

    public static Profession getCloneNewProfession(int id) {
        Profession cachedProfessionInstance = professionHashtable.get(id);
        return (Profession) cachedProfessionInstance.getClonedObject();
    }

    public static void loadProffesionCache() {
        Doctor doc = new Doctor();
        doc.id = 1;
        professionHashtable.put(doc.id,doc);

        Engineer engineer = new Engineer();
        engineer.id = 2;
        professionHashtable.put(engineer.id,engineer);


    }
}
