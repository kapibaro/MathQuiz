package janik.kacper.mathquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Button gobacktommbutton = (Button) findViewById(R.id.gobacktommbutton);
        gobacktommbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent youloseIntent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(youloseIntent);
            }
        });
    }
}
