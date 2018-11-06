package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// pedir nota del 1 al 10
        //mostrarla como: insuficiente,suficiente, bien...

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la nota");

        int nota = sc.nextInt();
        String calif="";

        if (nota <= 5){
            calif ="INSUFICIENTE";
        }else{
            switch (nota){
                case 5: calif = "SUFICIENTE";
                break;
                case 6: calif =  "BIEN";
                break;
                case 7: calif = "NOTABLE";
                break;
                case 8: calif = "NOTABLE";
                break;
                case 9: calif = "SOBRESALIENTE";
                break;
                case 10: calif = "SOBRESALIENTE";
                break;
            }

        }
        System.out.println("La nota es:" + calif);
        sc.close();




    }
}
