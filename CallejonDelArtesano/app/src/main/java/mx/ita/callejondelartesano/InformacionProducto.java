package mx.ita.callejondelartesano;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.navigation.NavigationView;

public class InformacionProducto extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbarNav;
    public Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion_producto);
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        toolbarNav = findViewById(R.id.toolbar);

        setSupportActionBar(toolbarNav);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbarNav,R.string.navigation_drawer_open,R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrancarPreVenta();
            }
        });
    }
    public void ArrancarPreVenta(){
        Intent intent = new Intent(this, PantallaPreVenta.class);
        startActivity(intent);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_search:
                Intent intent = new Intent(this, PantallaBusqueda.class);
                startActivity(intent);
                break;
            case R.id.nav_carrito:
                intent = new Intent(this, PantallaCarrito.class);
                startActivity(intent);
                break;
            case R.id.nav_home:
                intent = new Intent(this, PantallaPrincipal.class);
                startActivity(intent);
                break;
            case R.id.nab_nosotrs:
                intent = new Intent(this, PantallaSobreNosotros.class);
                startActivity(intent);
                break;
            case R.id.nav_pedidos:
                intent = new Intent(this, PantallaPedidos.class);
                startActivity(intent);
                break;
            case R.id.nav_promociones:
                intent = new Intent(this, PantallaArticulosDestacados.class);
                startActivity(intent);
                break;
            case R.id.nav_formas_pago:
                intent = new Intent(this, PantallaTiposDePagos.class);
                startActivity(intent);
                break;
        }
        return true;
    }
}