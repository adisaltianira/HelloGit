package id.sch.smktelkom_mlg.learn.hellodebuglog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tvHello = null;
        TextView tvDua;

        tvHello = findViewById(R.id.textViewHello);
        tvDua = findViewById(R.id.textViewDua);

        Log.d("COBADEBUG", "tvHello: " + tvHello);
        Log.d("COBADEBUG", "onCreate: tvDua " + tvDua);


        tvHello.setText("Ini Hello " + tvDua.getText());
    }
}
