import java.util.InputMismatchException;
import java.util.Scanner;
//import java.util.concurrent.ThreadLocalRandom;
 
public class App{
    
 
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        int i;
        int opcion; 
 
        
        while (!salir) {
 
            System.out.println("\nEscoja una opcion desde 1 al 15 para ver los ejericicios \n");
            try {
 
                System.out.println("Escribe una de las opciones ");
                opcion = scanner.nextInt();
 
                switch (opcion) {
                    case 1:{
                       
                        double numero1;
                        double numero2;
                    
                          System.out.println("Escribe dos números para obtener su resultado ");
                         
                                            System.out.print("Dame el valor del primer número: ");
                                            numero1 = scanner.nextDouble();
                         
                                            System.out.print("Dame el valor del segundo número: ");
                                            numero2 = scanner.nextDouble();

                          System.out.println("\nLa suma es " + (numero1 + numero2));
                          System.out.println("\nLa resta es " + (numero1 - numero2));
                          System.out.println("\nLa multiplicación es " + (numero1 * numero2));
                          System.out.println("\nLa división es " + (numero1 / numero2));
                    }break;

                    case 2:  
                                     
                        int numero;

                        System.out.printf( "Introduzca un número entero: " );
                        numero = scanner.nextInt();

                        if ( numero % 2 == 0 )
                            {System.out.printf( "ES PAR" );}

                            else
                            {System.out.printf( "ES IMPAR" ); }
                            break;

                    case 3:
                        int Radio;     
                        System.out.println("Ingresa el valor del radio: ");

                            Scanner radio = new Scanner(System.in);
                            Radio = radio.nextInt();

                                double Area = Math.PI * Math.pow(Radio, 2) ; 
                                System.out.println("El área del circulo es de " + Area);
                        break;
                    
                    case 4:
                        int edad;
                        System.out.println("Dime tu edad: ");
                        edad = scanner.nextInt();
                        
                            if (edad >= 18){
                                System.out.println("Mayor de edad");
                            }
                                else{
                                System.out.println("Menor de edad");
                                }
                        break;
                    
                    case 5:                      
                        int n1,n2;
                        System.out.print("Introduce un número: ");
                        n1=scanner.nextInt();
                        System.out.print("Introduce otro número: ");
                        n2=scanner.nextInt();
                    
                        if(n1==n2)
                        System.out.println("Son iguales");
                            
                        else
                        {
                            if(n1>n2)
                                System.out.println(n1 + " es mayor que " + n2);

                                else
                                    System.out.println(n2 + " es mayor que " + n1);
                        }
                        break;
                    
                    case 6:

                        System.out.println("Escribe un número:");
                        double nume = scanner.nextDouble();
                        
                            if (nume == 0) {
                                System.out.println("El número es neutro");
                                } else if (nume < 0) {
                                    System.out.println("El número es negativo");
                                } else {
                                    System.out.println("El número es positivo");
                                }
                        break;
                    
                    case 7:      
                    int n;
                   
                    System.out.print("Introduce un número entero: ");                                                         
                    n = scanner.nextInt();
                    
                        System.out.println("Tabla del " + n);
                        for(i = 1; i<=10; i++){
                            System.out.println(n + " * " + i + " = " + n*i);                                                     
                        }
                    break;

                    case 8:
                       
                    int numeroAleatorio;
                    int intento;
                    int contador = 5;

                    numeroAleatorio = (int) (Math.random()*100+1);
                    System.out.println("Intenta adivinar un número aleatorio entre el 1 y 100. " + "Tienes 5 intentos.");
                    System.out.println(numeroAleatorio);

                    do {
                      System.out.println("Número contador: " + contador);
                      System.out.print("Introduce el número que creas posible: ");
                      intento = scanner.nextInt();
                     
                       if (intento > numeroAleatorio) {
                        System.out.println("El número que buscas es menor, te quedan " + (contador-1) + " intentos: ");
                      } 
                            else if (intento < numeroAleatorio){
                            System.out.println("El número que buscas es mayor, te quedan " + (contador-1) + " intentos: ");
                      } 
                            else {
                            System.out.print("¡CORRECTO! "+ numeroAleatorio + " era el número que estabas "
                            + "buscando, has necesitado " + (10 - (contador-1)) +" intentos.");
                      }
                      contador--;
                    } 
                    
                    while (intento != numeroAleatorio && contador > 0);
                    if (contador == 0) {
                    System.out.println("Has perdido. El numero aleatorio era " + numeroAleatorio);
                    }
                    break;
                    
                    case 9:

                    double factorial;
                    int num;

                    System.out.print("Introduce un número: ");
                    num=scanner.nextInt();
                    factorial=1; 

                    for (i=num;i>0;i--)

                        {factorial=factorial*i;}

                    System.out.println("El factorial de " + num + " es: " + factorial);
                    break;

                    case 10:
                    
                        int a = 0, b = 1, c, t;
       
                        System.out.print("Por favor ingrese cantidad de elementos para la serie: ");
                        t = scanner.nextInt();
                   
                        for (i = 0; i < t; i++) {
                            System.out.println(a);
                            c = a + b;
                            a = b;
                            b = c;
                        }
                        break;

                    case 11:{
                          
                        double lado1, lado2, lado3, area,s;

                        System.out.println("ingresa el primer lado del triangulo");
                        lado1 = scanner.nextDouble();
         
                        System.out.println("ingresa el segundo lado del triangulo");
                        lado2 = scanner.nextDouble();
         
                        System.out.println("ingresa el tercer lado del triangulo");
                        lado3 = scanner.nextDouble();
         
                        s = (lado1 + lado2 + lado3)/2;
                        area = (Math.sqrt(s*(s-lado1) * (s-lado2) * (s-lado3)));
         
                        System.out.println("EL area del triangulo es de: "+ area);
                        
                    }break;

                    case 12:  
                    {
                    int d = 0,numeroa;
                    System.out.println("Ingrese numero");
                    numeroa=scanner.nextInt();
                    for(i=1;i<(numeroa+1);i++){
                    if(numeroa%i==0){
                        d++;
                       }
                    }
                    
                    if(d!=2){
                       System.out.println("No es Primo");
                       }
                       
                        else{
                        System.out.println("Si es Primo");
                        }    
                    }
                    break;

                    case 13:
                        
                        float valor;
                        System.out.println("Ingrese el valor decimal");
                        valor = scanner.nextFloat();

                        System.out.println("Parte entera:  " + (int) valor);

                    break;
                    
                    case 14:
                    {
                    int suma = 0, numer;
                    System.out.println("Introduce un número: ");
                    numer = scanner.nextInt();
                    for (i = 1; i < numer; i++) 
                    {                     
                       if (numer % i == 0) 
                    {
                        suma = suma + i;   
                    }
                    }
                        if (suma == numer) 
                        {                        
                            System.out.println("Perfecto");
                        } else {
                            System.out.println("No es perfecto");
                
                        }
                    }
                    break;
                    
                    case 15:                      
                        
                    int U, aux, inverso = 0, cifra;
                    do  
                    {
                        System.out.print("Introduce un número de dos cifras: ");                                                 
                        U = scanner.nextInt();
                    } while (U < 10);
                   
                    aux = U;

                    while (aux!=0){
                          cifra = aux % 10;
                          inverso = inverso * 10 + cifra;
                          aux = aux / 10;
                          }

                    if(U == inverso){
                        System.out.println("Es capicua");
                        }
                        
                        else{
                        System.out.println("No Es Capicua");
                        }
                    break;

                    case 16:
                        salir = true;
                    break;
                        
                }
                
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                scanner.next();
            }
        }
 
    } 
}
