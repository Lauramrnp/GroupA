package ais;
import javax.swing.*;


public class AIS {
    public static double s,m,d,r;
    public static double n1 = 0, n2 = 0;
    public static String op, num1,num2;
    public static int operacion=0;

    public  boolean isNum(String n){//metodo para validar si se ha ingresado un numero, recibe una cadena de texto
        try{  
            double a = Double.parseDouble(n); //se convierte la cadena      
            return true; //si se ha convertido a entero devuelve verdadero
        } 
        catch(NumberFormatException e){ 
            return false; //si no se ha convertido a entero devuelve falso
        }
    } 
public void pruebaOperandos(){
                    num1=(JOptionPane.showInputDialog("Ingrese numero 1"));
                        while (!isNum(num1)){
                            JOptionPane.showMessageDialog(null,"Operando 1 no es un número.");
                            num1=(JOptionPane.showInputDialog("Ingrese numero 1"));
                        }
                        if (isNum(num1)){
                        n1 = Double.parseDouble(num1);}
                        num2=(JOptionPane.showInputDialog("Ingrese numero 2"));
                        while (!isNum(num2)){
                            JOptionPane.showMessageDialog(null,"Operando 2 no es un número");
                            num2=(JOptionPane.showInputDialog("Ingrese numero 2"));
                        }
                    if (isNum(num2)){
                        n2 = Double.parseDouble(num2);
                        }               
    }

        

    public static void main(String []agrs)
    {
        AIS nuevo = new AIS();

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
                    operacion = Integer.parseInt(op);//n1 toma el valor convertido del anterior cuadro de dialogo
                    if(operacion>5){
                         JOptionPane.showMessageDialog(null, "Ponga un número del 1 al 5");
                    }
            }else{
                JOptionPane.showMessageDialog(null, "Ponga un número del 1 al 5");
                
            }
           
            
            switch(operacion)
            {
                case 1:
                    nuevo.pruebaOperandos();
                    if (nuevo.isNum(num1) && (nuevo.isNum(num2))){
                            s = n1 + n2;
                            JOptionPane.showMessageDialog(null,"La suma es:"+s);
                        } else {
                             JOptionPane.showMessageDialog(null,"Ingrese solo números");
                        }
                    
                    
                    break;
        
                case 2:
                    nuevo.pruebaOperandos();
                    if (nuevo.isNum(num1) && (nuevo.isNum(num2))){
                            r=n1-n2;
                            JOptionPane.showMessageDialog(null,"La resta es:"+r);
                     } else {
                             JOptionPane.showMessageDialog(null,"Ingrese solo números");
                        }

                    break;
                case 3:
                    nuevo.pruebaOperandos();
                    if (nuevo.isNum(num1) && (nuevo.isNum(num2))){
                            m=n1*n2;
                            JOptionPane.showMessageDialog(null,"La multiplicacion es:"+m);
                     } else {
                             JOptionPane.showMessageDialog(null,"Ingrese solo números");
                        }
                    break;
                case 4:
                    nuevo.pruebaOperandos();
                    if (nuevo.isNum(num1) && (nuevo.isNum(num2))){
                            d=n1/n2;
                            JOptionPane.showMessageDialog(null,"La division es:"+d);
                     } else {
                             JOptionPane.showMessageDialog(null,"Ingrese solo números");
                        }
                    break;                
                default: 
                   
                    break;
                     
            }
        
         }while(operacion!=5);
    }


    }
