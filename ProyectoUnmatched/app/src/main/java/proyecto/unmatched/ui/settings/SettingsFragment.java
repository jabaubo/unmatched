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
import proyecto.unmatched.PersonajeAdapter;
import proyecto.unmatched.databinding.FragmentSettingsBinding;

public class SettingsFragment extends Fragment {

    private FragmentSettingsBinding binding;
    private RecyclerView rv;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentSettingsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Controlador controlador = ((MainActivity)getActivity()).getControlador();
        PersonajeAdapter adapter = new PersonajeAdapter(controlador.getPersonajesCompleto());
        rv = binding.rvSettings;
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(this.getContext()));

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
    public static void clickAdd(){

    }
}