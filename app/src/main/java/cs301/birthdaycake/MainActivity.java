package cs301.birthdaycake;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.SeekBar;
import android.widget.Button;
import android.widget.Switch;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        setContentView(R.layout.activity_main);

        CakeView cakeView = findViewById(R.id.cakeview);
        CakeController cakeController = new CakeController(cakeView);

        Button blowOut = findViewById(R.id.button1);
        Switch frosting = findViewById(R.id.switch1);
        Switch candles = findViewById(R.id.switch2);
        SeekBar candleNumber = findViewById(R.id.seekBar1);

        blowOut.setOnClickListener(cakeController);
        frosting.setOnCheckedChangeListener(cakeController);
        candles.setOnCheckedChangeListener(cakeController);
        candleNumber.setOnSeekBarChangeListener(cakeController);


    }

    public void goodbye(View button){
        Log.i("button","Goodbye");
    }
}
