package br.com.digitalhouse.constraintlayoutexercicio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText mProduto;
    EditText mPreco;
    EditText mDesconto;
    Button mCalcular;
    int porcentagem;
    int precoDoProduto;
    int resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mProduto = findViewById(R.id.nome_do_produto);
        mPreco = findViewById(R.id.preco_do_produto);
        mDesconto = findViewById(R.id.porcentagem_do_produto);
        mCalcular = findViewById(R.id.valor_total_btn);


        mCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                porcentagem = Integer.parseInt(mDesconto.getText().toString());
                precoDoProduto = Integer.parseInt(mPreco.getText().toString());
                resultado = (porcentagem * precoDoProduto) / 100;
                Toast.makeText(MainActivity.this, "O seu valor final  com desconto é: " + resultado, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
