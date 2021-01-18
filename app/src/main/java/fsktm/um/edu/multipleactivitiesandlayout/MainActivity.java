package fsktm.um.edu.multipleactivitiesandlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
        public void BtnRelClicked (View view){
            Intent RLPage = new Intent(this, Rel.class);
            startActivityForResult(RLPage, 1);
        }

    public void onActivityResult ( int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                String strName = data.getStringExtra("Name");
                Toast.makeText(getApplicationContext(), "Welcome back" + strName + "!", Toast.LENGTH_LONG).show();

            }
        }
    }

        public void BtnConClicked (View view){
            Intent CLAct = new Intent(this, Const.class);
            startActivity(CLAct);
        }

    public void BtnGridClicked (View view){
        Intent GDAct = new Intent(this, Grid.class);
        startActivity(GDAct);
    }


    }
