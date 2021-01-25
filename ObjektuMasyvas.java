package javaapplication37;

public class JavaApplication37 {

    public static void main(String[] args) {
        Student[] arr; //deklaruojam masyva
        arr = new Student[5]; //atmintis 5 objektams
        arr[0] = new Student(1, "Alan");
        arr[1] = new Student(2, "Tom");
        arr[2] = new Student(3, "Ana");
        arr[3] = new Student(4, "Kate");
        arr[4] = new Student(5, "Suzan");
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].pozicijosNumeris + arr[i].studentoVardas);
        }
    }
    
}

// https://www.geeksforgeeks.org/arrays-in-java/
