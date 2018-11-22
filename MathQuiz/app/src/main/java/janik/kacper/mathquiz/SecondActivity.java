package janik.kacper.mathquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //Find components
        TextView textViewInstruction = (TextView) findViewById(R.id.textViewInstruction);
        Button buttonConfirm = (Button) findViewById(R.id.buttonConfirm);
        final EditText editTextResult = (EditText) findViewById(R.id.editTextResult);

        //Chose operation
        int mathOperation = RandomNumbers.num(3);
        switch (mathOperation) {
            case 1:
                final int num1 = RandomNumbers.num(200);
                final int num2 = RandomNumbers.num(200);
                textViewInstruction.setText(num1 + getString(R.string.add) + num2); // Set to textView to mathematical operation

                buttonConfirm.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String seditTextResult = editTextResult.getText().toString();

                        if (seditTextResult != null && !seditTextResult.isEmpty()) { // Check if string is empty, if is do nothing

                            int intfromedittext = new Integer(seditTextResult).intValue(); //Change input to an int variable
                            int result = num1 + num2;

                            if (intfromedittext == result) {
                                Intent continueIntent = new Intent(getApplicationContext(), SecondActivity.class);
                                startActivity(continueIntent);
                            } else {
                                Intent loseIntent = new Intent(getApplicationContext(), ThirdActivity.class);
                                startActivity(loseIntent);
                            }

                        }
                    }
                });
                break;
            case 2:
                // Same as case 1, but for multiplication
                final int num3 = RandomNumbers.num(16);
                final int num4 = RandomNumbers.num(16);
                textViewInstruction.setText(num3 + getString(R.string.mult) + num4);

                buttonConfirm.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        String seditTextResult = editTextResult.getText().toString();

                        if (seditTextResult != null && !seditTextResult.isEmpty()) {

                            int intfromedittext = new Integer(seditTextResult).intValue();
                            int result = num3 * num4;

                            if (intfromedittext == result) {
                                Intent continueIntent = new Intent(getApplicationContext(), SecondActivity.class);
                                startActivity(continueIntent);
                            } else {
                                Intent loseIntent = new Intent(getApplicationContext(), ThirdActivity.class);
                                startActivity(loseIntent);
                            }
                        }
                    }
                });
                break;
            case 3:
                //Make sure that num6 is less than num5
                final int num5 = RandomNumbers.num(200);
                int randcheck;
                do {
                    randcheck = RandomNumbers.num(200);
                } while (randcheck > num5);
                final int num6 = RandomNumbers.num(randcheck);

                textViewInstruction.setText(num5 + getString(R.string.subtract) + num6);

                buttonConfirm.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        String seditTextResult = editTextResult.getText().toString();

                        if (seditTextResult != null && !seditTextResult.isEmpty()) {

                            int intfromedittext = new Integer(seditTextResult).intValue();
                            int result = num5 - num6;

                            if (intfromedittext == result) {
                                Intent continueIntent = new Intent(getApplicationContext(), SecondActivity.class);
                                startActivity(continueIntent);
                            } else {
                                Intent loseIntent = new Intent(getApplicationContext(), ThirdActivity.class);
                                startActivity(loseIntent);
                            }

                        }
                    }
                });
                break;

        }
    }
}
