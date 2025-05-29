//WAP to display the array and using object. 

class Student {

    int rollno;
    String name;
    int marks;
}

public class ThreeD {
    public static void main(String[] args) {
        

       Student s1 = new Student();
       s1.rollno=100;
       s1.name="Gaurav";
       s1.marks=80;

       Student s2 = new Student();
       s2.rollno=74;
       s2.name="Bhushan";
       s2.marks=99;

       Student s3 = new Student();
       s3.rollno=34;
       s3.name="Tejas";
       s3.marks=35;

        Student Student[] = new Student[3];
        Student [0]=s1;
        Student [1]=s2;
        Student [2]=s3;

       for (int i=0 ; i<Student.length ; i++){
        System.out.println(Student[i].name + " : " + Student[i].marks + " : " + Student[i].rollno);
       }
    }
}
