package fsktm.um.edu.multipleactivitiesandlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Const extends AppCompatActivity {

    private Button btnReturn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_const);
    }

    public void BtnBConClicked (View view){
        Intent CLAct = new Intent(this, MainActivity.class);
        startActivity(CLAct);
    }
}

