/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.udes.taller_3.Cine;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Cinema {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        ArrayList<Recibo_Comida> billFoodList = new ArrayList();
        ArrayList<Recibo_Funcion> billFunctionList = new ArrayList();
        ArrayList<Silla> chairList = new ArrayList();
        ArrayList<Sala> cinemaRoomList = new ArrayList();
        ArrayList<Cliente> clientList = new ArrayList();
        ArrayList<Funcion> functionList = new ArrayList();
        ArrayList<Pelicula> movieList = new ArrayList();
        ArrayList<Producto_Comida> productFoodList = new ArrayList();
        ArrayList<Trabajador> workerList = new ArrayList();

        String nombre = "";
        int menu = 0;
        int subMenu = 0;

        while (true) {
            System.out.println("\nBienvenido, ¿con qué le gustaría trabajar el día de hoy?");
            System.out.println("1. Factura de Comida");
            System.out.println("2. Factura de Funcion");
            System.out.println("3. Silla");
            System.out.println("4. Sala de Cine");
            System.out.println("5. Cliente");
            System.out.println("6. Funcion");
            System.out.println("7. Pelicula");
            System.out.println("8. Comida");
            System.out.println("9. Empleado");
            System.out.println("10. Salir");

            try {
                menu = read.nextInt();
                read.nextLine();
            } catch (Exception e) {
                System.out.println("Error: Ingrese un valor numérico válido.");
                read.nextLine();
                continue;
            }

            if (menu == 10) {
                System.out.println("Muchas gracias por usar este servicio");
                System.exit(0);
            }

            switch (menu) {
                case 1:
                    nombre = "Factura de Comida";
                    break;

                case 2:
                    nombre = "Factura de Funcion";
                    break;

                case 3:
                    nombre = "Silla";
                    break;

                case 4:
                    nombre = "Sala de Cine";
                    break;

                case 5:
                    nombre = "Cliente";
                    break;

                case 6:
                    nombre = "Funcion";
                    break;

                case 7:
                    nombre = "Pelicula";
                    break;

                case 8:
                    nombre = "Comida";
                    break;

                case 9:
                    nombre = "Empleado";
                    break;
            }

            subMenu = Submenu(read, nombre);

            switch (subMenu) {
                case 1:
                    switch (nombre) {
                        case "Factura de Comida":
                            try {
                            if (!productFoodList.isEmpty() && !clientList.isEmpty() && !workerList.isEmpty()) {
                                billFoodList = Add(billFoodList, read, nombre, productFoodList, workerList, clientList, functionList, chairList, cinemaRoomList, movieList);
                            } else {
                                System.out.println("Para generar una factura de comida primero ingrese mínimo una comida, un cliente y un trabajador.");
                            }
                        } catch (Exception e) {
                            System.out.println("Error: Ingrese un valor válido.");
                        }
                        break;

                        case "Factura de Funcion":
                            try {
                            if (!functionList.isEmpty() && !clientList.isEmpty() && !workerList.isEmpty()) {
                                billFunctionList = Add(billFunctionList, read, nombre, productFoodList, workerList, clientList, functionList, chairList, cinemaRoomList, movieList);
                            } else {
                                System.out.println("Para generar una factura de función primero ingrese mínimo una función, un cliente y un trabajador.");
                            }
                        } catch (Exception e) {
                            System.out.println("Error: Ingrese un valor válido.");
                        }
                        break;

                        case "Silla":
                            try {
                            chairList = Add(chairList, read, nombre, productFoodList, workerList, clientList, functionList, chairList, cinemaRoomList, movieList);
                        } catch (Exception e) {
                            System.out.println("Error: Ingrese un valor válido.");
                        }
                        break;

                        case "Sala de Cine":
                            try {
                            if (!chairList.isEmpty()) {
                                cinemaRoomList = Add(cinemaRoomList, read, nombre, productFoodList, workerList, clientList, functionList, chairList, cinemaRoomList, movieList);
                            } else {
                                System.out.println("Para agregar una sala de cine primero agregue mínimo una silla.");
                            }
                        } catch (Exception e) {
                            System.out.println("Error: Ingrese un valor válido.");
                        }
                        break;

                        case "Cliente":
                            try {
                            clientList = Add(clientList, read, nombre, productFoodList, workerList, clientList, functionList, chairList, cinemaRoomList, movieList);
                        } catch (Exception e) {
                            System.out.println("Error: Ingrese un valor válido.");
                        }
                        break;

                        case "Funcion":
                            try {
                            if (!movieList.isEmpty() && !cinemaRoomList.isEmpty()) {
                                functionList = Add(functionList, read, nombre, productFoodList, workerList, clientList, functionList, chairList, cinemaRoomList, movieList);
                            } else {
                                System.out.println("Para agregar una función mínimo agregue una película y una sala de cine.");
                            }
                        } catch (Exception e) {
                            System.out.println("Error: Ingrese un valor válido.");
                        }
                        break;

                        case "Pelicula":
                            try {
                            movieList = Add(movieList, read, nombre, productFoodList, workerList, clientList, functionList, chairList, cinemaRoomList, movieList);
                        } catch (Exception e) {
                            System.out.println("Error: Ingrese un valor válido.");
                        }
                        break;

                        case "Comida":
                            try {
                            productFoodList = Add(productFoodList, read, nombre, productFoodList, workerList, clientList, functionList, chairList, cinemaRoomList, movieList);
                        } catch (Exception e) {
                            System.out.println("Error: Ingrese un valor válido.");
                        }
                        break;

                        case "Empleado":
                            try {
                            workerList = Add(workerList, read, nombre, productFoodList, workerList, clientList, functionList, chairList, cinemaRoomList, movieList);
                        } catch (Exception e) {
                            System.out.println("Error: Ingrese un valor válido.");
                        }
                        break;
                    }
                    break;

                case 2:
                    switch (nombre) {
                        case "Factura de Comida":
                            Show(billFoodList);
                            break;

                        case "Factura de Funcion":
                            Show(billFunctionList);
                            break;

                        case "Silla":
                            Show(chairList);
                            break;

                        case "Sala de Cine":
                            Show(cinemaRoomList);
                            break;

                        case "Cliente":
                            Show(clientList);
                            break;

                        case "Funcion":
                            Show(functionList);
                            break;

                        case "Pelicula":
                            Show(movieList);
                            break;

                        case "Comida":
                            Show(productFoodList);
                            break;

                        case "Empleado":
                            Show(workerList);
                            break;
                    }
                    break;
            }
        }
    }

    public static int Submenu(Scanner read, String nombre) {
        int subMenu = 0;

        while (true) {
            System.out.println("\n¿Qué operación desea realizar con " + nombre + "?");
            System.out.println("1. Agregar");
            System.out.println("2. Mostrar");

            try {
                subMenu = read.nextInt();
                read.nextLine();
                if (subMenu >= 1 && subMenu <= 2) {
                    break;
                } else {
                    System.out.println("Error: Ingrese una opción válida.");
                }
            } catch (Exception e) {
                System.out.println("Error: Ingrese una opción válida.");
                read.nextLine();
            }
        }

        return subMenu;
    }

    public static void Show(ArrayList storage) {
        System.out.println("");

        for (int i = 0; i < storage.size(); i++) {
            System.out.println((i + 1) + ". " + storage.get(i));
        }
    }

    public static ArrayList Add(ArrayList storage, Scanner scanner, String nombre, ArrayList<Producto_Comida> productFoodList, ArrayList<Trabajador> workerList, ArrayList<Cliente> clientList, ArrayList<Funcion> functionList, ArrayList<Silla> chairList, ArrayList<Sala> cinemaRoomList, ArrayList<Pelicula> movieList) {

        int repetitions;

        System.out.println("Cuantos " + nombre + " quieres agregar?");
        repetitions = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < repetitions; i++) {

            switch (nombre) {

                case "Factura de Comida":

                    System.out.println("Ingrese el numero de factura.");
                    String billId = scanner.nextLine();

                    System.out.println("Cuantos productos va a facturar?");
                    int nProductos = scanner.nextInt();
                    scanner.nextLine();

                    String productNames[] = new String[nProductos];
                    int numberOfProduc[] = new int[nProductos];
                    int count = 0;
                    double totalPrice = 0;
                    Producto_Comida myProductFoodFac[] = new Producto_Comida[nProductos];

                    for (int j = 0; j < nProductos; j++) {
                        System.out.println("Ingrese el nombre del " + (j + 1) + " producto a facturar (separados por un espacio cada producto).");
                        productNames[j] = scanner.nextLine();

                        System.out.println("Ingrese cuantos " + productNames[j] + " va a facturar.");
                        numberOfProduc[j] = scanner.nextInt();
                        scanner.nextLine();
                    }

                    for (int j = 0; j < nProductos; j++) {
                        for (Producto_Comida producto : productFoodList) {
                            if (producto.getName().equals(productNames[count])) {
                                myProductFoodFac[count] = producto;
                                totalPrice = totalPrice + producto.getFoodPrice() * numberOfProduc[count];
                                count++;
                                break;
                            }
                        }
                    }

                    System.out.println("Ingrese el nombre del cliente que pidio la factura.");
                    String clientName = scanner.nextLine();

                    Cliente myClientFac = new Cliente();

                    for (Cliente cliente : clientList) {
                        if (cliente.getName().equals(clientName)) {
                            myClientFac = cliente;
                            break;
                        }
                    }

                    System.out.println("Ingrese el nombre del empleado que esta creando la factura.");
                    String employName = scanner.nextLine();

                    Trabajador myWorkerFac = new Trabajador();

                    for (Trabajador trabajador : workerList) {
                        if (trabajador.getName().equals(employName)) {
                            myWorkerFac = trabajador;
                            break;
                        }
                    }

                    Recibo_Comida myBillFood = new Recibo_Comida(billId, myProductFoodFac, numberOfProduc, totalPrice, myClientFac, myWorkerFac);
                    storage.add(myBillFood);
                    break;

                case "Factura de Funcion":

                    System.out.println("Ingrese el numero de factura.");
                    String billIdFunc = scanner.nextLine();

                    System.out.println("Ingrese el nombre del empleado que esta creando la factura.");
                    String employNameFunc = scanner.nextLine();

                    Trabajador worker = new Trabajador();

                    for (Trabajador trabajador : workerList) {
                        if (trabajador.getName().equals(employNameFunc)) {
                            worker = trabajador;
                            break;
                        }
                    }

                    System.out.println("Ingrese el nombre del cliente que pidio la factura.");
                    String clientNameFunc = scanner.nextLine();

                    Cliente Client = new Cliente();

                    for (Cliente cliente : clientList) {
                        if (cliente.getName().equals(clientNameFunc)) {
                            Client = cliente;
                            break;
                        }
                    }

                    System.out.println("Ingrese el id de la funcion a facturar.");
                    String functionId = scanner.nextLine();

                    Funcion funcion = new Funcion();

                    for (Funcion funciones : functionList) {
                        if (funcion.getId().equals(functionId)) {
                            funcion = funcion;
                            break;
                        }
                    }

                    System.out.println("La sala tiene " + funcion.getCinemaRoom().getTotalOfChairs() + " sillas, elija cual quiere.");
                    int nChair = scanner.nextInt() - 1;
                    scanner.nextLine();

                    String cinemaRoomId = funcion.getCinemaRoom().getId();
                    String chairId = funcion.getCinemaRoom().getChair()[nChair].getIdChair();
                    double totalPriceFunc = funcion.getCinemaRoom().getChair()[nChair].getPrice();

                    Recibo_Funcion myBillFunction = new Recibo_Funcion(billIdFunc, chairId, cinemaRoomId, totalPriceFunc, Client, worker, funcion);
                    storage.add(myBillFunction);
                    break;

                case "Silla":

                    System.out.println("Ingrese el id de la silla");
                    String chairID = scanner.nextLine();

                    System.out.println("La silla fue comprada? (true o false)");
                    boolean bougth = scanner.nextBoolean();
                    scanner.nextLine();

                    System.out.println("La silla es premium? (true o false)");
                    boolean premium = scanner.nextBoolean();
                    scanner.nextLine();

                    double chairPrice;

                    if (premium) {
                        chairPrice = 15000;
                    } else {
                        chairPrice = 10000;
                    }

                    Silla myChair = new Silla(chairID, bougth, premium, chairPrice);
                    storage.add(myChair);
                    break;

                case "Sala de Cine":

                    System.out.println("Ingrese el ID de la sala.");
                    String idSala = scanner.nextLine();

                    System.out.println("Ingrese el tipo de sala.");
                    String tipoSala = scanner.nextLine();

                    System.out.println("Ingrese el numero de sillas de la sala.");
                    int totalChairs = scanner.nextInt();
                    scanner.nextLine();

                    int premiumChairs = 0;
                    int commonChairs = 0;
                    int countSillas = 0;

                    Silla[] sillas = new Silla[totalChairs];

                    for (int j = 0; j < totalChairs; j++) {
                        System.out.println("Ingrese el Id de la silla " + (j + 1) + ".");
                        String idSilla = scanner.nextLine();

                        for (Silla silla : chairList) {
                            if (silla.getIdChair().equals(idSilla)) {

                                sillas[countSillas] = silla;

                                if (silla.isPremium()) {
                                    premiumChairs++;
                                } else {
                                    commonChairs++;
                                }

                                countSillas++;
                                break;
                            }
                        }
                    }

                    Sala myCinemaRoom = new Sala(idSala, tipoSala, commonChairs, premiumChairs, totalChairs, sillas);
                    storage.add(myCinemaRoom);
                    break;

                case "Cliente":

                    System.out.println("Ingrese el nombre del cliente.");
                    String nameClient = scanner.nextLine();

                    System.out.println("Ingrese el id del cliente.");
                    String idClient = scanner.nextLine();

                    System.out.println("El cliente tiene targeta del cine? (true o false)");
                    boolean cinemaCard = scanner.nextBoolean();
                    scanner.nextLine();

                    Cliente myClient = new Cliente(nameClient, idClient, cinemaCard);
                    storage.add(myClient);
                    break;

                case "Funcion":

                    System.out.println("Ingrese la hora de inicio de la funcion.");
                    String startTime = scanner.nextLine();

                    System.out.println("Ingrese la hora de fin de la funcion.");
                    String finalTime = scanner.nextLine();

                    System.out.println("Ingrese la fecha de la funcion.");
                    String date = scanner.nextLine();

                    System.out.println("Ingrese el id la funcion.");
                    String id = scanner.nextLine();

                    System.out.println("Ingrese el id la sala donde se proyecta.");
                    String idSalaProyection = scanner.nextLine();

                    System.out.println("Ingrese el id la pelicula que se proyecta.");
                    String idMovieProyection = scanner.nextLine();

                    Sala myCinemaProyection = new Sala();
                    Pelicula myMovieProyection = new Pelicula();

                    for (Sala salaCine : cinemaRoomList) {
                        if (salaCine.getId().equals(idSalaProyection)) {
                            myCinemaProyection = salaCine;
                            break;
                        }
                    }

                    for (Pelicula pelicula : movieList) {
                        if (pelicula.getId().equals(idMovieProyection)) {
                            myMovieProyection = pelicula;
                            break;
                        }
                    }

                    Funcion myFunction = new Funcion(myMovieProyection, myCinemaProyection, startTime, finalTime, date, id);
                    storage.add(myFunction);
                    break;

                case "Pelicula":

                    System.out.println("Ingrese el nombre de la pelicula.");
                    String movieName = scanner.nextLine();

                    System.out.println("Ingrese el id de la pelicula.");
                    String movieId = scanner.nextLine();

                    System.out.println("Ingrese el genero de la pelicula.");
                    String movieGenre = scanner.nextLine();

                    System.out.println("Ingrese la edad minima para ver la pelicula.");
                    String movieAgeRestriction = scanner.nextLine();

                    System.out.println("Ingrese el copyrigth de la pelicula.");
                    String movieCopyrigth = scanner.nextLine();

                    System.out.println("Ingrese la duracion de la pelicula (minutos).");
                    String movieDuration = scanner.nextLine();

                    Pelicula myMovie = new Pelicula(movieName, movieId, movieGenre, movieAgeRestriction, movieCopyrigth, movieDuration);
                    storage.add(myMovie);
                    break;

                case "Comida":

                    System.out.println("Ingrese el id del nuevo producto.");
                    String idFood = scanner.nextLine();

                    System.out.println("Ingrese el nombre del nuevo producto.");
                    String nameFood = scanner.nextLine();

                    System.out.println("Ingrese el tipo del nuevo producto (Bebida o comida).");
                    String typeFood = scanner.nextLine();

                    System.out.println("Ingrese el precio del nuevo producto.");
                    double priceFood = scanner.nextDouble();
                    scanner.nextLine();

                    Producto_Comida myFood = new Producto_Comida(idFood, nameFood, typeFood, priceFood);
                    storage.add(myFood);
                    break;

                case "Empleado":

                    System.out.println("Ingrese el nombre del nuevo empleado.");
                    String nameEmploy = scanner.nextLine();

                    System.out.println("Ingrese el id del nuevo empleado.");
                    String idEmploy = scanner.nextLine();

                    System.out.println("Ingrese el telefono del nuevo empleado.");
                    String celEmploy = scanner.nextLine();

                    System.out.println("Ingrese el horario del nuevo empleado.");
                    System.out.println("Ejemplo: 8:00AM - 8:00PM");
                    String scheduleEmploy = scanner.nextLine();

                    System.out.println("Ingrese el salario del nuevo empleado.");
                    double salaryEmploy = scanner.nextDouble();
                    scanner.nextLine();

                    Trabajador myWorker = new Trabajador(nameEmploy, idEmploy, celEmploy, scheduleEmploy, salaryEmploy);
                    storage.add(myWorker);
                    break;
            }
        }
        return storage;
    }

}
