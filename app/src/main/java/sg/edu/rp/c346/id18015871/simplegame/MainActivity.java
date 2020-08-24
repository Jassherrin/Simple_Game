package sg.edu.rp.c346.id18015871.simplegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnAtk;
    Button btnES;
    Button btnHC;
    TextView lv;
    TextView hp;
    TextView atk;
    TextView spd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAtk = findViewById(R.id.buttonAtk);
        btnES = findViewById(R.id.buttonEstats);
        btnHC = findViewById(R.id.buttonHitChance);
        lv = findViewById(R.id.textViewLv);
        hp=findViewById(R.id.textViewhp);
        atk=findViewById(R.id.textViewAtk);
        spd=findViewById(R.id.textViewSpd);




       int level = 1;
       lv.setText(level);
       int yourHealthPoint = 536;
       hp.setText(yourHealthPoint);
       int yourAttack=400;
       atk.setText(yourAttack);
       int yourSpeed=999;
       spd.setText(yourSpeed);

        btnAtk.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
          //   level++;


            }
        });





    }
}