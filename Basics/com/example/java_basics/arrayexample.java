
/*We learn about class, static method, static block, static variable, array, enhanced for loop, string
 * jagged array, multidimensional array and other concepts in this part
 */
class Mobile {
    String brand;
    int price;
    String network;
    static String name; // Static variable is a common variable

    // static block for not using the memory often for creating same name
    static {
        name = "Hariram";
        System.out.println("in static block");

    }

    // Constructor block
    public Mobile() {

        brand = "";
        price = 200;
        System.out.println("In constructor block");
    }

    public void show() {
        System.out.println(brand + " " + price + " " + name);
    }

    //static method
    public static void show1(Mobile obj){
        System.out.println("In static method");
        System.out.println(obj.brand + " " + obj.price + " " + name);
        // you cannot directly use non static variable inside static method
    }


}

public class arrayexample {

    public static void main(String a[]) {

        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;

        Mobile obj2 = new Mobile();
        obj2.brand = "Apple";
        obj2.price = 1500;

        Mobile.name = "Phone";

        obj1.show();
        obj2.show();
        Mobile.show1(obj1);

    }
}

// int num2DimArray[][] = new int[3][4];

// for loop to print values in an array
// for (int i = 0; i < 3; i++) {

// for (int j = 0; j < 4; j++) {

// num2DimArray[i][j] = (int) (Math.random() * 10);
// System.out.print(num2DimArray[i][j] + " ");
// }
// System.out.println();

// }

// System.out.println();

// enhanced for loop

// for (int m[] : num2DimArray) {

// for (int n : m)
// System.out.print(n + " ");
// System.out.println();
// }

// System.out.println();

// jagged array
// int jagged[][] = new int[3][];

// jagged[0] = new int[3];
// jagged[1] = new int[4];
// jagged[2] = new int[2];

// to run for loop in jagged array

// for (int i = 0; i < jagged.length; i++) {

// for (int j = 0; j < jagged[i].length; j++) {

// num2DimArray[i][j] = (int) (Math.random() * 10);
// System.out.print(num2DimArray[i][j] + " ");
// }
// System.out.println();

// }

// System.out.println();

// enhanced loop for jagged array

// for (int m[] : num2DimArray) {

// for (int n : m)
// System.out.print(n + " ");
// System.out.println();
// }

// array's use cases

// int nums[]=new int[6];

// nums[0]=5;
// nums[1]=50;
// nums[2]=15;
// nums[3]=3;

// for (int i=0;i<nums.length;i++){

// System.out.println(nums[i]);
// }

// create the student object

/*
 * Student s1=new Student();
 * s1.name="Tarbi";
 * s1.rollno=34;
 * s1.marks=88;
 * 
 * Student s2=new Student();
 * s2.name="Harbi";
 * s2.rollno=3;
 * s2.marks=80;
 * 
 * Student s3=new Student();
 * s3.name="Hardika";
 * s3.rollno=34;
 * s3.marks=88;
 * 
 * 
 * //create the array
 * Student students[]=new Student[3];
 * students[0]=s1;
 * students[1]=s2;
 * students[2]=s3;
 * 
 * //print the content
 * for(int i=0;i<students.length;i++){
 * 
 * System.out.println(students[i].name+ ":"+ students[i].marks);
 * }
 * 
 * 
 * //enhanced loop
 * 
 * for(Student stud: students){
 * 
 * System.out.println(stud.name+":"+stud.marks);
 * }
 * 
 * 
 * // characters array
 * // string
 * String name1= "navin";
 * System.out.println(name1.concat("reddy"));
 * System.out.println();
 * 
 * // string is also a class
 * String name2 = new String("Tarbi");
 * name2=name2+"Pyakurel";
 * System.out.println(name2);
 * System.out.println(name2.hashCode());
 * System.out.println("Hello"+name2);
 * 
 * 
 * StringBuffer sb= new StringBuffer("Navin");
 * System.out.println(sb.capacity());
 * System.out.println(sb.length());
 * sb.append("Pyakurel");
 * System.out.println(sb);
 * 
 * }}
 * 
 * 
 * 
 * class Student{
 * String name;
 * int rollno;
 * int marks;
 * }
 * 
 * 
 */
