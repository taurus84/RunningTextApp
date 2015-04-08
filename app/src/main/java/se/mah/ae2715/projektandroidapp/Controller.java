package se.mah.ae2715.projektandroidapp;

import android.graphics.Color;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by David on 2015-01-09.
 */
public class Controller {
    private Array7x7[] txtArray;
    private HumanGUI gui;
    private Timer timer;
    private boolean paused = false;
    private ArrayChars chars = new ArrayChars();
    int color = Color.BLACK;

    public Controller(HumanGUI gui) {
        this.gui = gui;
    }

    public void startIsClicked() {
        //nothing will happen if no text
        if(!gui.whatString().equals("")) {
            gui.enableStartButton(false);
            gui.enablePauseButton(true);
            gui.enableStopButton(true);
            setString();
            intToColor();
            rollText();
        }
    }

    public void stopIsClicked() {
        gui.enableStartButton(true);
        gui.enablePauseButton(false);
        gui.enableStopButton(false);
        gui.setReverseVisible(false);
        gui.setPauseResume(false);
        paused = false;
        timer.cancel();
        gui.clearIt();
    }

    public void reverseIsClicked() {
        rollTextInvert();
        paused = false;
        gui.setReverseVisible(false);
        gui.setPauseResume(false);

    }

    public void clearIsClicked() {
        gui.clearText();
    }

    /**
     * Depending on the state of 'paused' the text either
     * pauses or continues
     */
    public void pauseIsClicked() {
       if(paused == false) {
           onPause();
           paused = true;
           gui.setReverseVisible(true);
           gui.setPauseResume(true);
       } else {
           rollText();
           gui.setReverseVisible(false);
           paused = false;
       }
    }

    public void resumeIsClicked() {
        rollText();
        gui.setReverseVisible(false);
        gui.setPauseResume(false);
        paused = false;

    }

    public void onPause() {
        timer.cancel();
    }

    /**
     * Method starts the timer and turn on the rolling of the saved text
     */
    private void rollText() {
        timer = new Timer();
        timer.schedule(new RollText(), 0, 80);
    }

    private void rollTextInvert() {
        timer = new Timer();
        timer.schedule(new RollTextInvert(), 0, 100);
    }

    /**
     * Method to save the text from EditText box
     */
    private void setString() {
        //get input text
        String txt = gui.whatString();
        if (txt.length() < 4) {
            txtArray = new Array7x7[5];
        } else {
            // The last position in array shall contain a space sign
            txtArray = new Array7x7[txt.length() + 1];
        }
        // Inserts the graphical counterpart for each character
        // If the string is less than 4 it will be filled with space up to the
        // fifth position.
        if (txt.length() < 4) {
            for (int i = 0; i < txt.length(); i++) {
                txtArray[i] = new Array7x7(ArrayChars.getChar(txt.charAt(i)).getArray());
            }
            for (int j = txt.length(); j < txtArray.length; j++) {
                txtArray[j] = new Array7x7(ArrayChars.getChar(' ').getArray());
            }
        } else {
            for (int i = 0; i < txtArray.length; i++) {
                txtArray[i] = new Array7x7(ArrayChars.getChar(txt.charAt(i)).getArray());
                // Last position will contain a space sign
                if (i == txtArray.length - 2) {
                    txtArray[i + 1] = new Array7x7(ArrayChars.getChar(' ').getArray());
                    i++;
                }
            }
        }
    }

    /**
     * Method to roll and loop text over the display
     */
    private class RollText extends TimerTask {

        Array7 temp;

       // A run() method is required
        public void run() {

            // shifting the content to LEFT in all positions in Array7x7[].
            for (int p = 0; p < txtArray.length; p++) {
                // Each block's last column will receive the next
                // block's first column, unless it's the last block.
                // That one will receive the first block's first column.
                if (p == txtArray.length - 1) {
                    temp = txtArray[0].getCol(0);
                } else {
                    temp = txtArray[p + 1].getCol(0);
                }
                txtArray[p].shiftContent(temp, 1);
            }
            // the display is 5 blocks long. All elements containing value 1
            // will get a color different from background.
            for (int i = 0; i < 5; i++) {
                //sets up the display to show the new block.
                gui.setupDisplay(txtArray[i].getArray(), i);
            }
            // shows the new display
            gui.showDisplay();
        }
    }

    /**
     * Method to roll the text backwards over the display
     */
    private class RollTextInvert extends TimerTask {

        Array7 temp;

        // A run() method is required
        public void run() {

            // shifting the content to LEFT in all positions in Array7x7[].
            for (int p = txtArray.length - 1; p >=0; p--) {
                // Each block's last column will receive the next
                // block's first column, unless it's the last block.
                // That one will receive the first block's first column.
                if (p == 0) {
                    temp = txtArray[txtArray.length - 1].getCol(6);
                } else {
                    temp = txtArray[p - 1].getCol(6);
                }
                txtArray[p].shiftContent(temp, 2);
            }
            // the display is 5 blocks long. All elements containing value 1
            // will get a color different from background.
            for (int i = 0; i < 5; i++) {
                //sets up the display to show the new block.
                gui.setupDisplay(txtArray[i].getArray(), i);
            }
            // shows the new display
            gui.showDisplay();
        }
    }

    /**
     * converting values representing 1 to value for black
     */
    public void intToColor() {
        for (int i = 0; i < txtArray.length; i++) {
            for (int row = 0; row < 7; row++) {
                for (int col = 0; col < 7; col++) {
                    if (txtArray[i].getElement(row, col) == 1) {
                        txtArray[i].setElement(row, col, color);
                    }
                }
            }
        }
    }

    /**
     * Changing the font color
     * @param color color
     */
    public void setTextColor(int color) {
        this.color = color;
    }
}