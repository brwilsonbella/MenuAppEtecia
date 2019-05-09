package br.com.etecia.menuappetecia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.idToolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Criando Menu");
        getSupportActionBar().setIcon(R.drawable.ic_arrow_dp);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_principal, menu);


        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.mcompartilhar:
                Toast.makeText(getApplicationContext(), "compartilhar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mconfigurações:
                Toast.makeText(getApplicationContext(), "configurações", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mfavoritos:
                Toast.makeText(getApplicationContext(), "favoritos", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mpesquisar:
                Toast.makeText(getApplicationContext(), "pesquisar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.msalvos:
                Toast.makeText(getApplicationContext(), "salvos", Toast.LENGTH_SHORT).show();
                break;
            case R.id.msobre:
                Toast.makeText(getApplicationContext(), "sobre", Toast.LENGTH_SHORT).show();
                break;


        }
        return super.onOptionsItemSelected(item);
    }

  
}


