package mx.ita.callejondelartesano;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.security.Principal;

public class IniciarSesion extends AppCompatActivity {
    public Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);

        button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrancarInicioSesion();
            }
        });
    }
    public void ArrancarInicioSesion(){
        Intent intent = new Intent(this, PantallaPrincipal.class);
        startActivity(intent);
    }
}