
package herencia.zapateria;

/**
 *
 * @author Albertazo
 */

public class Casual {
    private String marca, modelo, material;
    private double talla, precio;

    public Casual(String marca, String modelo, String material, double talla, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.material = material;
        this.talla = talla;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "\nCasual{" + "marca=" + marca + ", modelo=" + modelo + ", material=" + material + ", talla=" + talla + ", precio=" + precio + '}';
    }
    
    
}
