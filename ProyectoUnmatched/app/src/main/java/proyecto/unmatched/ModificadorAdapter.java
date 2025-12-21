package proyecto.unmatched;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import proyecto.unmatched.ui.dialogs.MapDialog;

public class ModificadorAdapter extends RecyclerView.Adapter<ModificadorAdapter.MyViewHolder> {
    private List<ModificadorPartida> dataList;
    private View view;

    public ModificadorAdapter(List<ModificadorPartida> dataList,View view) {
        this.dataList = dataList;
        this.view = view;
    }

    @NonNull
    public ModificadorAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.personaje_layout, parent, false);
        return new ModificadorAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ModificadorAdapter.MyViewHolder holder, int position) {
        ModificadorPartida data = dataList.get(position);
        holder.nombre.setText(data.getNombre());
        holder.nombre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setTitle(data.getNombre())
                        .setMessage(data.getEfecto())
                        .setPositiveButton("Aceptar", null);

                // Crear y mostrar el AlertDialog

                AlertDialog dialog = builder.create();
                dialog.show();
            }
        });
        holder.tier.setText("");
        holder.switch_rv.setChecked(data.getActivo());
        holder.switch_rv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setActivo(holder.switch_rv.isChecked());
                notifyDataSetChanged();

            }
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    static class MyViewHolder extends RecyclerView.ViewHolder {
        //Creamos los objetos de los campos
        TextView nombre;
        TextView tier;
        Switch switch_rv;

        MyViewHolder(View itemView) {
            super(itemView);
            //Los cargamos
            nombre = itemView.findViewById(R.id.nombre_rv);
            tier = itemView.findViewById(R.id.rv_tier);
            switch_rv = itemView.findViewById(R.id.rv_switch);

        }
    }
}
