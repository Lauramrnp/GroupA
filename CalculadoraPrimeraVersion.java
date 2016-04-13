/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraais;
import javax.swing.*;
/**
 *
 * @author JESUS
 */
public class AISCalcu {

 
        public boolean isNum(String n){//metodo para validar si se ha ingresado un numero, recibe una cadena de texto
        int a;//variable que almacena la cadena a convertir
        try{  
            a = Integer.parseInt(n); //se convierte la cadena      
            return true; //si se ha convertido a entero devuelve verdadero
        } 
        catch(NumberFormatException e){ 
            return false; //si no se ha convertido a entero devuelve falso
        }
        }
     public static void main(String []agrs)
    {
        CalculadoraAIS nuevo = new CalculadoraAIS();
        double n1,n2,s,m,d,r;
        String op="";
        String num1,num2;
        int op2=0;
        do{
            op = JOptionPane.showInputDialog("\nCalculadora\n"+
            "************\n"+
            "[1] SUMAR\n"+
            "[2] RESTAR\n"+
            "[3] MULTIPLICAR\n"+
            "[4] DIVIDIR\n"+
            "[5] SALIR\n"+
            "Ingresa una opcion:");
            if(nuevo.isNum(op)){//primera validacion
                    op2 = Integer.parseInt(op);//n1 toma el valor convertido del anterior cuadro de dialogo
                    if(op2>5){
                         JOptionPane.showMessageDialog(null, "Ponga un número del 1 al 5");
                    }
            }else{
                JOptionPane.showMessageDialog(null, "Ponga un número del 1 al 5");
                
            }
           
            
            switch(op2)
            {
                case 1:
                    num1=(JOptionPane.showInputDialog("Ingrese numero 1"));
                    num2=(JOptionPane.showInputDialog("Ingrese numero 2"));
                    if (nuevo.isNum(num1)){
                        n1 = Double.parseDouble(num1);
                        if (nuevo.isNum(num2)){
                            n2=Double.parseDouble(num2);
                            s = n1 + n2;
                            JOptionPane.showMessageDialog(null,"La suma es:"+s);
                        } else {
                             JOptionPane.showMessageDialog(null,"Ingrese un numero");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null,"Ingrese un numero");
                    }
                    break;
                case 2:
                    num1=(JOptionPane.showInputDialog("Ingrese numero 1"));
                    num2=(JOptionPane.showInputDialog("Ingrese numero 2"));
                    if (nuevo.isNum(num1)){
                        n1 = Double.parseDouble(num1);
                        if (nuevo.isNum(num2)){
                            n2=Double.parseDouble(num2);
                            r=n1-n2;
                            JOptionPane.showMessageDialog(null,"La resta es:"+r);
                     } else {
                             JOptionPane.showMessageDialog(null,"Ingrese un numero");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null,"Ingrese un numero");
                    }
                    break;
                case 3:
                    num1=(JOptionPane.showInputDialog("Ingrese numero 1"));
                    num2=(JOptionPane.showInputDialog("Ingrese numero 2"));
                    if (nuevo.isNum(num1)){
                        n1 = Double.parseDouble(num1);
                        if (nuevo.isNum(num2)){
                            n2=Double.parseDouble(num2);
                            m=n1*n2;
                            JOptionPane.showMessageDialog(null,"La multiplicacion es:"+m);
                    } else {
                             JOptionPane.showMessageDialog(null,"Ingrese un numero");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null,"Ingrese un numero");
                    }
                    break;
                case 4:
                    num1=(JOptionPane.showInputDialog("Ingrese numero 1"));
                    num2=(JOptionPane.showInputDialog("Ingrese numero 2"));
                    if (nuevo.isNum(num1)){
                        n1 = Double.parseDouble(num1);
                        if (nuevo.isNum(num2)){
                            n2=Double.parseDouble(num2);
                            d=n1/n2;
                            JOptionPane.showMessageDialog(null,"La division es:"+d);
                        } else {
                             JOptionPane.showMessageDialog(null,"Ingrese un numero");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null,"Ingrese un numero");
                    }
                    break;
                
                default: 
                   
                    break;
                     
            }
        
         }while(op2!=5);
    }


    }
