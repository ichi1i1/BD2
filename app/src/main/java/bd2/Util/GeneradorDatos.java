package bd2.Util;

import bd2.model.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneradorDatos {

    public static List<Venta> generarVentasDePrueba() {
        List<Venta> todasLasVentas = new ArrayList<>();
        Random random = new Random();

        // 1. Generar 3 Sucursales
        List<Sucursal> sucursales = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            Sucursal s = new Sucursal();
            s.nombre = "Sucursal " + i;
            s.domicilio = new Domicilio("Calle Principal", 100 * i, "Ciudad", "Provincia");
            s.puntoVenta = "000" + i;
            sucursales.add(s);
        }

        // 2. Generar 10 Clientes
        List<Cliente> clientes = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Cliente c = new Cliente();
            c.nombre = "NombreCliente" + i;
            c.apellido = "ApellidoCliente" + i;
            c.dni = "1000000" + i;
            c.domicilio = new Domicilio("Calle Cliente", i * 10, "Ciudad", "Provincia");
            c.obraSocial = new ObraSocial("Obra Social " + i, "AF-" + i);
            clientes.add(c);
        }

        // 3. Generar 3 Empleados por sucursal (1 encargado, 2 vendedores)
        List<List<Empleado>> empleadosPorSucursal = new ArrayList<>();
        int idEmpleado = 1;
        for (int i = 0; i < sucursales.size(); i++) {
            List<Empleado> empleados = new ArrayList<>();
            for (int j = 1; j <= 3; j++) {
                Empleado e = new Empleado();
                e.nombre = "NombreEmp" + idEmpleado;
                e.apellido = "ApellidoEmp" + idEmpleado;
                e.dni = "2000000" + idEmpleado;
                e.cuil = 20000000 + idEmpleado;
                // El primer empleado de cada sucursal es el encargado
                e.tipo = (j == 1) ? "Encargado" : "Vendedor";
                empleados.add(e);
                idEmpleado++;
            }
            empleadosPorSucursal.add(empleados);
        }

        // 4. Generar 10 Productos (7 medicamentos, 3 perfumería)
        List<Producto> productos = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            Producto p = new Producto();
            p.nombre = "Producto " + i;
            p.codigo = 1000 + i;
            p.precio = 100.0 + (i * 25.5);
            p.stock = 50;
            p.tipo = (i <= 7) ? "Medicamento" : "Perfumería";
            productos.add(p);
        }

        // 5. Generar Ventas (Promedio 30 +/- 20% -> Entre 24 y 36 ventas por sucursal)
        for (int i = 0; i < sucursales.size(); i++) {
            Sucursal sucursal = sucursales.get(i);
            List<Empleado> empsSucursal = empleadosPorSucursal.get(i);
            
            int cantidadVentas = 24 + random.nextInt(13); // Genera un número del 24 al 36 inclusive
            
            for (int v = 0; v < cantidadVentas; v++) {
                Venta venta = new Venta();
                venta.sucursal = sucursal;
                venta.fecha = "2026-05-" + (1 + random.nextInt(28));
                venta.cliente = clientes.get(random.nextInt(clientes.size())); // Cliente aleatorio
                venta.cajero = empsSucursal.get(random.nextInt(empsSucursal.size()));
                venta.despachante = empsSucursal.get(random.nextInt(empsSucursal.size()));
                venta.productos = new ArrayList<>();
                
                double totalVenta = 0.0;
                int cantProductos = 1 + random.nextInt(3); // 1 a 3 productos distintos (Promedio 2.0)
                for (int p = 0; p < cantProductos; p++) {
                    Producto prod = productos.get(random.nextInt(productos.size()));
                    DetalleProducto dp = new DetalleProducto(prod, 1 + random.nextInt(2), prod.precio);
                    venta.productos.add(dp);
                    totalVenta += (dp.cantidad * dp.precioUnitario);
                }
                venta.total = totalVenta;
                todasLasVentas.add(venta);
            }
        }
        return todasLasVentas;
    }
}
