package com.example.sistemimunniluh.pilgan;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TableLayout;
import android.widget.TableRow;

import java.util.ArrayList;

/**
 * Created by Azhar Rivaldi on 10/07/2019.
 */

public class ToggleButtonGroupTableLayout extends TableLayout {

    private RadioButton mActiveRadioButton;

    public ToggleButtonGroupTableLayout(Context context) {
        super(context);
    }

    public ToggleButtonGroupTableLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ArrayList<RadioButton> getChildren() {
        ArrayList<RadioButton> radioButtons = new ArrayList<>();
        int childCount = this.getChildCount();
        for (int i = 0; i < childCount; i++) {
            TableRow tableRow = (TableRow) this.getChildAt(i);
            int rowChildCount = tableRow.getChildCount();
            for (int j = 0; j < rowChildCount; j++) {
                View v = tableRow.getChildAt(j);
                if (v instanceof RadioButton) {
                    radioButtons.add((RadioButton) v);
                }
            }
        }
        return radioButtons;
    }



    private void setRadioButtonBackgroundColor(RadioButton button, int colorId) {
        button.getBackground().setColorFilter(Color.parseColor(getContext().getString(colorId)), PorterDuff.Mode.MULTIPLY);
    }
}
