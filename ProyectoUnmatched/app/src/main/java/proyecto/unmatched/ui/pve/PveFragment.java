package proyecto.unmatched.ui.pve;

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

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

import proyecto.unmatched.Controlador;
import proyecto.unmatched.Jefe;
import proyecto.unmatched.Personaje;
import proyecto.unmatched.Villano;
import proyecto.unmatched.databinding.FragmentPveBinding;
import proyecto.unmatched.databinding.FragmentPvpBinding;

public class PveFragment extends Fragment {

    private FragmentPveBinding binding;

    EditText etJugadores;
    Switch sTiers;
    Spinner spTiers;
    Button boton;
    Controlador controlador= new Controlador();
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        binding = FragmentPveBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        etJugadores = binding.etJugadoresPVE;
        sTiers = binding.sTiersPve;
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
            ArrayList<Personaje> listadoPersonajes = new ArrayList<>();
            ArrayList<Villano> listadoVillanos = controlador.getVillanos();
            ArrayList<Jefe> listadoJefes = controlador.getJefes();
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
                    Jefe jefe = listadoJefes.get((int) (Math.random() * listadoJefes.size()));
                    ArrayList<Villano> villanos = new ArrayList<>();
                    for (int i = 0 ; i < jugadores ; i++){
                        boolean completado = false;
                        while (!completado) {
                            int personaje = (int) (Math.random() * listadoPersonajes.size());
                            if (!personajes.contains(listadoPersonajes.get(personaje))) {
                                personajes.add(listadoPersonajes.get(personaje));
                                completado = true;
                            }
                        }completado = false;
                        while (!completado) {
                            int personaje = (int) (Math.random() * listadoVillanos.size());
                            if (!villanos.contains(listadoVillanos.get(personaje))) {
                                villanos.add(listadoVillanos.get(personaje));
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
                    for (int i = 0 ; i <personajes.size() ; i++){
                        pelea += personajes.get(i).getNombre() + "\n";
                    }
                    pelea += String.format("\nVS\n\n%s\n\n",jefe.getNombre());
                    for (int i = 0 ; i <villanos.size() ; i++){
                        pelea += villanos.get(i).getNombre() + "\n";
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
    public void checkTier(){
        spTiers.setEnabled(sTiers.isChecked());
    }

}