package es.santosgarcia.caperucita_santos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class Battle1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle1);
        TextView resu = (TextView)findViewById(R.id.resultbattle);
    }

    public void rollingdice(View view){

        Random rand = new Random();
        int n = rand.nextInt(10);


    }
}
