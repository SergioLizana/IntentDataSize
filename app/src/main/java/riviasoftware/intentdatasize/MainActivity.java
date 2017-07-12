package riviasoftware.intentdatasize;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button boton = (Button) findViewById(R.id.button);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(),"El tamaño a enviar es: "+31457280,Toast.LENGTH_SHORT).show();

                DataPerfomance datos = DataPerfomance.getInstance();
                    /* 30MB Size */
                datos.putExtra("megabytes", new byte[31457280]);

                startActivity(new Intent(MainActivity.this, Intent2.class));
            }
        });

        Button botonIntent = (Button) findViewById(R.id.passIntent);
        botonIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Intent2.class);
                intent.putExtra("megabytes",new byte[31457280]);
                startActivity(intent);
            }
        });





    }
}
