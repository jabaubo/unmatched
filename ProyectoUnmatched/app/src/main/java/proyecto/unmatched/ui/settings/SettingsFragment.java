package proyecto.unmatched.ui.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import proyecto.unmatched.Controlador;
import proyecto.unmatched.MainActivity;
import proyecto.unmatched.ModificadorAdapter;
import proyecto.unmatched.PersonajeAdapter;
import proyecto.unmatched.SetAdapter;
import proyecto.unmatched.databinding.FragmentSettingsBinding;

public class SettingsFragment extends Fragment {

    private FragmentSettingsBinding binding;
    private RecyclerView rv;
    private String modo = "Personajes";
    private Button btPersonajes;
    private Button btSets;
    private Button btModificador;
    private Controlador controlador;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        controlador = ((MainActivity)getActivity()).getControlador();
        binding = FragmentSettingsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        btSets = binding.btSettingsSet;
        btPersonajes = binding.btSettingsPersonajes;
        btModificador = binding.btSettingsEfectos;

        rv = binding.rvSettings;
        btPersonajes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                modo = "Personajes";
                cambiarRV();
            }
        });
        btSets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                modo = "Sets";
                cambiarRV();
            }
        });
        btModificador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                modo = "Efectos";
                cambiarRV();
            }
        });
        cambiarRV();
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
    public static void clickAdd(){

    }

    public void cambiarRV(){
        switch (modo){
            case "Personajes":
                PersonajeAdapter adapter = new PersonajeAdapter(controlador.getPersonajesCompleto());
                rv.setAdapter(adapter);
                btPersonajes.setEnabled(false);
                btSets.setEnabled(true);
                btModificador.setEnabled(true);
                break;
            case "Sets":
                SetAdapter setAdapter = new SetAdapter(controlador.getSets());
                rv.setAdapter(setAdapter);
                btPersonajes.setEnabled(true);
                btSets.setEnabled(false);
                btModificador.setEnabled(true);

                break;
            case "Efectos":
                ModificadorAdapter modificadorAdapter = new ModificadorAdapter(controlador.getModificadorPartidasCompleto(),getView());
                rv.setAdapter(modificadorAdapter);
                btPersonajes.setEnabled(true);
                btSets.setEnabled(true);
                btModificador.setEnabled(false);
                break;
        }
        rv.setLayoutManager(new LinearLayoutManager(this.getContext()));
    }
}