package com.destroyer.gtavi;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    private int dp(float v) { return (int)(v * getResources().getDisplayMetrics().density + 0.5f); }

    private TextView label(String text, int size, int color, boolean bold) {
        TextView t = new TextView(this);
        t.setText(text);
        t.setTextColor(color);
        t.setTextSize(size);
        t.setGravity(Gravity.CENTER);
        if (bold) t.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        return t;
    }

    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout page = new LinearLayout(this);
        page.setOrientation(LinearLayout.VERTICAL);
        page.setGravity(Gravity.CENTER);
        page.setPadding(dp(24), dp(30), dp(24), dp(30));
        page.setBackgroundColor(Color.rgb(12, 10, 19));

        TextView logo = label("VI", 112, Color.WHITE, true);
        logo.setShadowLayer(dp(8), dp(3), dp(5), Color.rgb(213, 105, 166));
        page.addView(logo, new LinearLayout.LayoutParams(-1, dp(190)));

        TextView title = label("GTA VI", 32, Color.rgb(255, 190, 215), true);
        page.addView(title);

        TextView subtitle = label("GRAND THEFT AUTO", 13, Color.LTGRAY, false);
        page.addView(subtitle);

        TextView status = label("UNOFFICIAL FAN-MADE GAME SCREEN\n\nThis app is a visual mock-up only.\nIt does not contain or run GTA VI.", 15, Color.WHITE, false);
        status.setPadding(dp(12), dp(35), dp(12), dp(35));
        page.addView(status);

        TextView footer = label("NOT A ROCKSTAR GAMES PRODUCT", 10, Color.GRAY, true);
        page.addView(footer);

        setContentView(page);
    }
}
