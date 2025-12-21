package proyecto.unmatched;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SetAdapter extends RecyclerView.Adapter<SetAdapter.MyViewHolder> {
    //MyData es la clase que vamos a tratar
    private List<Set> dataList;

    public SetAdapter(List<Set> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.set_layout, parent, false);
        return new SetAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Set set = dataList.get(position);
        holder.nombre.setText(set.getNombre());
        holder.personajes.setText(set.getPersonajes());
        holder.switch_rv.setChecked(set.isActivo());
        holder.switch_rv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                set.setActivo(holder.switch_rv.isChecked());
                for (int i = 0; i < set.size(); i++) {
                    set.get(i).setActivo(holder.switch_rv.isChecked());
                    notifyDataSetChanged();

                }
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
        TextView personajes;
        Switch switch_rv;

        MyViewHolder(View itemView) {
            super(itemView);
            //Los cargamos
            nombre = itemView.findViewById(R.id.nombre_rv_set);
            switch_rv = itemView.findViewById(R.id.rv_switch_set);
            personajes = itemView.findViewById(R.id.rv_set_personajes);

        }
    }
}
