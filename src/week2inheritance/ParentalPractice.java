package week2inheritance;

import java.util.ArrayList;
import java.util.Iterator;

class Student {
    
    String name;
    int studID;
    String gender;
    int age;
}

class EleSchoolStudent extends Student {

    String allergies;
    long emergencyContactPhone;
}

class HSStudent extends EleSchoolStudent {

    String custodialParent;
    int totDetHours;
    String extracurriculars;
    float GPA;
    boolean walker;
}

class CollegeStudent extends EleSchoolStudent {

    float GPA;
    String major;
    boolean doubleMajor;
    String legStateRes;
}

public class ParentalPractice {

    public static void main(String[] args) {
        
        Student stud = new Student();
        EleSchoolStudent elemStud = new EleSchoolStudent();
        stud.age = 19;
        stud.gender = "female";
        stud.name = "Jill St. John";
        stud.studID = 0010001007;
        /* I can store a subclass in a variable typed
        to the superclass! Handy because I can write
        code that operates on the superclass before
        the subclass has even been written
         */
        stud = elemStud;
        EleSchoolStudent anotherElemStudVar;
        anotherElemStudVar = (EleSchoolStudent) stud;
        anotherElemStudVar.age = 6;
        EleSchoolStudent ESS1;
        ESS1 = (EleSchoolStudent) stud;
        ESS1.age = 5;
        ESS1.allergies = "NONE";
        ESS1.emergencyContactPhone = 2345678901L;
        ESS1.gender = "M";
        ESS1.name = "Macauley Caulkin";
        ESS1.studID = 1989;
        HSStudent HSS1 = new HSStudent();
        HSS1.GPA = 2.5f;
        HSS1.age = 16;
        HSS1.allergies = "homework";
        HSS1.custodialParent = "Archie Bunker";
        HSS1.emergencyContactPhone = 5557778888L;
        HSS1.extracurriculars = "marijuana";
        HSS1.gender = "M";
        HSS1.name = "Spiccoli";
        HSS1.studID = 666;
        HSS1.totDetHours = 10500;
        HSS1.walker = true;
        CollegeStudent CSS1 = new CollegeStudent();
        CSS1.GPA = 3.8f;
        CSS1.age = 23;
        CSS1.allergies = "juniper";
        CSS1.doubleMajor = false;
        CSS1.emergencyContactPhone = 7778889999L;
        CSS1.gender = "F";
        CSS1.legStateRes = "MO";
        CSS1.major = "Biochemistry";
        CSS1.name = "Amy Farrah Fowler";
        CSS1.studID = 1234321;
        ArrayList<Student> losEstudiantes = new ArrayList<Student>();
        losEstudiantes.add(stud);
        losEstudiantes.add(ESS1);
        losEstudiantes.add(HSS1);
        losEstudiantes.add(CSS1);
        
        // Create an iterator for the list
        Iterator<Student> iterle = losEstudiantes.iterator();
        // Use the iterator to visit each element
        while (iterle.hasNext()) {
            Object o = iterle.next();
            if (o instanceof EleSchoolStudent ) {
               printElemStudent((EleSchoolStudent) o); 
            } else {
                if (o instanceof HSStudent ) {
                    printHSStudent((HSStudent) o);
                } else {
                    if (o instanceof CollegeStudent) {
                        printCollegeStudent((CollegeStudent) o);
                    }
                }
            }
            
        }

        /* See section 11.9: demonstrate to your neighbor that
        you can use instanceof correctly and carry out a typecast
         */
        
        
        
    }

    public static void printElemStudent(EleSchoolStudent s) {
        System.out.println("This student's info: " + s.age + s.gender + s.name + s.studID);
        
    }
    
    public static void printHSStudent(HSStudent t) {
        System.out.println("This student's info: " + t.age + t.gender + t.name + t.studID);
    }
    
    public static void printCollegeStudent(CollegeStudent u) {
        System.out.println("This student's info: " + u.age + u.gender + u.name + u.studID);
    }
}
