package inheritanceAssignment;

public class Child extends  Parent{
    void printChild(){
        System.out.println("I am a child class");
    }
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        System.out.println("method of parent class by obj of parent class");
        parent.printParent();
        System.out.println("method of child class by obj of child class");

        child.printChild();
        System.out.println("method of parent class by obj of child class");

        System.out.println("this proves that every child have access to use the fields and methods of a parent class");

        child.printParent();
    }
}
