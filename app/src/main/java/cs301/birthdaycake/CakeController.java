package cs301.birthdaycake;

import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener,
        CompoundButton.OnCheckedChangeListener, SeekBar.OnSeekBarChangeListener {
    private CakeView cakeView;
    private CakeModel cakeModel;
    private Button litbutton;

    public CakeController(CakeView cake) {
        cakeView = cake;
        cakeModel = cakeView.getCakeModel();
    }

    @Override
    public void onClick(View view) {
        cakeModel.candlesLit = !cakeModel.candlesLit;
        litbutton = (Button)view;
        if (cakeModel.candlesLit)
        {
            litbutton.setText("Blow Out");
        }
        else
        {
            litbutton.setText("Re-light");
        }
        cakeView.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
        switch (compoundButton.getId()) {
            case R.id.switch2:
                cakeModel.ItHasCandles = !cakeModel.ItHasCandles;
                break;
            case R.id.switch1:
                cakeModel.cakeFrosting = !cakeModel.cakeFrosting;
        }
        cakeView.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        cakeModel.candleCount = progress;
        cakeView.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}
