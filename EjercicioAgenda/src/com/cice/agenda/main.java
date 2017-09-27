/*
EJERCICIO INDIVIDUAL AGENDA JAVA

Tenemos que crear una agenda que nos permita:
1. Almacenar contactos
- nombre completo
- telefono 1
- telefono 2
- dirección postal
- email
- cumpleaños

2. mostrar los datos de un/varios contacto/s introduciendo su nombre o primer apellido.
3. editar y elminar contactos de mi agenda
4. agregar nuevos contactos, avisando si ya tengo un contacto con el mismo nombre.
5. agregar contactos a listas de difusión. no todos son añadidos a estas listas.
6. control de errores usando nuestras propias excepciones en los casos 2, 3 y 4
7. posibilitar la creación de contactos profesionales, almacenando cif, direccion fiscal, sector
8. opciones de menu:
- mostrar todos
- mostrar por coincidencia de nombre o apellido
- mostrar listas de difusión
- crear contactos/ listas de difusión
- editar contactos / listas de difusión
- agregar contactos a lista de difusión
- eliminar contacto / lista de difusión
 */
package com.cice.agenda;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("================MENU===============");
        System.out.println("===================================");
        System.out.println("1. Introducir nuevo contacto");
        System.out.println("2. Mostrar los datos de la persona 'x'");
        System.out.println("3. Editar contactos de la agenda");
        System.out.println("4. Agregar nuevos contactos");
        System.out.println("5. Agregar contactos a lista de difusión");
        System.out.println("6. Introducir contacto profesional");
        System.out.println("7. SALIR");

        Scanner sc = new Scanner(System.in);

        System.out.println("introduce una opción");
        int opcion = 0;

        opcion = sc.nextInt();

        boolean salir = false;

        while (!salir) {

            switch (opcion) {
                case 1:

                    System.out.println("Has seleccionado Introducir nuevo contacto");
                    break;
                case 2:

                    System.out.println("Has seleccionado Mostrar los datos de la persona 'x'");
                    break;
                case 3:

                    System.out.println("Has seleccionado Editar contactos de la agenda");
                    break;
                case 4:

                    System.out.println("Has seleccionado Agregar nuevos contactos");
                    break;
                case 5:

                    System.out.println("Has seleccionado Agregar contactos a lista de difusión");
                    break;
                case 6:

                    System.out.println("Has seleccionado Introducir contacto profesional");
                    break;
                case 7:

                    System.out.println("Has seleccionado SALIR");
                    salir=true;
                    break;
                default:

                    System.out.println("Introduce una opción correcta");
                    break;

            }
        }
    }

}
