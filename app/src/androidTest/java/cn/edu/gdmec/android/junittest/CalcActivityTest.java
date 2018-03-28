package cn.edu.gdmec.android.junittest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by HP on 2018/3/29.
 */
public class CalcActivityTest {
    private CalcActivity mCalc;
    @Before
    public void setUp() throws Exception {
        mCalc=new CalcActivity();

    }

    @Test
    public void add() throws Exception {
        int result=mCalc.add(2,8);
        assertEquals(10,result);

    }
    @Test
    public void divide() throws Exception{
        int result2=mCalc.divide(8,4);
        assertEquals(2,result2);

    }

}