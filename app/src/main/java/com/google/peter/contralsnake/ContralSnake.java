package com.google.peter.contralsnake;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;


public class ContralSnake extends Activity {

    DrawSnakeNode dsn;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        dsn = new DrawView(getApplicationContext());
//        setContentView(R.layout.main);
        setContentView(dsn);
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_DPAD_UP){
            dv.setY(dv.getY()-10);
        }else if(keyCode == KeyEvent.KEYCODE_DPAD_DOWN){
            dv.setY(dv.getY()+10);

        }else if(keyCode == KeyEvent.KEYCODE_DPAD_LEFT){
            dv.setX(dv.getX()-10);

        }else if(keyCode == KeyEvent.KEYCODE_DPAD_RIGHT){
            dv.setX(dv.getX()+10);

        }
        //强制重画(跟新当前画面)
        dv.invalidate();
        return super.onKeyDown(keyCode, event);


    }
}
