package sg.edu.rp.c346.learnwithme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button colBtn, alpBtn, numBtn, shapBtn, frutBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colBtn = findViewById(R.id.colorButton);
        alpBtn = findViewById(R.id.alphaButton);
        numBtn = findViewById(R.id.numButton);
        shapBtn = findViewById(R.id.shapeButton);
        frutBtn =findViewById(R.id.fruitButton);

        colBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNewAct = new Intent(getBaseContext(), ColorActivity.class);
                startActivity(intentNewAct);


            }
        });

        alpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNewAct = new Intent(getBaseContext(), AlphaActivity.class);
                startActivity(intentNewAct);


            }
        });

        numBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNewAct = new Intent(getBaseContext(), NumberActivity.class);
                startActivity(intentNewAct);


            }
        });

        shapBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNewAct = new Intent(getBaseContext(), ShapeActivity.class);
                startActivity(intentNewAct);


            }
        });

        frutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentNewAct = new Intent(getBaseContext(), FruitActivity.class);
                startActivity(intentNewAct);


            }
        });
    }
}
