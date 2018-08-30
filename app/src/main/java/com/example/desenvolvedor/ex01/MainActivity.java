package com.example.desenvolvedor.ex01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Spinner jspOperacoes;
    RadioGroup jrdg1;
    RadioButton jrdbOpcao1,jrdbOpcao2,jrdbOpcao3,jrdbOpcao4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        metodoSpin();
        metodoGroup();
    }


    private void metodoGroup(){
        jrdg1=findViewById(R.id.rdgBotoes);
        jrdbOpcao1=findViewById(R.id.rdbOpcao1);
        jrdbOpcao2=findViewById(R.id.rdbOpcao2);
        jrdbOpcao3=findViewById(R.id.rdbOpcao3);
        jrdbOpcao4=findViewById(R.id.rdbOpcao4);

        jrdg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if(jrdbOpcao1.isChecked()){
                    Toast.makeText(getApplicationContext(),"opcao1",Toast.LENGTH_SHORT).show();
                }else if(jrdbOpcao2.isChecked()){
                    Toast.makeText(getApplicationContext(),"opcao2",Toast.LENGTH_SHORT).show();
                }else if(jrdbOpcao3.isChecked()){
                    Toast.makeText(getApplicationContext(),"opcao3",Toast.LENGTH_SHORT).show();
                }else if(jrdbOpcao4.isChecked()){
                    Toast.makeText(getApplicationContext(),"opcao4",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void metodoSpin(){
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
