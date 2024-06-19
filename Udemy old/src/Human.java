public class Human {
    
    String name;
    int age, heightininches;
    String eyecolour;

    public Human(String name, int age, int heightininches, String eyecolour) {
        this.name = name;
        this.age = age;
        this.heightininches = heightininches;
        this.eyecolour = eyecolour;
    }

    public void speak(){
        System.out.println("My name is "+ name);
        System.out.println("I'm " +age+ " years old");
        System.out.println("My height in cm is "+ heightininches);
        System.out.println("My eyecolour is "+ eyecolour);
    }
    public void eat(){
        System.out.println("eating..");
    }
    public void walk(){
        System.out.println("walking..");
        
    }
    public void work(){
        System.out.println("working..");
    }
}
