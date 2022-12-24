package Adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.tareavolley1.R;

import java.util.List;

import Modelos.Producto;

public class ProductoAdapter extends RecyclerView.Adapter<ProductoAdapter.ProductoViewHolder> {
    private Context Ctx;
    private List<Producto> lstproductos;

    public ProductoAdapter(Context mCtx, List<Producto> productos) {
        this.lstproductos = productos;
        Ctx = mCtx;
    }

    @Override
    public ProductoAdapter.ProductoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //inflating and returning our view holder
        LayoutInflater inflater = LayoutInflater.from(Ctx);
        View view = inflater.inflate(R.layout.ly_productos, null);
        return new ProductoAdapter.ProductoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ProductoAdapter.ProductoViewHolder holder, int position) {
        Producto producto = lstproductos.get(position);

        holder.lblidproducto.setText(producto.getIdproducto());
        holder.lbldescrip.setText(producto.getDescrip());
        holder.lblcosto.setText(producto.getCosto());
        holder.lblprecunidad.setText(producto.getPreciouni());
        holder.lbldescuento.setText(producto.getDescuento());


    }

    @Override
    public int getItemCount() {
        return lstproductos.size();
    }

    class ProductoViewHolder extends RecyclerView.ViewHolder {
        TextView lblidproducto, lbldescrip, lblcosto, lblprecunidad, lbldescuento;
        public ProductoViewHolder(View itemView) {
            super(itemView);
            lblidproducto = itemView.findViewById(R.id.lblidproducto);
            lbldescrip = itemView.findViewById(R.id.lbldescrip);
            lblcosto = itemView.findViewById(R.id.lblcosto);
            lblprecunidad = itemView.findViewById(R.id.lblprecunidad);
            lbldescuento = itemView.findViewById(R.id.lbldescuento);
        }
    }
}
