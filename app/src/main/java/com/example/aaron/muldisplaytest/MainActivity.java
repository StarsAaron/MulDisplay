package com.example.aaron.muldisplaytest;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.StringBuilderPrinter;
import android.widget.TextView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

public class MainActivity extends AppCompatActivity {
    private TextView sw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sw = (TextView)findViewById(R.id.tv_sw);

//      获取屏幕信息
        StringBuilder stringBuilder = new StringBuilder();
        Configuration config = getResources().getConfiguration();
        stringBuilder.append("sw:"+config.smallestScreenWidthDp+"\n");
        stringBuilder.append("dpi:"+config.densityDpi+"\n");
        stringBuilder.append("screenHeightDp:"+config.screenHeightDp+"\n");
        stringBuilder.append("screenWidthDp:"+config.screenWidthDp+"\n");
        stringBuilder.append("ScreenHeigh:"+DisplayUtils.getScreenHeigh(MainActivity.this)+"\n");
        stringBuilder.append("ScreenWidth:"+DisplayUtils.getScreenWidth(MainActivity.this)+"\n");
        if(config.orientation == Configuration.ORIENTATION_LANDSCAPE){//水平
            stringBuilder.append("方向：ORIENTATION_LANDSCAPE\n");
        }else if(config.orientation == Configuration.ORIENTATION_PORTRAIT){//垂直
            stringBuilder.append("方向：ORIENTATION_PORTRAIT\n");
        }
        sw.setText(stringBuilder.toString());
        Log.i("MS",stringBuilder.toString());
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }
}
