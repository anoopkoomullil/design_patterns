package patterns.creational.abstractfactory;

public class ProfessionAbstractFactory extends AbstractFactory {
    @Override
    public  Profession getProfession(String type){
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
