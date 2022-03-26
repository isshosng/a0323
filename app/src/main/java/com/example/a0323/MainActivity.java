package com.example.a0323;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyView vw = new MyView(this);
        setContentView(vw);
    }
}
class MyView extends View{
    public MyView(Context context){
        super(context);
        }
        public void onDraw(Canvas canvas){
            //super.onDraw(canvas);
            canvas.drawColor(Color.LTGRAY);
            Paint pnt = new Paint();
            pnt.setColor(Color.BLACK);
            String str = "Inha loves U";
            pnt.setAntiAlias(true);
            canvas.drawText(str,10,20,pnt);
            Resources res = getResources();
            BitmapDrawable bd = (BitmapDrawable)res.getDrawable(R.drawable.mysignature);
            Bitmap bit = bd.getBitmap();
            canvas.drawBitmap(bit, 10,10,null);
            pnt.setColor(Color.BLUE);

            /*for(int y1 =90; y1<140; y1++){
                canvas.drawCircle(150,y1,10,pnt);
            }
            for(int x1= 100; x1<200; x1++){
                canvas.drawCircle(x1,150,10,pnt);
            }
            for(int x1y1=300; x1y1>100; x1y1--){
                canvas.drawCircle(x1y1,x1y1,10,pnt);
            }*/

            //canvas.drawCircle(150,90,10,pnt);
            //canvas.drawCircle(150,100,10,pnt);
            //canvas.drawCircle(150,110,10,pnt);
            //canvas.drawCircle(100,150,10,pnt);
        }
    }
