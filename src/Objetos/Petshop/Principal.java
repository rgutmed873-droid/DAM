package Objetos.Petshop;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        menu();
    }

    private static void menu() {

        ArrayList<Animals> animales = new ArrayList<>();

        //Creo las variables de totales para poder guardar los animales
        //Que se van vendiendo
        int totalAnimalesVendidos = 0;
        int totalPerrosVendidos = 0;
        int totalGatosVendidos = 0;
        int totalPajarosVendidos = 0;
        int totalRatasVendidas = 0;


        int opcion;

        do {
            System.out.println("1. Vender animal");
            System.out.println("2. Total vendidos");
            System.out.println("3. Total mascotas");
            System.out.println("4. Totales por tipo de animal");
            System.out.println("5. Buscar dueño por el DNI");
            System.out.println("6. Buscar chip por el nombre del animal");
            System.out.println("7. Buscar animal por su EAN");
            System.out.println("8. Apareamiento");
            System.out.println("9. Comida");
            System.out.println("0. Saliendo....");

            opcion = sc.nextInt();

            switch (opcion){
                case 1:
                    venderAnimal(totalAnimalesVendidos,totalPajarosVendidos,totalRatasVendidas,totalGatosVendidos,totalPerrosVendidos);
                break;
                case 2:
                    mostrarVendidos(totalAnimalesVendidos);
                break;
                case 3:
                    totalMascotas(animales);
                break;
                case 4:
                    totalesTipo(totalPerrosVendidos,totalGatosVendidos,totalPajarosVendidos,totalRatasVendidas);
                break;
                case 5:
                    buscarDNI(animales);
                break;
                case 6:
                    buscarNombre(animales);
                break;
                case 7:
                    buscarEan(animales);
                break;
                case 8:
                    apareamiento(animales);
                break;
                case 9:
                    comida(animales);
                break;
            }



        }while (opcion != 0);
    }

    private static void comida(ArrayList<Animals> animales) {

        System.out.println("EAN");
        int ean = sc.nextInt();

        System.out.println("Comida");
        String comida = sc.next();

        //Uso este for para recorrer la lista de animales que tenemos del arraylist
        for (Animals a:animales){

            if (a.getCodigoEAN()==ean){
                //Uso el instanceof porque como hay varios tipos de aniamles hay que diferenciarlos
                if (a instanceof Dog){
                    if (comida.equals("meat") || comida.equals("bones") || comida.equals("feed"))
                        System.out.println("Le gusta");
                }
                if (a instanceof Cat){
                    if (comida.equals("fish") || comida.equals("feed"))
                        System.out.println("Le gusta");
                }
                if (a instanceof Birds){
                    if (comida.equals("feed"))
                        System.out.println("Le gusta");
                }
            }
        }
    }

    private static void apareamiento(ArrayList<Animals> animales) {

        System.out.println("Chip 1");
        int chip1 = sc.nextInt();

        System.out.println("Chip 2");
        int chip2 = sc.nextInt();

        pets p1 = null;
        pets p2 = null;

        for (Animals a:animales){
            if (a instanceof pets){
                pets p=(pets) a;

                if (p.getChip()==chip1)
                    p1=p;

                if (p.getChip()==chip2)
                    p2=p;
            }
        }

        if (p1!=null && p2!=null && p1.getClass().equals(p2)){

            if (p1.getClass()==p2.getClass()){
                System.out.println("Pueden aparearse");
            }else {
                System.out.println("No pueden aparearse");
            }
        }
    }

    private static void buscarEan(ArrayList<Animals> animales) {
        System.out.println("EAN: ");

        int ean = sc.nextInt();

        for (Animals a: animales){
            if (a.getCodigoEAN()==ean){
                System.out.println(a);
            }
        }

    }

    private static void buscarNombre(ArrayList<Animals> animales) {

        System.out.println("Nombre de la mascota");

        String nombreMascota = sc.next();

        for (Animals a:animales){
            if (a instanceof pets){
                pets p=(pets) a;
                if (p.getNombre().equals(nombreMascota)){
                    System.out.println("Chip: " + p.getChip());
                }
            }
        }
    }

    private static void buscarDNI(ArrayList<Animals> animales) {
        System.out.println("DNI:");

        String dni = sc.next();

        for (Animals a:animales){
            if (a instanceof pets){
                pets p=(pets) a;
                if (p.getOwner().getDni().equals(dni)){
                    System.out.println(p.getOwner().getNombre());
                }
            }
        }
    }

    private static void totalesTipo(int totalPerrosVendidos, int totalGatosVendidos, int totalPajarosVendidos, int totalRatasVendidas) {

        System.out.println("Perros totales vendidos: " + totalPerrosVendidos);
        System.out.println("Gatos totales vendidos: " + totalGatosVendidos);
        System.out.println("Pajaros totales vendidos: " + totalPajarosVendidos);
        System.out.println("Ratas totales vendidas: " + totalRatasVendidas);
    }

    private static void totalMascotas(ArrayList<Animals> animales) {

        int total = 0;

        for (Animals a:animales){
            if (a instanceof pets)
                total++;
        }

        System.out.println("Mascostas: " + total);
    }

    private static void mostrarVendidos(int totalAnimalesVendidos) {

        System.out.println("Total de animales vendidos: " + totalAnimalesVendidos);
    }

    public static void venderAnimal(int totalAnimalesVendidos, int totalPajarosVendidos, int totalRatasVendidas, int totalGatosVendidos, int totalPerrosVendidos){

        System.out.println("1 Perro");
        System.out.println("2 Gato");
        System.out.println("3 Pajaro");
        System.out.println("4 Rata");

        int tipo = sc.nextInt();

        System.out.println("Edad:");
        int edad = sc.nextInt();

        System.out.println("EAN:");
        int ean = sc.nextInt();

        Animals a=null;

        switch(tipo){

            case 1:

                System.out.println("Pedigree true/false:");
                boolean pedigree=sc.nextBoolean();

                a=new Dog(edad,ean,pedigree);

                totalPerrosVendidos++;
                totalAnimalesVendidos++;

                if(pedigree){
                    System.out.println("Precio: 200");
                }else{
                    System.out.println("Precio: 100");
                }

                break;

            case 2:

                a=new Cat(edad,ean);

                totalGatosVendidos++;
                totalAnimalesVendidos++;

                System.out.println("Precio: 50");

                break;

            case 3:

                a=new Birds(edad,ean);

                totalPajarosVendidos++;
                totalAnimalesVendidos++;

                System.out.println("Precio: 10");

                break;

            case 4:

                System.out.println("Peso:");
                double peso=sc.nextDouble();

                System.out.println("Tamaño:");
                double tam=sc.nextDouble();

                if(peso>=200 && tam>=5){

                    a = new Rats(edad,ean);

                    totalRatasVendidas++;
                    totalAnimalesVendidos++;

                    double precio = (peso/1000)*2;

                    System.out.println("Precio: "+precio);

                }else{

                    System.out.println("No se puede vender");

                }

                break;

        }

        if(a!=null){
            animales.add(a);
        }

    }
}
