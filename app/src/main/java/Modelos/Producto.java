package Modelos;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Producto {
    private String idproducto;
    private String descrip;
    private String costo;
    private String preciouni;
    private String descuento;

    public String getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getPreciouni() {
        return preciouni;
    }

    public void setPreciouni(String preciouni) {
        this.preciouni = preciouni;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }


    public Producto(JSONObject a) throws JSONException {
        idproducto = "Id Producto: " + a.getString("id").toString();
        descrip = "Descripcion: " + a.getString("descripcion").toString() ;
        costo = "Valor: " + "$"+a.getString("costo").toString() ;
        preciouni = "Precio Unitario: " + "$"+a.getString("precio_unidad").toString() ;
        descuento = "Descuento: " + "$"+a.getString("descuento").toString() ;
    }


    public static ArrayList<Producto> JsonObjectsBuild(JSONArray productos) throws JSONException {
        ArrayList<Producto> productoslist = new ArrayList<>();

        for (int i = 0; i < productos.length(); i++) {
            productoslist.add(new Producto(productos.getJSONObject(i)));
        }
        return productoslist;
    }
}
