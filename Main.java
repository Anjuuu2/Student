

package main;


public class Main {

    
    public static void main(String[] args) {
       Student student = new Student("Angelo Cabana", "IT21C", "Wew");
        
        System.out.println("Name: " +student.getName());
        System.out.println("Section: " + student.getSection());
        System.out.println("Motto: " + student.getMotto());
    }
    
}
