package proyecto.unmatched;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PersonajeAdapter extends RecyclerView.Adapter<PersonajeAdapter.MyViewHolder> {
    private List<Personaje> dataList;

    public PersonajeAdapter(List<Personaje> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.personaje_layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Personaje data = dataList.get(position);
        holder.nombre.setText(data.getNombre());
        holder.tier.setText(data.getTier());
        holder.switch_rv.setChecked(data.isActivo());
        holder.switch_rv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.setActivo(holder.switch_rv.isChecked());
                System.out.println(data.isActivo());
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
