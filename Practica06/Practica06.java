/**
 *@author Gil Axel Gutierrez Lara
 *@version 1.0
 **/
public class Practica06{
    /**
     *Metodo que suma dos unidades enteras a la copia de un valor fijo
     *
     *@param x El parametro que representa valor fijo
     **/
    public static void sumaDos(int x){
	x=x+2;
	System.out.println(x);
    }
    /**
     *Metodo que suma dos unidades enteras a la referencia de un valor fijo
     *
     *@param x El parametro que representa valor fijo en la memoria
     **/
    public static void sumaDos(int[] y){
	y[0]=y[0]+2;
	System.out.println(y[0]);
    }
     /**
     *Metodo que devuelve la suma de un valor dado mas dos unidades
     *
     *@param x El parametro que representa valor fijo en la memoria
     **/
    public static int sumaDosZ(int z){
	return z=z+2;       
    }

    /**
     *Metodo principal donde usaremos la clase Practica06
     *
     *@param args Los argumentos
     **/
    //PPV
    public static void main(String[] args){
	int x=2;
	System.out.println("Paso de parametros por valor");
	System.out.println("Valor inicial de x:   "+x);
	sumaDos(x);
	System.out.println("Valor de x luego de aplicar la funcion sumaDos: "+x);
	
    
    //PPR
	System.out.println("Paso de parametros por referencia");
	int[] y= new int[1];
	y[0]=x;
	System.out.println("Valor inicial de x:  "+ x);
	sumaDos(y);
	x=y[0];
	System.out.println("Valor de x luego de aplicar la funcion sumarDos : "+x);
	//PPV(Cambio de valor)
	System.out.println("Paso de parametros por valor -Cambio de valor-");
	int z = 5;
	System.out.println("Valor inicial de z:  "+z);
	sumaDosZ(z);
	System.out.println("Valor de z luego de aplicar la funcion sumaDosZ:  "+ sumaDosZ(z));
	
	
    }
}
