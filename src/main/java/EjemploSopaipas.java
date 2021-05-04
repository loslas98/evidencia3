public class EjemploSopaipas {
    public static void main(String[] args){
        VendedorSopaipas miVendedor = new VendedorSopaipas("yajirobe","123456788",23);
        System.out.println(miVendedor);
        miVendedor.setVentas(10);
        miVendedor.setEdad(24);
        miVendedor.setNombre("goku");
        System.out.println(miVendedor);
        miVendedor.venta();
        System.out.println(miVendedor);

    }
}
