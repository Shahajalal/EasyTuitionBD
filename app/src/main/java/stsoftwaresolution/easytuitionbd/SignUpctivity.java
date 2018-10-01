package stsoftwaresolution.easytuitionbd;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SignUpctivity extends AppCompatActivity {

    private Spinner varsityspinner;
    private String spin2;
    private static final String[] paths1 = {"KU", "KUET", "NWU","BL","SUNDARBAN"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_layout);
        varsityspinner=findViewById(R.id.spinnerforchoosevarsity);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, paths1);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        varsityspinner.setAdapter(adapter);
        varsityspinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:

                        spin2=paths1[0];
                        break;
                    case 1:

                        spin2=paths1[1];
                        break;
                    case 2:

                        spin2=paths1[2];
                        break;
                    case 3:

                        spin2=paths1[3];
                        break;
                    case 4:

                        spin2=paths1[4];
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                spin2=paths1[0];

            }
        });
    }
}
