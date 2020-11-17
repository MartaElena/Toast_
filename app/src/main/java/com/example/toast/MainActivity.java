package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void miOnClick(View view) {
        //1º NECESITAMOS UN  OBJETO DE TIPO TOAST QUE SERÁ LO QUE MOSTREMOS EN PANTALLA
        Toast toast = new Toast(this);

        //Tenemos que tener definido un layout, en un archivo independiente, con los componentes/views que queremos mostrar en el toast

        // 2º Por estar el contenido del toast en un fichero XML lo tenemos que INFLAR (lo voy a hacer en un paso más que en clase) y asignarlo al TOAST

        /*2.1 Creamos un INFLADOR. Será una instancia de un archivo XML de diseño de los objetos de vista (componentes) correspondientes--> Objeto de tipo LayoutInflater.
           Nunca se utiliza directamente. Se asignará posteriormente el layout diseñado para mostrar en el toast (toast.xml) */

        LayoutInflater infladorXML = getLayoutInflater();

        /* 2.2. Inflamos  el inflador con el archivo XML donde hemos diseñado el interfaz para el toast (toast) y la vista asociada al layout,
         Buscamos el layout por id, siendo en nuestro caso el id "lytLayout". Nos devuelve una vista --> View. */
        View toast_layout = infladorXML.inflate(R.layout.toast, (ViewGroup) findViewById(R.id.lytLayout));

        //2.3 Asignar la vista creada al toast
        toast.setView(toast_layout);


        // 3º CONFIGURAMOS EL TOAST COMO SIEMPRE
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.TOP,300,100);
        toast.show();
    }
}