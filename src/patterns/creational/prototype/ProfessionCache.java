package patterns.creational.prototype;

import java.util.HashMap;
import java.util.Hashtable;

public class ProfessionCache {
    private static Hashtable<Integer,Profession> professionHashtable = new Hashtable<>();

    public static Profession getClonedProgession(int id){
        Profession cached = professionHashtable.get(id);
        return  (Profession)cached.cloningMethod();
    }
    public static void loadProfessionCache(){
        Doctor doctor = new Doctor();
        doctor.id=1;
        professionHashtable.put(doctor.id, doctor);
        Teacher teacher = new Teacher();
        teacher.id=2;
        professionHashtable.put(teacher.id, teacher);
        Engineer engineer=new Engineer();
        engineer.id=3;
        professionHashtable.put(engineer.id, engineer);
    }
}
