import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VendedorSopaipasTest {
    public VendedorSopaipas vendedor = new VendedorSopaipas("nombre","rut",12);




    @Test
    void getNombre() {
        String nombre = "nombre";
        assertEquals(nombre,vendedor.getNombre());

    }

    @Test
    void getRut() {
        String rut = "rut";
        assertEquals(rut,vendedor.getRut());
    }

    @Test
    void setEdad() {
        int edad = 20;
        vendedor.setEdad(edad);
        assertEquals(edad,vendedor.getEdad());
    }

    @Test
    void getEdad() {
        int edad = 12;
        assertEquals(edad,vendedor.getEdad());
    }

    @Test
    void getVentas() {
        assertEquals(0,vendedor.getVentas());
    }

    @Test
    void setNombre() {
        String nombre = "ajjajs";
        vendedor.setNombre(nombre);
        assertEquals(nombre,vendedor.getNombre());

    }

    @Test
    void setRut() {
        String rut = "131324255";
        vendedor.setRut(rut);
        assertEquals(rut,vendedor.getRut());
    }

    @Test
    void setVentas() {
        int ventas = 232;
        vendedor.setVentas(ventas);
        assertEquals(ventas,vendedor.getVentas());
    }


}