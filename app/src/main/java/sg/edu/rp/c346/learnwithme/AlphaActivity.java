package sg.edu.rp.c346.learnwithme;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class AlphaActivity extends AppCompatActivity implements View.OnClickListener{


    ViewFlipper viewFlipper;
    Button next;
    Button previous;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alpha);
        viewFlipper = (ViewFlipper)findViewById(R.id.viewFlipper);
        next=(Button)findViewById(R.id.next);
        previous=(Button)findViewById(R.id.previous);

        next.setOnClickListener(this);
        previous.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        if(v==next)
        {
            viewFlipper.showNext();

        }

        else if (v==previous)
        {
            viewFlipper.showPrevious();
        }
    }
}
