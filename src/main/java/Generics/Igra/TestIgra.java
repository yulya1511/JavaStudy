package Generics.Igra;

public class TestIgra {

    public static void main(String[] args) {
        Schoolar schoolar1 = new Schoolar("Юля", 15);
        Schoolar schoolar2 = new Schoolar("Лена", 15);

        Student student1 = new Student("Наташа", 25);
        Student student2 = new Student("Марго", 26);

        Employee employee1 = new Employee("Дима", 30);
        Employee employee2 = new Employee("Володя", 33);

        Team <Schoolar>schoolarTeam = new Team <>("Малыши");
        Team <Student>studentTeam = new Team<>("Гугарвард");
        Team <Employee>employeeTeam = new Team<>("Бойцы");

        schoolarTeam.addNewParticipant(schoolar1);
        schoolarTeam.addNewParticipant(schoolar2);

        studentTeam.addNewParticipant(student1);
        studentTeam.addNewParticipant(student2);

        employeeTeam.addNewParticipant(employee1);
        employeeTeam.addNewParticipant(employee2);

        Team <Schoolar>schoolarTeam2 = new Team <>("Малыши2");
        Schoolar schoolar3 = new Schoolar("Аня", 15);
        Schoolar schoolar4 = new Schoolar("Лиза", 15);
        schoolarTeam2.addNewParticipant(schoolar3);
        schoolarTeam2.addNewParticipant(schoolar4);

        schoolarTeam.playWith(schoolarTeam2);





    }








}
