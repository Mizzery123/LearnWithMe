package sg.edu.rp.c346.learnwithme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class ShapeActivity extends AppCompatActivity {

    ImageView ivMask;
    ImageButton btnSqu, btnRec, btnCir, btnTri, btnSta, btnHea, btnDia;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shape);

        ivMask = findViewById(R.id.mask);
        btnSqu = findViewById(R.id.sq);
        btnRec = findViewById(R.id.rec);
        btnCir = findViewById(R.id.cir);
        btnTri = findViewById(R.id.tri);
        btnSta = findViewById(R.id.sta);
        btnHea = findViewById(R.id.hea);
        btnDia = findViewById(R.id.dia);

        tv =findViewById(R.id.textView);

        btnSqu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ivMask.setImageResource(R.drawable.squ);
                tv.setText("Square");
            }
        });

        btnRec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ivMask.setImageResource(R.drawable.rec);
                tv.setText("Rectangle");
            }
        });

        btnCir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ivMask.setImageResource(R.drawable.cir);
                tv.setText("Circle");
            }
        });

        btnTri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ivMask.setImageResource(R.drawable.tri);
                tv.setText("Triangle");
            }
        });

        btnSta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ivMask.setImageResource(R.drawable.star);
                tv.setText("Star");
            }
        });

        btnHea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ivMask.setImageResource(R.drawable.heart);
                tv.setText("Heart");
            }
        });

        btnDia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                ivMask.setImageResource(R.drawable.dia);
                tv.setText("Diamond");
            }
        });


    }
}
