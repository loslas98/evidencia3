import java.util.InputMismatchException;
import java.util.Scanner;

public class VendedorSopaipas {
    private String nombre;
    private String rut;
    private int edad;
    private int ventas;

    public VendedorSopaipas(String nombre, String rut,int edad) {
        this.nombre = nombre;
        this.rut = rut;
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }



    public String getRut() {
        return rut;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public int getVentas() {
        return ventas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setVentas(int ventas) {
        this.ventas = ventas;
    }
    public void venta(){
        System.out.println("se agregó una venta");
        this.ventas=ventas+1;
        darVuelto();
    }

    public int darVuelto(){
        int pago = ingresarPago();
        int vuelto = pago-250;
        System.out.println("su vuelto: "+vuelto);
        return vuelto;

    }

    public int ingresarPago(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el monto de pago");
        return validarMonto();

    }
    public int validarMonto(){
        Scanner teclado = new Scanner(System.in);
        int cifra;
        try {
            cifra =teclado.nextInt();

        }catch (InputMismatchException e){
            System.out.println("error, no ingreso un monto");
            return 0;


        }
        return cifra;

    }

    @Override
    public String toString() {
        return "VendedorSopaipas{" +
                "nombre=" + nombre  +
                ", rut=" + rut +
                ", edad=" + edad +
                ", ventas=" + ventas +
                '}';
    }
}
