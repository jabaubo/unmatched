package proyecto.unmatched.ui.dialogs;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.io.File;
import java.util.ArrayList;

import proyecto.unmatched.Controlador;
import proyecto.unmatched.Mapa;
import proyecto.unmatched.R;

public class MapDialog extends DialogFragment {

    private int jugadores = 0;

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(getActivity());
        View view = LayoutInflater.from(this.getContext()).inflate(R.layout.mapa_dialog,null);
        Controlador controlador = new Controlador();
        ImageView imageView = view.findViewById(R.id.imgMapa);
        TextView textView = view.findViewById(R.id.nombreMapa);
        if (jugadores == 2){
        /*    int[] lista = new int[4];
            lista[0] = 0;
            lista[1] = 0;
            lista[2] = 0;
            lista[3] = 0;
            for (int i = 0 ; i < 10000 ; i++){
                int position = (int) (Math.random()*lista.length);
                lista[position] = lista[position]+1;
            }
            System.out.println(lista[0]);
            System.out.println(lista[1]);
            System.out.println(lista[2]);
            System.out.println(lista[3]);
*/
            int mapa=(int) (Math.random()*controlador.getMapas2Jugadores().size());
            imageView.setImageResource(controlador.getMapas2Jugadores().get(mapa).getFileName());
            textView.setText(controlador.getMapas2Jugadores().get(mapa).getNombre());
        }
        else {
            int mapa=(int) (Math.random()*controlador.getMapas4Jugadores().size());
            imageView.setImageResource(controlador.getMapas4Jugadores().get(mapa).getFileName());
            textView.setText(controlador.getMapas4Jugadores().get(mapa).getNombre());

        }
        alertDialogBuilder.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Acción cuando el usuario presiona "Aceptar"
                // Aquí puedes poner el código que desees ejecutar al presionar el botón
            }
        });

        alertDialogBuilder.setView(view);

        return alertDialogBuilder.create();
    }

    public MapDialog(int jugadores) {
        this.jugadores = jugadores;
    }
}
