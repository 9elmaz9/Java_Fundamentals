package lambda;

import java.util.ArrayList;

public class StudentInfo {

    void testStudent(ArrayList<Student> al , StudentsChecks sc){

        for (Student s : al){
            if (sc.check(s)){
                System.out.println(s);
            }
        }
    }

 //  // sozdadim 3 metoda
 //  //1
 //  void printStudentsOverGrade(ArrayList<Student> al, double grade) {
 //    for (Student s : al) {
 //        if (s.avgGrade > grade) {
 //            System.out.println(s);
 //        }
 //    }
 //   }

 //   //2
 //  // iskat stud do kakogoto vosrasta
 //  void printStudentsOnderAge(ArrayList<Student> al, int age) {
 //    for (Student s : al) {
 //        if (s.age < age) {
 //            System.out.println(s);
 //        }
 //    }
 //  }

 //  void printStudentsMixCondition(ArrayList<Student> al, int age, double grade, char sex) {
 //    for (Student s : al) {
 //        if (s.age > age && s.avgGrade < grade && s.sex == sex) {
 //            System.out.println(s);
 //        }
 //    }
 //   }
 }


//----------------------------------------------------------------
class Test {
    public static void main(String[] args) {
        // sozdaem studentov po zadanim parametram
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Maria", 'f', 23, 3, 9.1);

        // pomestim vsex studentov v ArrayList
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);



     StudentInfo info = new StudentInfo();
     info.testStudent(students, new CheckOverGrade());
        System.out.println("-----------------------------------------------------------");


     info.testStudent(students, new StudentsChecks() { // ANONUMNIT CLASS
         //  nizje anonimniy klass , sozdalca sam ,mne  nuzjno tam sdelat override return methoda check
         @Override
         public boolean check(Student s) {
             return s.age<30;
         }
     });
        System.out.println("----------------------------------------------------------------");
     // mojno zamenit metod vishe Lambda
        info.testStudent(students, (Student s) ->{ return s.age<30;});
        // v figurnih scobcah telo metoda

        System.out.println("----------------------------------------------------------------");







 // info.printStudentsOverGrade(students, 8);
 // System.out.println("-----------------------------");
 // info.printStudentsOnderAge(students, 30); //do 30 - t.e menshe 30
 // System.out.println("-----------------------------");
 // //tyt ishem s kotorim bolshe  20 let, av grade menshe 9 , devyshka
 // info.printStudentsMixCondition(students, 20, 9.5, 'f');
    }
}
//_______________________________________________________________________________________
interface StudentsChecks {
    boolean check(Student s);
}

//---------------------------------------------------------------------------------------

class CheckOverGrade implements StudentsChecks {
    @Override
    public boolean check(Student s) {
        return s.avgGrade>8;
    }
}

