package exercicios.ex3.entities;

public class Student {
    public String name;
    public double grade;
    public double total = 0;

    public void sumGrade(){
        total+=grade;
    }

    public void finalGrade(){
        System.out.printf("FINAL GRADE = %.2f\n", total);
        if(total>=60){
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS", Math.abs(total-60));
        }
    }
}
