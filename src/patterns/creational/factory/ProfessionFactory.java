package patterns.creational.factory;

public class ProfessionFactory {
    public static Profession getProfession(String type){
        if(type==null){
            return null;
        }else if(type.equals("Doctor")){
            return new Doctor();
        }else if(type.equals("Engineer")){
            return new Engineer();
        }else if(type.equals("Teacher")){
            return new Teacher();
        }
        return null;
    }
}
