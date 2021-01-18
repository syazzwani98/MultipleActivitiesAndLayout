package fsktm.um.edu.multipleactivitiesandlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Rel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rel);

    }

    public void BtnBRelClicked (View view){
        EditText ETName = (EditText)findViewById(R.id.ETName);
        Intent RLPage = new Intent();
        RLPage.putExtra("Name",ETName.getText().toString());
        setResult(RESULT_OK,RLPage);
        finish();
    }


    }






