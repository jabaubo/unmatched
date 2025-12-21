package proyecto.unmatched.ui.caos;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;

import proyecto.unmatched.Controlador;
import proyecto.unmatched.MainActivity;
import proyecto.unmatched.ModificadorPartida;
import proyecto.unmatched.PersonajeAdapter;
import proyecto.unmatched.SetAdapter;
import proyecto.unmatched.databinding.FragmentCaosBinding;
import proyecto.unmatched.databinding.FragmentSettingsBinding;

public class CaosFragment extends Fragment {

    private FragmentCaosBinding binding;

    private Button btModificadorPartida;
    private TextView tvNombreModificador;
    private TextView tvEfectoModificador;
    private int numeroDeCaos;
    private ArrayList<ModificadorPartida> modificadores;
    private ArrayList<ModificadorPartida> modificadoresSecretos;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        modificadores = ((MainActivity)getActivity()).getControlador().getModificadores();
        modificadoresSecretos = ((MainActivity)getActivity()).getControlador().getModificadorSecreto();
        binding = FragmentCaosBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        tvNombreModificador =binding.tvModificadorPartida;
        tvEfectoModificador= binding.tvEfectoModificador;
        btModificadorPartida = binding.bRollModificadorPartida;
        btModificadorPartida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickRoll();
            }
        });
        numeroDeCaos = 0;
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
    public void clickRoll(){
        if (tvNombreModificador.getText().toString().contains("Modificador sorpresa")){
            int numero = (int) (Math.random()*modificadoresSecretos.size());
            ModificadorPartida modificadorPartida= modificadoresSecretos.get(numero);
            tvEfectoModificador.setText(modificadorPartida.getEfecto());
            tvNombreModificador.setText("T" + numeroDeCaos + " " + modificadorPartida.getNombre());
        }
        else{
            numeroDeCaos++;
            int numero = (int) (Math.random()*modificadores.size());
            ModificadorPartida modificadorPartida= modificadores.get(numero);
            tvEfectoModificador.setText(modificadorPartida.getEfecto());
            tvNombreModificador.setText("T" + numeroDeCaos + " " + modificadorPartida.getNombre());
        }

    }

}