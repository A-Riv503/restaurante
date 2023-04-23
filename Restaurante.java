/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ariel
 */
import java.util.Scanner;
public class Restaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner lector=new Scanner(System.in);
        int personas=0; 
        double precioSuma=0, propina=0, precioF=0;
        String afirmacion;
        System.out.println("entradas: ensalada:$4.00, papitas:$2.00, aros de cebolla:$2.00, choripanes:5.00 ");
        System.out.println("plato fuerte: Puyazo:$8.00, Pollo:$7.00, Paella:$10.00");
        System.out.println("bebidas: agua:$1.00, soda:$2.00, refresco:$3.50, cerveza:5.00 ");
        System.out.println("postres: tres leches:$4.00, flan:$2.00, donas:$1.50");
        
        System.out.println("cantidad de personas a comer");
        personas=lector.nextInt();
        lector.nextLine();
        
        String nombres[]=new String[personas];
        String entrada[]=new String[personas];
        String platoFuerte[]=new String[personas];
        String bebida[]=new String[personas];
        String postre[]=new String[personas];
        
        double precioEntrada[]=new double[personas];
        double precioPlatoFuerte[]=new double[personas];
        double precioBebida[]=new double[personas];
        double precioPostre[]=new double[personas];
        double precioTotal[]=new double[personas];
        
        for(int i=0; i<personas ; i++){
           System.out.println("ingrese el nombre de la persona");
           nombres[i]=lector.nextLine();
           System.out.println("que entrada quiere el cliente "+nombres[i]);
           entrada[i]=lector.nextLine();
           System.out.println("que plato fuerte quiere el cliente "+nombres[i]);
           platoFuerte[i]=lector.nextLine();
           System.out.println("que bebida quiere el cliente "+nombres[i]);
           bebida[i]=lector.nextLine();
           System.out.println("que postre quiere el cliente "+nombres[i]);
           postre[i]=lector.nextLine();
           
           switch(entrada[i]){
               case "ensalada":
               precioEntrada[i]=4;
               break;
               case "papitas":
               precioEntrada[i]=2;
               break;
               case "aros de cebolla":
               precioEntrada[i]=2;
               break;
               case "choripanes":
               precioEntrada[i]=5;
               break;
           }
           
            switch(platoFuerte[i]){
               case "puyazo":
               precioPlatoFuerte[i]=8;
               break;
               case "pollo":
               precioPlatoFuerte[i]=7;
               break;
               case "paella":
               precioPlatoFuerte[i]=10;
               break;
           }
            
           switch(bebida[i]){
               case "agua":
               precioBebida[i]=1;
               break;
               case "soda":
               precioBebida[i]=2;
               break;
               case "refresco":
               precioBebida[i]=3.50;
               break;
               case "cerveza":
               precioBebida[i]=5;
               break;
           }
           
           switch(postre[i]){
               case "tres leches":
               precioPostre[i]=4;
               break;
               case "flan":
               precioPostre[i]=2;
               break;
               case "donas":
               precioPostre[i]=1.50;
               break;
            }
            
           precioTotal[i]=precioEntrada[i]+precioPlatoFuerte[i]+precioBebida[i]+precioPostre[i];
           precioSuma+=precioTotal[i];
          
           
           
        }
        
        System.out.println("¿Quiere agregar propina? y o n");
        afirmacion=lector.next();
        
       
        
        for(int i=0; i<personas; i++){
        System.out.println("nombre del cliente: "+nombres[i]+" entrada: "+entrada[i]+" Plato Fuerte: "+platoFuerte[i]+
        " bebida "+bebida[i]+" postre "+postre[i]+" su total es de: "+precioTotal[i]);
       }
         
        switch(afirmacion){
            case "y":
            propina=precioSuma*0.15;
            precioF=precioSuma+propina;
            System.out.println("su precio total con propina es de: "+precioF);
            break;
            case "n":
            System.out.println("su precio total sin propina es de "+precioSuma);
            break;
        }
        
       
    }
    
}
