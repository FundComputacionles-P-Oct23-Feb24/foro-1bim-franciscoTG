
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.miniespecificacion;
import java.util.Scanner;
/**
 *
 * @author ft110
 */
public class Miniespecificacion {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Problema 

Elaborar una miespecificación que permita leer los datos de 5 
aspirantes para ingresar a un trabajo: 
pide ingresar: 
nombre del aspirante, apellido del aspirante
promedio bachiller que equivale 40% de la nota total 
la nota de la prueba de ingreso que equivale el 60% de la nota total 
Imprimir si es aceptado, si tiene una nota total entre 8-10 
En caso de no ser así imprimir rechazado 
1.  Inicio
2.  nombre,x(20)[BS,{a-z},{A-Z}]
3   apellido,x(20)[BS,{a-z},{A-Z}]
4.  promedio_bachiller,d[0-10]
5.  nota_prueba,d[0-10]
6.  nota_total,d[0-10]
7.  contador,i[0-n]<--1  
8.  Mientras contador <= 5 entonces
9.    <<"Ingrese el nombre del aspirante."
10.    >>nombre
11.        <<"Ingrese el apellido del aspirante."
12.    >>apellido
13.   <<"Ingrese su nota promedio de bachiller."
14.   >>prom_bachiller
15.   <<"Ingrese la nota de prueba de admisión."
16.   >>nota_prueba
17.   promedio_bachiller <-- (promedio_bachiller * 40) / 100
18.   nota_prueba <-- (nota_prueba * 60) / 100
19.   nota_total <-- promedio_bachiller + nota_prueba
20.   Si nota_total > 8 and nota_total < 10 entonces
21.     <<"-"+contador". Aspirante ACEPTADO: "+nombre,+ apellido",con una nota total de: "+nota_total
22.   De lo contrario
23.     <<"-"+contador". Aspirante RECHAZADO: "+nombre,+ apellido",con una nota total de: "+nota_total
24.   Fin Si
25.   contador <-- contador + 1
26. Fin Mientras
27. Fin  


    }
}

