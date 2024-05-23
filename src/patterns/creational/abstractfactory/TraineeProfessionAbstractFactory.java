package patterns.creational.abstractfactory;

public class TraineeProfessionAbstractFactory extends AbstractFactory {
    @Override
    public  Profession getProfession(String type){
        if(type==null){
            return null;
        }else if(type.equals("TraineeDoctor")){
            return new TraineeDoctor();
        }else if(type.equals("TraineeEngineer")){
            return new TraineeEngineer();
        }else if(type.equals("TraineeTeacher")){
            return new TraineeTeacher();
        }
        return null;
    }
}
