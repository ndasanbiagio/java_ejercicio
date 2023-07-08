public class Main {
    public static int sumando(int a, int b, int c){
        System.out.println(a+b+c);
        return a + b + c;
    }

    public static void main(String[] args) {
        int param1 = 10;
        int param2 = 20;
        int param3 = 30;

        //Cree mi variable miCoche de tipo coche
        coche miCoche = new coche();
        System.out.println(miCoche.puertas);
        miCoche.incrementadorPuertas();
        miCoche.incrementadorPuertas();
        miCoche.incrementadorPuertas();
        System.out.println(miCoche.puertas);

        int suma = param1 + param2 + param3;
        System.out.println(suma);
        sumando(param1,param2,param3);

    }
}

// Primera parte:

// Crear una función con tres parámetros que sean números que se suman entre sí.

// Llamar a la función en el main y darle valores.Segunda parte:

// Crear una clase coche.

// Dentro de la clase coche, una variable numérica que almacene el número de
// puertas que tiene.

// Una función que incremente el número de puertas que tiene el coche.

// Crear un objeto miCoche en el main y añadirle una puerta.

// Mostrar el número de puertas que tiene el objeto.