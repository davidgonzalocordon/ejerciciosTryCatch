package co.edu.udes.Supermercado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Tienda {

    public static void main(String[] args) {
        List<Employ> listEmploy = new ArrayList<>();
        List<Provedor> listProvedor = new ArrayList<>();
        List<Client> listClient = new ArrayList<>();
        List<Producto> listaProductos = new ArrayList<>();
        List<Factura> listaFactura = new ArrayList<>();
        List<Caja> listaCajas = new ArrayList<>();
        Scanner read = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("1. Bodegas");
            System.out.println("2. Cajas");
            System.out.println("3. Clientes");
            System.out.println("4. Empleados");
            System.out.println("5. Facturas");
            System.out.println("6. Productos");
            System.out.println("7. Proveedores");
            System.out.println("8. Cerrar");

            System.out.print("\nSeleccione una opción: ");

            try {
                opcion = read.nextInt();
            } catch (Exception e) {
                System.out.println("Error: Ingrese un valor numérico válido para la opción.");
                read.nextLine(); // Limpiar el búfer del escáner
                continue;
            }

            switch (opcion) {
                case 1:
                    opcion = 0;

                    do {
                        System.out.println("\nBodegas:");
                        System.out.println("1. Crear");
                        System.out.println("2. Mostrar lista");
                        System.out.println("3. Volver");

                        System.out.print("\nSeleccione una opción: ");

                        try {
                            opcion = read.nextInt();
                        } catch (Exception e) {
                            System.out.println("Error: Ingrese un valor numérico válido para la opción.");
                            read.nextLine(); // Limpiar el búfer del escáner
                            continue;
                        }

                        switch (opcion) {
                            case 1:
                                System.out.println("Crear ");
                                boolean seguirCreando = true;
                                while (seguirCreando) {
                                    System.out.println("¿Desea crear un nuevo producto? (s/n)");
                                    String Decision = read.nextLine();
                                    if (Decision.equalsIgnoreCase("s")) {
                                        Producto nuevoProducto = crearProducto(listProvedor);
                                        if (nuevoProducto != null) {
                                            listaProductos.add(nuevoProducto);
                                            System.out.println("Producto creado con éxito.");
                                        } else {
                                            System.out.println("No se pudo crear el producto.");
                                        }
                                    } else if (Decision.equalsIgnoreCase("n")) {
                                        seguirCreando = false;
                                    } else {
                                        System.out.println("Opción inválida. Intente de nuevo.");
                                    }
                                }

                                System.out.println("Lista de empleados:");

                                System.out.print("Ingrese el nombre de la bodega: ");
                                String nombreBodega = read.nextLine();

                                System.out.print("Ingrese la ubicación de la bodega: ");
                                String ubicacionBodega = read.nextLine();

                                System.out.println("Lista de gerentes disponibles:");

                                imprimirListaEmpleados(listEmploy);

                                System.out.print("Ingrese el nombre del gerente de la bodega: ");
                                String nombreGerente = read.nextLine();

                                Employ gerente = null;
                                for (Employ empleado : listEmploy) {
                                    gerente = empleado;
                                    break;
                                }

                                if (gerente == null) {
                                    System.out.println("No se pudo asignar un gerente a la bodega.");
                                    return;
                                }

                                Bodega bodega = new Bodega(nombreBodega, ubicacionBodega, gerente, listaProductos);

                                System.out.println("Bodega creada exitosamente.");
                                System.out.println("Nombre: " + bodega.getName());
                                System.out.println("Ubicación: " + bodega.getLocation());
                                System.out.println("Gerente: " + bodega.getManager().getName());
                                System.out.println("Lista de productos:");

                                break;
                            case 2:
                                System.out.println("Mostrar lista produvtos de la bodega de Bodega");
                                imprimirListaProductos(listaProductos);
                                break;
                            case 3:
                                System.out.println("Volviendo al menú principal.");
                                break;
                            default:
                                System.out.println("Opción inválida.");
                                break;
                        }

                    } while (opcion != 3);
                    break;
                case 2:
                    opcion = 0;

                    do
                    {
                        System.out.println("\nCajas:");
                        System.out.println("1. Crear");
                        System.out.println("2. Mostrar lista");
                        System.out.println("3. Volver");

                        System.out.print("\nSeleccione una opción: ");
                        opcion = read.nextInt();

                        switch (opcion)
                        {
                            case 1:
                                System.out.println("Crear ");
                                boolean seguirCreando = true;
                                while (seguirCreando)
                                {
                                    System.out.println("¿Desea crear una nueva caja? (s/n)");
                                    String decicion = read.nextLine();
                                    if (decicion.equalsIgnoreCase("s"))
                                    {
                                        Caja newCaja = crearCaja(listEmploy);
                                        if (newCaja != null)
                                        {
                                            listaCajas.add(newCaja);
                                            System.out.println("caja creado con éxito.");
                                        } else
                                        {
                                            System.out.println("No se pudo crear la caja.");
                                        }
                                    } else if (decicion.equalsIgnoreCase("n"))
                                    {
                                        seguirCreando = false;
                                    } else
                                    {
                                        System.out.println("Opción inválida. Intente de nuevo.");
                                    }
                                }

                                System.out.println("Lista de clientes:");

                                imprimirListaClientes(listClient);

                                break;
                            case 2:
                                System.out.println("Mostrar lista de Cajas");
                                break;
                            case 3:
                                System.out.println("Volviendo al menú principal.");
                                break;
                            default:
                                System.out.println("Opción inválida.");
                                break;
                        }

                    } while (opcion != 3);
                    break;
                case 3:
                    opcion = 0;

                    do
                    {
                        System.out.println("\nClientes:");
                        System.out.println("1. Crear");
                        System.out.println("2. Mostrar lista");
                        System.out.println("3. Volver");

                        System.out.print("\nSeleccione una opción: ");
                        opcion = read.nextInt();

                        switch (opcion)
                        {
                            case 1:
                                System.out.println("Crear ");
                                boolean seguirCreando = true;
                                while (seguirCreando)
                                {
                                    System.out.println("¿Desea crear un nuevo cliente? (s/n)");
                                    String decicion = read.nextLine();
                                    if (decicion.equalsIgnoreCase("s"))
                                    {
                                        Client newCliente = crearCliente();
                                        if (newCliente != null)
                                        {
                                            listClient.add(newCliente);
                                            System.out.println("Cliente creado con éxito.");
                                        } else
                                        {
                                            System.out.println("No se pudo crear el cliente.");
                                        }
                                    } else if (decicion.equalsIgnoreCase("n"))
                                    {
                                        seguirCreando = false;
                                    } else
                                    {
                                        System.out.println("Opción inválida. Intente de nuevo.");
                                    }
                                }

                                System.out.println("Lista de clientes:");

                                imprimirListaClientes(listClient);

                                break;
                            case 2:
                                System.out.println("Mostrar lista de Clientes");
                                imprimirListaClientes(listClient);
                                break;
                            case 3:
                                System.out.println("Volviendo al menú principal.");
                                break;
                            default:
                                System.out.println("Opción inválida.");
                                break;
                        }

                    } while (opcion != 3);
                    break;
                case 4:
                    opcion = 0;

                    do
                    {
                        System.out.println("\nEmpleados:");
                        System.out.println("1. Crear");
                        System.out.println("2. Mostrar lista");
                        System.out.println("3. Volver");

                        System.out.print("\nSeleccione una opción: ");
                        opcion = read.nextInt();

                        switch (opcion)
                        {
                            case 1:
                                System.out.println("Crear ");
                                boolean seguirCreando = true;
                                while (seguirCreando)
                                {
                                    System.out.println("¿Desea crear un nuevo empleado? (s/n)");
                                    String decicion = read.next();
                                    if (decicion.equalsIgnoreCase("s"))
                                    {
                                        Employ newEmpleado = crearEmpleado();
                                        if (newEmpleado != null)
                                        {
                                            listEmploy.add(newEmpleado);
                                            System.out.println("Empleado creado con éxito.");
                                        } else
                                        {
                                            System.out.println("No se pudo crear el empleado.");
                                        }
                                    } else if (decicion.equalsIgnoreCase("n"))
                                    {
                                        seguirCreando = false;
                                    } else
                                    {
                                        System.out.println("Opción inválida. Intente de nuevo.");
                                    }
                                }

                                System.out.println("Lista de empleados:");

                                imprimirListaEmpleados(listEmploy);

                                break;
                            case 2:
                                System.out.println("Mostrar lista de Empleados");
                                imprimirListaEmpleados(listEmploy);
                                break;
                            case 3:
                                System.out.println("Volviendo al menú principal.");
                                break;
                            default:
                                System.out.println("Opción inválida.");
                                break;
                        }

                    } while (opcion != 3);
                    break;
                case 5:
                    opcion = 0;

                    do
                    {
                        System.out.println("\nFacturas:");
                        System.out.println("1. Crear");
                        System.out.println("2. Mostrar lista");
                        System.out.println("3. Volver");

                        System.out.print("\nSeleccione una opción: ");
                        opcion = read.nextInt();

                        switch (opcion)
                        {
                            case 1:
                                System.out.println("Crear ");
                                boolean seguirCreando = true;
                                while (seguirCreando)
                                {
                                    System.out.println("¿Desea crear una nueva factura? (s/n)");
                                    String decision = read.nextLine();
                                    if (decision.equalsIgnoreCase("s"))
                                    {
                                        Factura newFactura = crearFactura(listEmploy, listClient, listaProductos);
                                        if (newFactura != null)
                                        {
                                            listaFactura.add(newFactura);
                                            System.out.println("Proveedor creado con éxito.");
                                        } else
                                        {
                                            System.out.println("No se pudo crear el proveedor.");
                                        }
                                    } else if (decision.equalsIgnoreCase("n"))
                                    {
                                        seguirCreando = false;
                                    } else
                                    {
                                        System.out.println("Opción inválida. Intente de nuevo.");
                                    }
                                }

                                System.out.println("Lista de proveedores:");

                                imprimirListaFactura(listaFactura);
                                break;
                            case 2:
                                System.out.println("Mostrar lista de Facturas");
                                imprimirListaFactura(listaFactura);
                                break;
                            case 3:
                                System.out.println("Volviendo al menú principal.");
                                break;
                            default:
                                System.out.println("Opción inválida.");
                                break;
                        }

                    } while (opcion != 3);
                    break;
                case 6:
                    opcion = 0;

                    do
                    {
                        System.out.println("\nProductos:");
                        System.out.println("1. Crear");
                        System.out.println("2. Mostrar lista");
                        System.out.println("3. Volver");

                        System.out.print("\nSeleccione una opción: ");
                        opcion = read.nextInt();

                        switch (opcion)
                        {
                            case 1:
                                System.out.println("Crear ");
                                boolean seguirCreando = true;
                                while (seguirCreando)
                                {
                                    System.out.println("¿Desea crear un nuevo producto? (s/n)");
                                    String decision = read.nextLine();
                                    if (decision.equalsIgnoreCase("s"))
                                    {
                                        Producto newProducto = crearProducto(listProvedor);
                                        if (newProducto != null)
                                        {
                                            listaProductos.add(newProducto);
                                            System.out.println("Producto creado con éxito.");
                                        } else
                                        {
                                            System.out.println("No se pudo crear el producto.");
                                        }
                                    } else if (decision.equalsIgnoreCase("n"))
                                    {
                                        seguirCreando = false;
                                    } else
                                    {
                                        System.out.println("Opción inválida. Intente de nuevo.");
                                    }
                                }

                                System.out.println("Lista de productos:");

                                imprimirListaProductos(listaProductos);

                                break;
                            case 2:
                                System.out.println("Mostrar lista de Productos");
                                imprimirListaProductos(listaProductos);
                                break;
                            case 3:
                                System.out.println("Volviendo al menú principal.");
                                break;
                            default:
                                System.out.println("Opción inválida.");
                                break;
                        }

                    } while (opcion != 3);
                    break;
                case 7:
                    opcion = 0;

                    do
                    {
                        System.out.println("\nProveedores:");
                        System.out.println("1. Crear");
                        System.out.println("2. Mostrar lista");
                        System.out.println("3. Volver");

                        System.out.print("\nSeleccione una opción: ");
                        opcion = read.nextInt();

                        switch (opcion)
                        {
                            case 1:
                                System.out.println("Crear ");
                                boolean seguirCreando = true;
                                while (seguirCreando)
                                {
                                    System.out.println("¿Desea crear un nuevo proveedor? (s/n)");
                                    String decision = read.nextLine();
                                    if (decision.equalsIgnoreCase("s"))
                                    {
                                        Provedor newProveedor = crearProveedor();
                                        if (newProveedor != null)
                                        {
                                            listProvedor.add(newProveedor);
                                            System.out.println("Proveedor creado con éxito.");
                                        } else
                                        {
                                            System.out.println("No se pudo crear el proveedor.");
                                        }
                                    } else if (decision.equalsIgnoreCase("n"))
                                    {
                                        seguirCreando = false;
                                    } else
                                    {
                                        System.out.println("Opción inválida. Intente de nuevo.");
                                    }
                                }

                                System.out.println("Lista de proveedores:");

                                imprimirListaProveedores(listProvedor);

                                break;
                            case 2:
                                System.out.println("Mostrar lista de Proveedores");
                                imprimirListaProveedores(listProvedor);
                                break;
                            case 3:
                                System.out.println("Volviendo al menú principal.");
                                break;
                            default:
                                System.out.println("Opción inválida.");
                                break;
                        }

                    } while (opcion != 3);
                    break;
                case 8:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }

        } while (opcion != 8);
    }

    public static Employ crearEmpleado() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese el horario del empleado (formato HH:mm:ss): ");
        String horarioStr = sc.nextLine();
        Date horario = null;
        try
        {
            SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
            horario = format.parse(horarioStr);
        } catch (ParseException e)
        {
            System.out.println("Error: formato de horario inválido.");
            return null;
        }

        System.out.print("Ingrese el sueldo del empleado: ");
        double sueldo = sc.nextDouble();
        sc.nextLine();

        System.out.print("Ingrese el DNI del empleado: ");
        String dni = sc.nextLine();

        System.out.print("Ingrese el número de celular del empleado: ");
        String numCelular = sc.nextLine();

        return new Employ(nombre, horario, sueldo, dni, numCelular);
    }

    public static void imprimirListaEmpleados(List<Employ> listaEmpleados) {
        System.out.println("Lista de empleados:\n");
        for (Employ empleado : listaEmpleados)
        {
            System.out.println("Nombre: " + empleado.getName());
            System.out.println("Horario: " + empleado.getSchedule());
            System.out.println("Sueldo: " + empleado.getSalary());
            System.out.println("DNI: " + empleado.getDni());
            System.out.println("Número de celular: " + empleado.getPhone());
            System.out.println("-------------------------------------\n");
        }
    }

    public static Provedor crearProveedor() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del proveedor: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la dirección del proveedor: ");
        String direccion = sc.nextLine();

        System.out.print("Ingrese el número de teléfono del proveedor: ");
        String telefono = sc.nextLine();

        return new Provedor(nombre, direccion, telefono);
    }

    public static void imprimirListaProveedores(List<Provedor> listaProveedores) {
        System.out.println("Lista de proveedores:\n");
        for (Provedor proveedor : listaProveedores)
        {
            System.out.println("Nombre: " + proveedor.getName());
            System.out.println("Dirección: " + proveedor.getAddress());
            System.out.println("Teléfono: " + proveedor.getPhone());
            System.out.println("-------------------------------------\n");
        }
    }

    public static Client crearCliente() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese el DNI del cliente: ");
        String dni = sc.nextLine();

        System.out.print("Ingrese el correo electrónico del cliente: ");
        String correo = sc.nextLine();

        System.out.print("Ingrese los puntos del cliente: ");
        int puntos = sc.nextInt();

        return new Client(nombre, dni, correo, puntos);
    }

    public static void imprimirListaClientes(List<Client> listClient) {
        System.out.println("Lista de clientes:\n");
        for (Client cliente : listClient)
        {
            System.out.println("Nombre: " + cliente.getName());
            System.out.println("DNI: " + cliente.getDni());
            System.out.println("Correo electrónico: " + cliente.getEmail());
            System.out.println("Puntos acumulados: " + cliente.getPoints());
            System.out.println("-------------------------------------\n");
        }
    }

    public static Producto crearProducto(List<Provedor> listProveedor) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el id del producto: ");
        int id = sc.nextInt();

        System.out.print("Ingrese la nombre del producto: ");
        String name = sc.nextLine();

        System.out.println("Seleccione un proveedor de la lista: ");
        for (int i = 0; i < listProveedor.size(); i++)
        {
            System.out.println((i + 1) + ". " + listProveedor.get(i).getName());
        }
        int opcion = sc.nextInt();
        Provedor proveedor = listProveedor.get(opcion - 1);

        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();

        return new Producto(id, name, proveedor, precio);
    }

    public static void imprimirListaProductos(List<Producto> listaProductos) {
        System.out.println("Lista de productos:\n");
        for (Producto producto : listaProductos)
        {
            System.out.println("ID: " + producto.getId());
            System.out.println("Nombre: " + producto.getName());
            System.out.println("Proveedor: " + producto.getProvider().getName());
            System.out.println("Precio: " + producto.getPrice());
            System.out.println("-------------------------------------\n");
        }
    }

    public static Factura crearFactura(List<Employ> listaEmpleados, List<Client> listaClientes, List<Producto> listaproductos) {
        Scanner sc = new Scanner(System.in);

        List<Producto> product = listaproductos;
        List<Integer> n_product = new ArrayList<Integer>();
        for (int i = 0; i < product.size(); i++)
        {
            System.out.println("inserte la cantidad de " + product.get(i) + ": ");
            n_product.add(sc.nextInt());
        }
        List<Client> clients = listaClientes;
        System.out.println("Seleccione un empleado de la lista: ");
        for (int i = 0; i < clients.size(); i++)
        {
            System.out.println((i + 1) + ". " + clients.get(i).getName());
        }
        int opcion = sc.nextInt();
        Client Client = clients.get(opcion - 1);
        List<Employ> employs = listaEmpleados;
        System.out.println("Seleccione un empleado de la lista: ");

        for (int i = 0; i < employs.size(); i++)
        {
            System.out.println((i + 1) + ". " + employs.get(i).getName());
        }
        opcion = sc.nextInt();
        Employ employ = listaEmpleados.get(opcion - 1);
        System.out.print("Ingrese fecha de la factura (formato dd/MM/yyyy HH:mm:ss): ");
        String fecha = sc.nextLine();
        Date horario = null;
        try
        {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            horario = format.parse(fecha);
        } catch (ParseException e)
        {
            System.out.println("Error: formato de horario inválido.");
            return null;
        }
        Employ empploy = employs.get(opcion - 1);
        return new Factura(product, employ, Client);
    }

    public static void imprimirListaFactura(List<Factura> listaFactura) {
        System.out.println("Lista de productos:\n");
        int id = 0;
        for (Factura factura : listaFactura)
        {
            System.out.println("id: " + id);
            id++;
            System.out.println("Nombre: " + factura.getClient().getName());
            System.out.println("vendedor: " + factura.getEmploy().getName());
            System.out.println("Precio: " + factura.getProducts());
            System.out.println("-------------------------------------\n");
        }
    }

    private static Caja crearCaja(List<Employ> listaEmpleados) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte la id de la caja: ");
        String id=sc.next();
        List<Employ> employs = listaEmpleados;
        System.out.println("Seleccione un empleado de la lista: ");

        for (int i = 0; i < employs.size(); i++)
        {
            System.out.println((i + 1) + ". " + employs.get(i).getName());
        }
        int opcion = sc.nextInt();
        Employ employ = listaEmpleados.get(opcion - 1);
        System.out.println("Insertar la cantidad de dinero en la caja: ");
        int dinero=sc.nextInt();
        
        return new Caja(id,dinero,employ);

    }

}
