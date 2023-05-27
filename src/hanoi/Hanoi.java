package hanoi;

import java.util.Scanner;
import java.util.Stack;

public class Hanoi {

 /*
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese la cantidad de discos: ");
            int n = scanner.nextInt();
            TorresDeHanoi(n);
        }

        public static void TorresDeHanoi(int n) {
            Stack<Integer> torreA = new Stack<>();
            Stack<Integer> torreB = new Stack<>();
            Stack<Integer> torreC = new Stack<>();

            // Agregamos los discos a la torre A
            for (int i = n; i > 0; i--) {
                torreA.push(i);
            }

            // Imprimimos el estado inicial de las torres
            System.out.println("Estado inicial:");
            imprimirTorres(torreA, torreB, torreC);

            // Llamamos a la función recursiva para resolver el problema
            moverDiscos(n, torreA, torreB, torreC);

            // Imprimimos el estado final de las torres
            System.out.println("Estado final:");
            imprimirTorres(torreA, torreB, torreC);
        }

        public static void moverDiscos(int n, Stack<Integer> torreA, Stack<Integer> torreB, Stack<Integer> torreC) {
            if (n == 1) {
                // Movemos el disco de la torre A a la torre C
                int disco = torreA.pop();
                torreC.push(disco);
                System.out.println("Moviendo disco " + disco + " de la torre A a la torre C");
                imprimirTorres(torreA, torreB, torreC);
            } else {
                // Resolvemos el problema para n-1 discos, moviendo de A a B usando C como auxiliar
                moverDiscos(n - 1, torreA, torreC, torreB);
                // Movemos el disco más grande de A a C
                int disco = torreA.pop();
                torreC.push(disco);
                System.out.println("Moviendo disco " + disco + " de la torre A a la torre C");
                imprimirTorres(torreA, torreB, torreC);
                // Resolvemos el problema para n-1 discos, moviendo de B a C usando A como auxiliar
                moverDiscos(n - 1, torreB, torreA, torreC);
            }
        }

        public static void imprimirTorres(Stack<Integer> torreA, Stack<Integer> torreB, Stack<Integer> torreC) {
            System.out.println("Torre A: " + torreA);
            System.out.println("Torre B: " + torreB);
            System.out.println("Torre C: " + torreC);
            System.out.println();
        }
    }
*/
    
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese la cantidad de discos: ");
    int n = scanner.nextInt();
    TorresDeHanoi(n);
}

public static void TorresDeHanoi(int n) {
    Stack<Integer> torreA = new Stack<>();
    Stack<Integer> torreB = new Stack<>();
    Stack<Integer> torreC = new Stack<>();

    // Agregamos los discos a la torre A
    for (int i = n; i > 0; i--) {
        torreA.push(i);
    }

    // Imprimimos el estado inicial de las torres
    System.out.println("Estado inicial:");
    imprimirTorres(torreA, torreB, torreC);

    // Llamamos a la función recursiva para resolver el problema
    moverDiscos(n, torreA, torreB, torreC);

    // Imprimimos el estado final de las torres
    System.out.println("Estado final:");
    imprimirTorres(torreA, torreB, torreC);
}

public static void moverDiscos(int n, Stack<Integer> torreA, Stack<Integer> torreB, Stack<Integer> torreC) {
    if (n == 1) {
        // Movemos el disco de la torre A a la torre C
        int disco = torreA.pop();
        torreC.push(disco);
        System.out.println("Moviendo disco " + disco + " de la torre A a la torre C");
        imprimirTorres(torreA, torreB, torreC);
    } else {
        // Resolvemos el problema para n-1 discos, moviendo de A a B usando C como auxiliar
        moverDiscos(n - 1, torreA, torreC, torreB);
        // Movemos el disco más grande de A a C
        int disco = torreA.pop();
        torreC.push(disco);
        System.out.println("Moviendo disco " + disco + " de la torre A a la torre C");
        imprimirTorres(torreA, torreB, torreC);
        // Resolvemos el problema para n-1 discos, moviendo de B a C usando A como auxiliar
        moverDiscos(n - 1, torreB, torreA, torreC);
    }
}

public static void imprimirTorres(Stack<Integer> torreA, Stack<Integer> torreB, Stack<Integer> torreC) {
    System.out.println("Torre A: " + torreA);
    System.out.println("Torre B: " + torreB);
    System.out.println("Torre C: " + torreC);
    System.out.println();
}
}
 
    