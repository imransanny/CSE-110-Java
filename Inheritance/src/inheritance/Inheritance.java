
package inheritance;


public class Inheritance {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    void display1(){
        System.out.println("Name=" +name);
        System.out.println("Age = "+age);
    }
    
}
