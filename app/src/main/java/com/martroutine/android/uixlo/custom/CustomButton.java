package com.martroutine.android.uixlo.custom;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;

/**
 * Created by MARTROUTINE on 08/06/2014.
 */
public class CustomButton extends Button{
    private static final String NAMESPACE = "http://schemas.android.com/apk/res-auto";
    private Button buttonView;
    private String selectedFont;

    public CustomButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        buttonView = (Button) this;
        selectedFont = attrs.getAttributeValue(NAMESPACE, "selectFont");

        changeFont(context,selectedFont);
    }

    private void changeFont(Context context, String selectedFont2) {
        Typeface typeface = Typeface.createFromAsset(context.getAssets(), "fonts/" + selectedFont + ".ttf");
        buttonView.setTypeface(typeface);
    }
}
