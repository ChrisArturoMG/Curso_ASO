import java.nio.file.spi.FileSystemProvider;

class Prueba1 {

    public int[] generarArreglo( int tamanio ){
        int arregloEnteros [] = new int[tamanio];
        for (int i = 0; i < arregloEnteros.length; i++) {
            arregloEnteros[i] = i;
        }
        return arregloEnteros;
    }

    public int[] incrementarValoresArreglo( int incremento, int[] arreglo ){
        int arregloIncremento [] = new int[arreglo.length]; 
        for (int i = 0; i < arreglo.length; i++) {
            arregloIncremento[i] = arreglo[i] + incremento;
        }
        return arregloIncremento;
    }

    public void imprimirArreglo(int [] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("valor de posicion " + i + " = " + arreglo[i]);
        }
    }

    public int suma(int [] arreglo){
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }
        return suma;
    }

    public int MaxValor(int [] arreglo){
        int valorMayor=-1;
        for (int i = 0; i < arreglo.length; i++) {
            if( valorMayor < arreglo[i]){
                valorMayor = arreglo[i];
            }
        }
        return valorMayor;
    }

    public int promValor(int [] arreglo){
        int promedio = this.suma(arreglo) / arreglo.length;
        return promedio;
    }

    public boolean metodoFinal(int suma, int maxValor, int promValor, String nombre){
        int resta = suma - maxValor;
        int multiplicacion =  suma * maxValor * promValor;

        System.out.println("Resta = " +  resta + " Multplicacion = " + multiplicacion);

        if(nombre == "Francisco Torres"){
            System.out.println("True");
            return true;
        }
        System.out.println("false");
        return false;
    }
    
    public static void main(String args []) {
        Prueba1 n1 = new Prueba1();

        System.out.println("Generacion arreglo...");
        int arregloGenerado[] = n1.generarArreglo(10);
        n1.imprimirArreglo(arregloGenerado);

        System.out.println("Incremento arreglo...");
        int arregloIncremento [] = n1.incrementarValoresArreglo(1, arregloGenerado);
        n1.imprimirArreglo(arregloIncremento);

        int valor_suma_arreglo = n1.suma(arregloIncremento);
        System.out.println("Sumar de arreglo a)  =  " + valor_suma_arreglo);
        
        int valor_maximo_arreglo  = n1.MaxValor(arregloIncremento);
        System.out.println("Valor mayor  =  " + valor_maximo_arreglo);

        int valor_promedio_arreglo =  n1.promValor(arregloIncremento);
        System.out.println("Valor promedio  =  " + valor_promedio_arreglo);

        n1.metodoFinal(valor_suma_arreglo, valor_maximo_arreglo, valor_promedio_arreglo, "Francisco Torres");

    }


    
}