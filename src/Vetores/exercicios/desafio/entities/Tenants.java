package Vetores.exercicios.desafio.entities;

public class Tenants {
    private String name;
    private String email;
    private int roomNumber;

    public Tenants(String name, String email, int roomNumber) {
        this.name = name;
        this.email = email;
        this.roomNumber = roomNumber;
    }

    public static void selectionSort(Tenants[] renter) {
        // Variável para armazenar a posição do menor elemento durante a iteração interna
        int posMenor;

        // Variável auxiliar para facilitar a troca de elementos
        Tenants aux;

        // Itera sobre o array (menos o último elemento)
        for (int i = 0; i < renter.length - 1; i++) {
            // Inicializa a posição do menor elemento como a posição atual
            posMenor = i;

            // Itera sobre os elementos à direita do elemento atual
            for (int j = i + 1; j < renter.length; j++) {
                // Verifica se o quarto na posição "i" é maior que o quarto na posição "j"
                if (renter[i].roomNumber > renter[j].roomNumber) {
                    // Se verdadeiro, atualiza a posição do menor elemento para "j"
                    posMenor = j;
                }
            }

            // Troca os elementos de posição após encontrar o menor elemento
            aux = renter[i];
            renter[i] = renter[posMenor];
            renter[posMenor] = aux;
        }
    }

    public String toString() {
        return roomNumber + ": " +
                name + ", " +
                email;

    }
}
