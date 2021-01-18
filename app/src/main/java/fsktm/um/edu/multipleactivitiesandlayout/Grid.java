package fsktm.um.edu.multipleactivitiesandlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Grid extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttn, buttn2, buttonp, buttonm, buttonx, buttonb, buttone;
    EditText EditText1;

    float mValueOne, mValueTwo;

    boolean Addition, Subtract, Multiplication, Division;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttn = (Button) findViewById(R.id.buttn);
        buttn2 = (Button) findViewById(R.id.buttn2);
        buttonp = (Button) findViewById(R.id.buttonp);
        buttonm = (Button) findViewById(R.id.buttonm);
        buttonx = (Button) findViewById(R.id.buttonx);
        buttonb = (Button) findViewById(R.id.buttonb);
        buttone = (Button) findViewById(R.id.buttone);
        EditText1 = (EditText) findViewById(R.id.EditText1);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText1.setText(EditText1.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText1.setText(EditText1.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText1.setText(EditText1.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText1.setText(EditText1.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText1.setText(EditText1.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText1.setText(EditText1.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText1.setText(EditText1.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText1.setText(EditText1.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText1.setText(EditText1.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText1.setText(EditText1.getText() + "0");
            }
        });

        buttonp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (EditText1 == null) {
                    EditText1.setText("");
                } else {
                    mValueOne = Float.parseFloat(EditText1.getText() + "");
                    Addition = true;
                    EditText1.setText(null);
                }
            }
        });

        buttonm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(EditText1.getText() + "");
                Subtract = true;
                EditText1.setText(null);
            }
        });

        buttonx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(EditText1.getText() + "");
                Multiplication = true;
                EditText1.setText(null);
            }
        });

        buttonb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(EditText1.getText() + "");
                Division = true;
                EditText1.setText(null);
            }
        });

        buttone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(EditText1.getText() + "");

                if (Addition == true) {
                    EditText1.setText(mValueOne + mValueTwo + "");
                    Addition = false;
                }

                if (Subtract == true) {
                    EditText1.setText(mValueOne - mValueTwo + "");
                    Subtract = false;
                }

                if (Multiplication == true) {
                    EditText1.setText(mValueOne * mValueTwo + "");
                    Multiplication = false;
                }

                if (Division == true) {
                    EditText1.setText(mValueOne / mValueTwo + "");
                    Division = false;
                }
            }
        });

        buttn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText1.setText("");
            }
        });

        buttn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText1.setText(EditText1.getText() + ".");
            }
        });

    }

    public void BtnBGridClicked (View view){
        Intent GLAct = new Intent(this, MainActivity.class);
        startActivity(GLAct);
    }





}
