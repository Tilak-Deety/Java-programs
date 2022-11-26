package Practise;

public class Student extends Users implements Talk{
    public String major;
    public String firstName;
    public String lastName;
//    public void sayHello(){
//        System.out.println("Hi "+ firstName + " " + lastName + ". How are you ?");
//    }
//    @Override
    public void sayHello(){
        System.out.println("hi my "+ major + " is Computer Science" + " and My name is "+ firstName + " "+ lastName);
    }

    @Override
    public void sayIntro() {
        System.out.println("Hi I'm "+ firstName + " " + lastName);
    }
}
