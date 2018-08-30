package com.example.desenvolvedor.ex01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Spinner jspOperacoes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jspOperacoes=(Spinner)findViewById(R.id.spinnerOperacoes);
        jspOperacoes.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Integer opcao = (int) jspOperacoes.getSelectedItemId();

                if(opcao ==0){
                    Toast.makeText(getApplicationContext(),"somar",Toast.LENGTH_LONG).show();
                }else if(opcao ==1){
                    Toast.makeText(getApplicationContext(),"subtrair",Toast.LENGTH_LONG).show();
                }
            }
            public void onNothingSelected(AdapterView<?> parent){

            }
        });
    }
}
