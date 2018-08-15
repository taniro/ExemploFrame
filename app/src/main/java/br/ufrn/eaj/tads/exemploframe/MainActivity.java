package br.ufrn.eaj.tads.exemploframe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickbotao (View v){
        View barra = findViewById(R.id.barra);
        barra.setVisibility(View.VISIBLE);

        v.setVisibility(View.INVISIBLE);
    }
}
