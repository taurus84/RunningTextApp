package se.mah.ae2715.projektandroidapp;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import java.util.Random;

public class HumanGUI extends ActionBarActivity {
    private Button btnStart;
    private Button btnStop;
    private Button btnPause;
    private Button btnResume;
    private Button btnClear;
    private Button btnReverse;
    private Button btnChangeColor;
    private Button btnResetColor;
    private Button btnChangeBg;
    private EditText etInput;
    private ColorDisplay display;
    private Controller controller;
    private Random rand = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_part);
        initializeComponents();
        registerListeners();
        startProgram();
    }

    private void initializeComponents() {
        btnStart = (Button)findViewById(R.id.btnStart);
        btnStop = (Button)findViewById(R.id.btnStop);
        btnPause = (Button)findViewById(R.id.btnPause);
        btnResume = (Button)findViewById(R.id.btnResume);
        btnReverse = (Button)findViewById(R.id.btnReverse);
        btnClear = (Button)findViewById(R.id.btnClear);
        btnChangeColor = (Button)findViewById(R.id.btnChangeColor);
        btnResetColor = (Button)findViewById(R.id.btnResetColor);
        btnChangeBg = (Button)findViewById(R.id.btnChangeBg);
        etInput = (EditText)findViewById(R.id.etInput);
        display = (ColorDisplay)findViewById(R.id.displayColor);
    }

    private void registerListeners() {
        View.OnClickListener choiceListener = new ChoiceButtonListener();
        btnStart.setOnClickListener(choiceListener);
        btnStop.setOnClickListener(choiceListener);
        btnClear.setOnClickListener(choiceListener);
        btnPause.setOnClickListener(choiceListener);
        btnReverse.setOnClickListener(choiceListener);
        btnResume.setOnClickListener(choiceListener);
        btnChangeColor.setOnClickListener(choiceListener);
        btnResetColor.setOnClickListener(choiceListener);
        btnChangeBg.setOnClickListener(choiceListener);
    }

    private class ChoiceButtonListener implements View.OnClickListener {
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btnStart  :
                    controller.startIsClicked();
                    break;
                case R.id.btnStop   :
                    controller.stopIsClicked();
                    break;
                case R.id.btnPause  :
                    controller.pauseIsClicked();
                    break;
                case R.id.btnClear  :
                    controller.clearIsClicked();
                    break;
                case R.id.btnReverse  :
                    controller.reverseIsClicked();
                    break;
                case R.id.btnResume :
                    controller.resumeIsClicked();
                    break;
                case R.id.btnChangeColor    :
                    changeDisplayColors();
                    break;
                case R.id.btnResetColor :
                    changeDisplayOriginal();
                    break;
                case R.id.btnChangeBg   :
                    changeBackgroundColor(true);
            }
        }
    }

    public void startProgram() {
        controller = new Controller(this);
        enablePauseButton(false);
        enableStopButton(false);
    }

    public void enableStartButton(boolean enabled) {
        btnStart.setEnabled(enabled);
    }

    public void enablePauseButton(boolean enabled) {
        btnPause.setEnabled(enabled);
    }

    public void enableStopButton(boolean enabled) {
        btnStop.setEnabled(enabled);
    }

    public void setReverseVisible(boolean visible) {
        if (visible == true) {
            btnReverse.setVisibility(View.VISIBLE);
        } else {
            btnReverse.setVisibility(View.GONE);
        }
    }

    public void setPauseResume(boolean bool) {
        if (bool == true) {
            btnPause.setVisibility(View.GONE);
            btnResume.setVisibility(View.VISIBLE);
        } else {
            btnPause.setVisibility(View.VISIBLE);
            btnResume.setVisibility(View.GONE);
        }
    }

    public void clearText() {
        etInput.getText().clear();
        etInput.setHint("Enter text...");
    }

    public String whatString() {
        return etInput.getText().toString();
    }

    public void setupDisplay(int[][]color, int box) {
        display.setDisplay(color, 0, box);
    }

    public void showDisplay() {
        display.updateDisplay();
    }

    public void clearIt() {
        display.clearDisplay();
    }

    public void changeDisplayColors() {
        int color = Color.argb(255, rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
        display.setBackgroundColor(color);
        display.setGridColor(color);
        controller.setTextColor(Color.argb(255, rand.nextInt(256),
                                rand.nextInt(256), rand.nextInt(256)));
    }

    public void changeDisplayOriginal() {
        display.setBackgroundColor(0xFF4080B0);
        display.setGridColor(0xFF000000);
        controller.setTextColor(Color.BLACK);
        changeBackgroundColor(false);

    }

    public void changeBackgroundColor(boolean bool) {
        if(bool == true) {
            LinearLayout bg = (LinearLayout) findViewById(R.id.background);
            bg.setBackgroundColor(Color.argb(255, rand.nextInt(256),
                    rand.nextInt(256), rand.nextInt(256)));
        } else {
            LinearLayout bg = (LinearLayout) findViewById(R.id.background);
            bg.setBackgroundColor(0xFFFFFFFF);
        }
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_main_part, menu);
    return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();

     //noinspection SimplifiableIfStatement
     if (id == R.id.action_settings) {
        return true;
        }
        return super.onOptionsItemSelected(item);
     }
}

