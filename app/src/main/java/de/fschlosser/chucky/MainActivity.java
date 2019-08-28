package de.fschlosser.chucky;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button zufallsSpruchButton;
    private TextView spruchTextView;
    private String[] sprueche;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sprueche = getResources().getStringArray(R.array.chucky_sprueche);

        zufallsSpruchButton = findViewById(R.id.zufalls_spruch_button);
        spruchTextView = findViewById(R.id.spruch_text_view);
    }

    @Override
    public void onClick(View view) {
        if (view == zufallsSpruchButton){
            zeigeZufallsSpruch();
        }
    }

    private void zeigeZufallsSpruch(){
        int zufallsZahl = new Random().nextInt(sprueche.length - 1);
        spruchTextView.setText(sprueche[zufallsZahl]);
    }
}
