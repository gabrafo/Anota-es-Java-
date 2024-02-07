package Vetores.exercicios.ex8.entities;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static String older(Person[] vet){ // Opera um conjunto de pessoas e não uma instância específica, por isso é estático e não instanciado
        int olderAge = vet[0].getAge();
        String olderName = vet[0].getName();
        for(int i = 1; i<vet.length; i++){
            if(vet[i].getAge()>olderAge){
                olderAge = vet[i].getAge();
                olderName = vet[i].getName();
            }
        }
        return olderName;
    }
}
