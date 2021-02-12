package com.example.gesturesandfragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    private TextView myMessage;
    private GestureDetector gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myMessage = (TextView) findViewById(R.id.myMessage);
        this.gestureDetector = new GestureDetector(this,this);
        gestureDetector.setOnDoubleTapListener(this);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        myMessage.setText("Single Tap Confirmed");
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        myMessage.setText("On Double Tap");
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        myMessage.setText("On Double Tap Event");
        return false;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        myMessage.setText("On Down");
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        myMessage.setText("On Show Press");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        myMessage.setText("On Single Tap Up");
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        myMessage.setText("On Scroll");
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public void onLongPress(MotionEvent e) {
        myMessage.setText("On Long Press");
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        myMessage.setText("On Fling");
        return false;
    }
}