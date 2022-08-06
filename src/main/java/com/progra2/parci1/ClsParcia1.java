/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.progra2.parci1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ClsParcia1 {
    
    private static String[][] comi = new String[7][11];
    private static final int Nombre=0;
    private static final int ENERO=1;
    private static final int FEBRERO=2;
    private static final int MARZO=3;
    private static final int ABRIL=4;
    private static final int TOTAL_VENTAS=5;
    private static final int VEINTE=6;
    private static final int TRINTA=7;
    private static final int VENTA_COMICION=8;
    private static final int QUITAR_ISR=9;
    private static final int LIQUIDO_A_RESIBIR=10;
    
    private static void IngresarDatoVendedor(int fila){
            
        comi[fila][Nombre]=("Nombre");             
        comi[fila][ENERO]=("ENERO");       
        comi[fila][FEBRERO]=("FEBRERO");
        comi[fila][MARZO]=("MARZO");
        comi[fila][ABRIL]=("ABRIL");
        comi[fila][TOTAL_VENTAS]=("Total");
        comi[fila][VEINTE]=("20%");
        comi[fila][TRINTA]=("35%");
        comi[fila][VENTA_COMICION]=("T.V.C.");
        comi[fila][QUITAR_ISR]=("ISR 5%");
        comi[fila][LIQUIDO_A_RESIBIR]=("Liquido");
        
        comi[fila+1][Nombre]=("Juan");             
        comi[fila+1][ENERO]=("649");       
        comi[fila+1][FEBRERO]=("400");
        comi[fila+1][MARZO]=("340");
        comi[fila+1][ABRIL]=("698");
        
        comi[fila+2][Nombre]=("Jesus");             
        comi[fila+2][ENERO]=("450");       
        comi[fila+2][FEBRERO]=("1230");
        comi[fila+2][MARZO]=("168");
        comi[fila+2][ABRIL]=("397");
        
        comi[fila+3][Nombre]=("Samu");             
        comi[fila+3][ENERO]=("756");       
        comi[fila+3][FEBRERO]=("369");
        comi[fila+3][MARZO]=("432");
        comi[fila+3][ABRIL]=("250");
        
        comi[fila+4][Nombre]=("Andrew");             
        comi[fila+4][ENERO]=("245");       
        comi[fila+4][FEBRERO]=("1450");
        comi[fila+4][MARZO]=("328");
        comi[fila+4][ABRIL]=("1139");
        
        comi[fila+5][Nombre]=("Marco");             
        comi[fila+5][ENERO]=("540");       
        comi[fila+5][FEBRERO]=("660");
        comi[fila+5][MARZO]=("500");
        comi[fila+5][ABRIL]=("245");
        
        comi[fila+6][Nombre]=("Total");    
    }
    
    public static void Datos(){
        int i=0;
            IngresarDatoVendedor(i);      
    }
    
    
    public static void sumasFilas(){
        
          for (int i=1; i<6; i++){
            int suma=0;          
                suma=Integer.valueOf(comi[i][1]);          
          suma= suma + Integer.valueOf(comi[i][2]);             
          suma= suma + Integer.valueOf(comi[i][3]);                    
          suma= suma + Integer.valueOf(comi[i][4]);

            comi[i][5]=suma+"";
          }
       }
    
    public static void Comicion20(){
          for (int i=1; i<6; i++){
            int suma,comision=0;
                suma=Integer.valueOf(comi[i][5]);     
                
                if(suma<2000){
                  comision = (suma*20)/100;
                  comi[i][6]=comision+"";
                  comi[i][7]=0+"";
                }
                
                if(suma>2000){
                   comision = (suma*35)/100;
                   comi[i][7]=comision+"";
                   comi[i][6]=0+"";
                }
 
          }
       }
    
    
    
    public static void TotalVentaComicion(){
        
          for (int i=1; i<6; i++){
            int suma=0;          
                suma=Integer.valueOf(comi[i][5]);          
          suma= suma + Integer.valueOf(comi[i][6]);             
          suma= suma + Integer.valueOf(comi[i][7]);                    

            comi[i][8]=suma+"";
          }
       }
    
    public static void Quitar_ISR5(){
          for (int i=1; i<6; i++){
            int suma,comision=0;
                suma=Integer.valueOf(comi[i][8]);
                
          comision = (suma*5)/100;
            comi[i][9]=comision+"";
          }
       }
    
    public static void Liquido(){
        
          for (int i=1; i<6; i++){
            int liquid=0;          
                liquid=Integer.valueOf(comi[i][8]);          
          liquid= liquid - Integer.valueOf(comi[i][9]);             
                              

            comi[i][10]=liquid+"";
          }
       }
    
    public static void SumasColumnas(){
        
          for (int i=1; i<11; i++){
            int suma=0;          
                suma=Integer.valueOf(comi[1][i]);          
          suma= suma + Integer.valueOf(comi[2][i]);             
          suma= suma + Integer.valueOf(comi[3][i]);                    
          suma= suma + Integer.valueOf(comi[4][i]);
          suma= suma + Integer.valueOf(comi[5][i]);

            comi[6][i]=suma+"";
          }
       }
         

    public static void imprimirDecorado(){
        for(int x=0;x< comi.length;x++){
            System.out.print("");
            for (int y=0; y<comi[x].length;y++){
                System.out.print(comi[x][y]);
                if(y!= comi[x].length-1){
                    System.out.print("\t");
                }
            }
            System.out.println("");
        }
    }
    
    public static void Numeromayor(){
        String Nombre = "";
        int max=0;
        int Mayor1,Mayor2,Mayor3,Mayor4,Mayor5 =0; 
        
          for (int i=1; i<5; i++){
                Mayor1=Integer.valueOf(comi[1][10]);     
                Mayor2=Integer.valueOf(comi[2][10]);
                Mayor3=Integer.valueOf(comi[3][10]);     
                Mayor4=Integer.valueOf(comi[4][10]);
                Mayor5=Integer.valueOf(comi[5][10]);
          if (Mayor1>max){
              max=Mayor1;
          }else if (Mayor2>max){
              max=Mayor2;
          }else if (Mayor3>max){
              max=Mayor3;
          }else if (Mayor4>max){
              max=Mayor4;
          }else if (Mayor5>max){
              max=Mayor5;
          }   
          //Nombre
          if (Mayor1==max){
              Nombre=(comi[1][0]);
          }else if (Mayor2==max){
              Nombre=(comi[2][0]);
          }else if (Mayor3==max){
              Nombre=(comi[3][0]);
          }else if (Mayor4==max){
              Nombre=(comi[4][0]);
          }else if (Mayor5==max){
              Nombre=(comi[5][0]);
          } 
         }
          
    System.out.println("\nEl vendedor que mas vendio es: "+Nombre+" y vendio: "+max);
       }
    
    public static void Numeromenor(){
        String Nombre="";
        int min=0;
        int Menor1,Menor2,Menor3,Menor4,Menor5 =0; 
        
          for (int i=1; i<5; i++){
                Menor1=Integer.valueOf(comi[1][10]);     
                Menor2=Integer.valueOf(comi[2][10]);
                Menor3=Integer.valueOf(comi[3][10]);     
                Menor4=Integer.valueOf(comi[4][10]);
                Menor5=Integer.valueOf(comi[5][10]);
          if(min<Menor1){
              min=Menor1;
          } else if (Menor1<min){
              min=Menor1;
          }else if (Menor2<min){
              min=Menor2;
          }else if (Menor3<min){
              min=Menor3;
          }else if (Menor4<min){
              min=Menor4;
          }else if (Menor5<min){
              min=Menor5;
          }   
          //Nombre
          if (Menor1==min){
              Nombre=(comi[1][0]);
          }else if (Menor2==min){
              Nombre=(comi[2][0]);
          }else if (Menor3==min){
              Nombre=(comi[3][0]);
          }else if (Menor4==min){
              Nombre=(comi[4][0]);
          }else if (Menor5==min){
              Nombre=(comi[5][0]);
          }
         }
    System.out.println("\nEl vendedor que menos vendio es: "+Nombre+" y vendio: "+min);
       }
    
    public static void Menu(){
        
        Scanner dat = new Scanner(System.in);
        int opcion=0;
        System.out.println("Seleciona una opcion: \n"
                + "1--Desplegar Matriz\n"
                + "2--El que vendio mas\n"
                + "3--El que vendio menos");
        System.out.println("\nIngrese el numero de fila");
        opcion=dat.nextInt();
        
        
        switch(opcion){
            case 1:
                Datos();
                sumasFilas();
                Comicion20();
                TotalVentaComicion();
                Quitar_ISR5();
                Liquido();
                SumasColumnas();
                imprimirDecorado();
                
                break;
            case 2:
                Datos();
                sumasFilas();
                Comicion20();
                TotalVentaComicion();
                Quitar_ISR5();
                Liquido();
                Numeromayor();
                break;
            case 3:
                Datos();
                sumasFilas();
                Comicion20();
                TotalVentaComicion();
                Quitar_ISR5();
                Liquido();
                Numeromenor();
                break;
            
    }
    
        }
 
}


