/*
 * L — Liskov substitution principle (Principio de sustitución de Liskov) 
 */
package paquete06l;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        TarjetaCredito visa1 = new TarjetaCredito();
        visa1.establecerNombre("Visa");
        visa1.establecerNumero("110011001");
        Banco banco1 = new Banco("Loja");
        visa1.establecerNumero("110011001");
        visa1.establecerBanco(banco1);
        MayorEdad representante = new MayorEdad("José", visa1);

        MenorEdad menor = new MenorEdad("Felipe", representante);

        System.out.printf("Nombre:%s - Tarjeta:%s - Banco: %s\n",
                menor.obtenerNombre(),
                menor.obtenerRepresentante().obtenerTarjeta().obtenerNumero(),
                menor.obtenerRepresentante().obtenerTarjeta().obtenerBanco().obtenerNombre()
        );

    }
}
