package ReviewClass08;

public class School {
    public static void main(String[] args) {
        Teacher t = new Teacher("John", "Smith");
        System.out.println(t.name);

        Teacher t1 = new Teacher("Jane", "Smith", "Biology");
        t1.teach();

        Teacher t2 = new Teacher("Jack", "Smith", 5);

        Teacher.school = "Syntax";

        Teacher.work(); // public
        t2.print();   // protected
        t2.teach();  // default

        // t2.getBonus(); method from the type Teacher is not visible

        /*
           variable syntax

             OPTIONAL                OPTIONAL                MUST           MUST

           access modifier       non-access modifier        dataType        name
              public                   static                String         breed
         */


        

        // public -> protected -> default -> private



        /*
           method syntax

              OPTIONAL                OPTIONAL                 MUST             MUST

           access modifier       non-access modifier        returnType          name
              public                   static                  void           printInfo
         */


    }
}
