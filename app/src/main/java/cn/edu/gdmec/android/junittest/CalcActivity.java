package cn.edu.gdmec.android.junittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CalcActivity {


    public int add(int x,int y){
        //原本希望是x+y
        return x-y;
    }
    public int divide(int x,int y){
        //希望是x/y
        return x/y;
    }
}
