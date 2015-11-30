package es.santosgarcia.caperucita_santos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Pantalla1 extends AppCompatActivity {

    private ImageView img;
    private TextView txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla1);
        img = (ImageView)findViewById(R.id.imgprincipal);
        txt = (TextView)findViewById(R.id.textoprincipal);

    }

    int contador = 0;

    public void opciona(View view){
        contador++;
        if (contador==1){

        }
        img.setImageResource(R.drawable.imagen2);
        txt.setText(R.string.texto2);
    }

    public void opcionb(View view){
        img.setImageResource(R.drawable.imagen3);
        txt.setText(R.string.texto3);

    }
}
