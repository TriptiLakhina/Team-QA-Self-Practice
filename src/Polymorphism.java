public class Polymorphism {
//    int a;
//    int b;
//    int c;
//    double d;
//    double add;
//    double add=a+b+c+d;

    ;

    //no return type with parameter
    void add (int a, int b){
  //      int add=a+b;
   //     add=a+b+c+d;

        System.out.println(a+b);
    }
     void add(int a,int b,int c){
        System.out.println(a+b+c);
}
     void add(int a, int b, int c, double d){
 //       int add=a+b+c;
        System.out.println(a+b+c+d);
    };

    public static void main(String[] args) {
        Polymorphism polymorphism = new Polymorphism();
        polymorphism.add(20,30);
        polymorphism.add(21,32,52);
        polymorphism.add(21,21,32,23.05);
    }

}
