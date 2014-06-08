package com.martroutine.android.uixlo.custom;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by MARTROUTINE on 08/06/2014.
 */
public class CustomTextView extends TextView{
    private static final String NAMESPACE = "http://schemas.android.com/apk/res-auto";
    private String selectedFont;
    private TextView textView;

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        textView = (TextView) this;
        selectedFont = attrs.getAttributeValue(NAMESPACE, "selectFont");
        changeFont(context, selectedFont);
    }

    private void changeFont(Context context, String selectedFont) {
        Typeface typeface = Typeface.createFromAsset(context.getAssets(), "fonts/" + selectedFont + ".ttf");
        textView.setTypeface(typeface);
    }
}
