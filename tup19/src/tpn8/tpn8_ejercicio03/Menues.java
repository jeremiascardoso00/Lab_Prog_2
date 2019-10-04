package tpn8_ejercicio03;
import java.util.Scanner;
public class Menues {

    public static void Menu(){

        Scanner p = new Scanner(System.in);
        
        int cantidad=0, decision=0,veloMoto=0, veloAuto=0, opcion=0, x=0;
        
        boolean opcion2 = true;

        System.out.println("cuantos vehiculos desea crear?");
        cantidad = p.nextInt();
       
        Vehiculo[] vehiculos = new Vehiculo[cantidad];
        do{
            System.out.println("ingrese la opcion que desea\n" +
                    "1: crear vehiculos\n" +
                    "2: listar vehiculos\n" +
                    "5: salir");
            opcion = p.nextInt();
            switch(opcion){
                case 1:

                    for (x=0; x<vehiculos.length; x++){
                    	
                    	System.out.println("¿Desea ingresar una moto:1 o un auto:2?");
                        decision = p.nextInt();
                        opcion2=true;
                        if (decision == 1){
                            System.out.println("ingrese la velocidad inicial de su motosaqui");
                            veloMoto = p.nextInt();
                            vehiculos[x] = new Moto(veloMoto);
                            do{
                            	 System.out.println("elija una opcion:\n 1: acelerar\n 2: frenar\n 3: mostrar numero de plazas\n 4: mostrar velocidad\n 5: terminar");
                                 decision=p.nextInt();
                                 if (decision==1){
                                 	System.out.println("ingrese cuanto quiere acelerar");
                                 	int acelerar= p.nextInt();
                                 	vehiculos[x].ACELERAR(acelerar);
                                 	
                                 }else if(decision == 2){
   
                                 	vehiculos[x].FRENAR();
                                 	
                                 }else if(decision == 3){
                                 	vehiculos[x].PLAZAS();
                                 	
                                 }else if(decision == 4){
                                  	System.out.println("su velocidad es: "+vehiculos[x].getVelocidad());
                                 	
                                 }else if(decision == 5){
                                 	System.out.println("salir");
                                	
                                 }else{
                                 	System.out.println("opcion incorrecta");
                                 }
                            }while(decision != 5);
                           
                        }else if (decision == 2){
                            System.out.println("ingrese la velocidad inicial de su nave");
                            veloAuto = p.nextInt();
                            vehiculos[x] = new Coche(veloAuto);
                            do{
                           	 System.out.println("elija una opcion:\n 1: acelerar\n 2: frenar\n 3: mostrar numero de plazas\n 4: mostrar velocidad\n 5: terminar");
                                decision=p.nextInt();
                                if (decision==1){
                                	System.out.println("ingrese cuanto quiere acelerar");
                                	int acelerar= p.nextInt();
                                	vehiculos[x].ACELERAR(acelerar);
                                }else if(decision == 2){
                                	
                                	vehiculos[x].FRENAR();
                                }else if(decision == 3){
                                	vehiculos[x].PLAZAS();
                                	
                                }else if(decision == 4){
                                  	System.out.println("su velocidad es: "+vehiculos[x].getVelocidad());
                                 	
                                }else if(decision == 5){
                                	System.out.println("salir");
                                	
                                }else{
                                	System.out.println("opcion incorrecta");
                                }
                           }while(decision != 5);
                        }else{
                            System.out.println("opcion incorrecta");
                            opcion2=false;
                        }
                    
                    }
                    break;
                    
                case 2:
                	
                    for (x=0; x<vehiculos.length; x++){
                        System.out.println(vehiculos[x].PLAZAS());
                        System.out.println(" la velocidad actual del vehiculo es: " + vehiculos[x].getVelocidad());
                    }
                    break;
                    
                case 5:
                    opcion2 = false;
                    break;
            }
        }while(opcion2 == true);
        

    }
}
