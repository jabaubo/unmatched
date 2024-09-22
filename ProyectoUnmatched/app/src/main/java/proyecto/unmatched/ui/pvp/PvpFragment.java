package proyecto.unmatched.ui.pvp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import java.util.ArrayList;

import proyecto.unmatched.Controlador;
import proyecto.unmatched.Personaje;
import proyecto.unmatched.databinding.FragmentHomeBinding;
import proyecto.unmatched.databinding.FragmentPvpBinding;
import proyecto.unmatched.ui.home.HomeViewModel;

public class PvpFragment extends Fragment {

    private FragmentPvpBinding binding;

    EditText etJugadores;
    EditText etEquipos;
    Switch sEquipos;
    Switch sTiers;
    Spinner spTiers;
    Button boton;
    Controlador controlador= new Controlador();
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentPvpBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        etJugadores = binding.etJugadoresPVP;
        sEquipos = binding.sEquiposPVP;
        sTiers = binding.sTiersPvp;
        boton = binding.bPVP;
        spTiers = binding.spinner;

        String[] tiers = {"S","A","B","C","D"};
        ArrayAdapter<String> tiersAdapter = new ArrayAdapter<>(this.getContext(),android.R.layout.simple_spinner_dropdown_item,tiers);
        spTiers.setAdapter(tiersAdapter);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickBoton();
            }
        });
        sTiers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkTier();
            }
        });
        checkTier();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
    public void clickBoton(){
        int jugadores = Integer.valueOf(etJugadores.getText().toString());
        System.out.println("Click");
        if (sEquipos.isChecked() && (jugadores%2!=0)){
            AlertDialog.Builder builder = new AlertDialog.Builder(getView().getContext());
            builder.setTitle("Advertencia")
                    .setMessage("El número de jugadores debe ser par para el juego por equipos")
                    .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            // Acción cuando se hace clic en "Aceptar"
                        }
                    })
                    .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            // Acción cuando se hace clic en "Cancelar"
                        }
                    });
            AlertDialog dialog = builder.create();
            dialog.show();

        }
        else {
            ArrayList<Personaje> listadoPersonajes = new ArrayList<>();
            if (sTiers.isChecked()){
                switch (spTiers.getSelectedItem().toString()){
                    case "S":
                        listadoPersonajes = controlador.getPersonajesTierS();
                        System.out.println(listadoPersonajes.size());
                        break;
                    case "A":
                        listadoPersonajes = controlador.getPersonajesTierA();
                        break;
                    case "B":
                        listadoPersonajes = controlador.getPersonajesTierB();
                        break;
                    case "C":
                        listadoPersonajes = controlador.getPersonajesTierC();
                        break;
                    case "D":
                        listadoPersonajes = controlador.getPersonajesTierD();
                }
            }
            else {
                listadoPersonajes = controlador.getPersonajes();
            }
            if (listadoPersonajes.size() < jugadores){
                AlertDialog.Builder builder = new AlertDialog.Builder(getView().getContext());
                builder.setTitle("Error")
                        .setMessage("No hay suficientes personajes")
                        .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // Acción cuando se hace clic en "Aceptar"
                            }
                        })
                        .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                // Acción cuando se hace clic en "Cancelar"
                            }
                        });
                AlertDialog dialog = builder.create();
                dialog.show();
            }
            else{
                if (jugadores > 0 ){
                    ArrayList<Personaje> personajes = new ArrayList<>();
                    for (int i = 0 ; i < jugadores ; i++){
                        boolean completado = false;
                        while (!completado) {
                            int personaje = (int) (Math.random() * listadoPersonajes.size());
                            if (!personajes.contains(listadoPersonajes.get(personaje))) {
                                personajes.add(listadoPersonajes.get(personaje));
                                completado = true;
                            }
                        }
                    }
                    System.out.println("------------------------------------");
                    for (int i = 0 ; i < personajes.size() ; i++){
                        System.out.println(personajes.get(i));
                    }
                    System.out.println("------------------------------------");
                    String pelea="";
                    if (sEquipos.isChecked()){
                        pelea = "";
                        for (int i = 0 ; i <personajes.size()/2 ; i++){
                            pelea += personajes.get(i).getNombre() + "\n";
                        }
                        pelea +="\nVS\n\n";
                        for (int i = personajes.size()/2 ; i <personajes.size() ; i++){
                            pelea += personajes.get(i).getNombre() + "\n";
                        }
                    }
                    else {
                        for (int i = 0 ; i <personajes.size() ; i++){
                            pelea += personajes.get(i).getNombre() + "\n";
                        }
                    }
                    AlertDialog.Builder builder = new AlertDialog.Builder(getView().getContext());
                    builder.setTitle("Pelea")
                            .setMessage(pelea)
                            .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    // Acción cuando se hace clic en "Aceptar"
                                }
                            })
                            .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    // Acción cuando se hace clic en "Cancelar"
                                }
                            });

                    // Crear y mostrar el AlertDialog
                    AlertDialog dialog = builder.create();
                    dialog.show();

                }
            }

        }

    }
    public void checkTier(){
        spTiers.setEnabled(sTiers.isChecked());
    }

}