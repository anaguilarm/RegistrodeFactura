

package factura1;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Ana NOhemi Aguilar Martinez 2000316
 * Edwin Alfonso Mejia Concogua 2000259
 * @author Nohemi Aguilar
 */
public class Factura1 {
    public static int serie;
    public static int numero;
    public static String fecha;
    public static String nombre;
    public static String direccion;
    public static int nit;
    public static Scanner sc = new Scanner (System.in);
    public static List<facturaencabezado> Listencabezado = new ArrayList();

    public static void main(String[] args) {
       int opcion;
       
       do{
           System.out.println("============================================================");
           System.out.println("=Bienvenido a nuestro registro de facturacion=");
           System.out.println("=Seleccionar la siguiente opcion para completar la factura= ");
           System.out.println("============================================================");
           System.out.println("Opcion 1 = Grabar datos");
           System.out.println("Opcion 2 = Mostar datos");
           System.out.println("Opcion 3 = Salir");
           System.out.println("=======================");
           opcion= sc.nextInt();
           
           switch (opcion){
               case 1:
                   GrabarDatos();
                   break;
               case 2:
                   MostrarDatos();
                   break;        
           }
       }while (3 != opcion);
    }
    public static void GrabarDatos ( ){
        System.out.println("Ingrese Serie");
        serie = sc.nextInt();
        System.out.println("Ingrese Numero");
        numero= sc.nextInt();
        System.out.println("Ingrese Fecha");
        fecha = sc.next();
        System.out.println("Ingrese Nombre");
        nombre = sc.next();
        System.out.println("Ingrese Direccion");
        direccion = sc.next();
        System.out.println("Ingrese Nit");
        nit = sc.nextInt();
        Listencabezado.add(new facturaencabezado(serie, numero, fecha, nombre,direccion, nit));
    }
    public static void MostrarDatos( ){
        System.out.println("Los datos son");
        System.out.println("===================================");
        System.out.println("Serie,  Numero,  Fecha,  Nombre,  Dirreccion,  Nit");
        int posicion = 0;
        for(facturaencabezado encabezado: Listencabezado){
            System.out.println(posicion+"\t"+encabezado.getSerie()+"\t"+encabezado.getNumero()+"\t"+encabezado.getFecha()+"\t"+encabezado.getNombre()+"\t"+ encabezado.getDireccion()+"\t"+encabezado.getNit());
            posicion ++;
        }
    }  
}


