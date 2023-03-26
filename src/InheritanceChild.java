public class InheritanceChild extends Inheritance {
//    public static void main(String[] args) {
//        InheritanceChild inheritanceChild = new InheritanceChild();     // creating object
//        inheritanceChild.                                               // calling method from object class
//   }
//
    String name = "Child";
    int age = 25;
    double salary1 = 50000.00;
    double bonus = 10000.00;

    public static void main(String[] args) {
        InheritanceChild inheritanceChild = new InheritanceChild();
        inheritanceChild.add();

    }

    public void add (){
        double add = salary+bonus;
        System.out.println(name+"=" + add);
    }

    }
