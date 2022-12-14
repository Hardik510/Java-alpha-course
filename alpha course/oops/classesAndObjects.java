package oops.java;

public class classesAndObjects {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created a Pen object named p1

        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        // p1.setColor("Yellow");  // this can directly be written as shown in next line. function is not needed we can directly change the value of properties;
        p1.color = "Yellow";
        System.out.println(p1.color);
    }
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip; 
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy, int chem, int math){
        percentage = (phy + chem + math) / 3;
    }
}
