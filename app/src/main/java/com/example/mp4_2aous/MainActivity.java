package com.example.mp4_2aous;

import android.arch.lifecycle.ViewModelStoreOwner;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    private StringBuilder FirstNumber=new StringBuilder();
    private StringBuilder SecondNumber=new StringBuilder();
    private Boolean Check=false;
    private String Op="";
    private float number1,number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1= findViewById(R.id.button1);
        Button button2= findViewById(R.id.button2);
        Button button3= findViewById(R.id.button3);
        Button button4= findViewById(R.id.button4);
        Button button5= findViewById(R.id.button5);
        Button button6= findViewById(R.id.button6);
        Button button7= findViewById(R.id.button7);
        Button button8= findViewById(R.id.button8);
        Button button9= findViewById(R.id.button9);
        Button button0= findViewById(R.id.button0);
        Button buttonMul= findViewById(R.id.buttonMul);
        Button buttonSub= findViewById(R.id.buttonSub);
        Button buttonAdd= findViewById(R.id.buttonAdd);
        Button buttonEq= findViewById(R.id.buttonEq);
        Button buttonClear= findViewById(R.id.buttonClear);




    }

    public void Display(String s)
    {
        TextView D=(TextView) findViewById(R.id.textView);
        D.setText(s);
    }

    public void Result()
    {   float result;
    result=0.f;
        switch (Op){
            case "+":result=number1+number2;
            break;

            case "-":result=number1-number2;
            break;

            case "X":result=number1*number2;
            break;

        }
        Display(Float.toString(result));
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.button1:
                if(Check==false){FirstNumber.append("1");
                Display(FirstNumber.toString());}
                else {SecondNumber.append("1"); Display(SecondNumber.toString());}

                break;

            case R.id.button2:
                if(Check==false){FirstNumber.append("2");
                    Display(FirstNumber.toString());}
                else {SecondNumber.append("2"); Display(SecondNumber.toString());}
                break;

            case R.id.button3:
                if(Check==false){FirstNumber.append("3");
                    Display(FirstNumber.toString());}
                else {SecondNumber.append("3"); Display(SecondNumber.toString());}
                break;

            case R.id.button4:
                if(Check==false){FirstNumber.append("4");
                    Display(FirstNumber.toString());}
                else {SecondNumber.append("4"); Display(SecondNumber.toString());}
                break;

            case R.id.button5:
                if(Check==false){FirstNumber.append("5");
                    Display(FirstNumber.toString());}
                else {SecondNumber.append("5"); Display(SecondNumber.toString());}
                break;

            case R.id.button6:
                if(Check==false){FirstNumber.append("6");
                    Display(FirstNumber.toString());}
                else {SecondNumber.append("6"); Display(SecondNumber.toString());}
                break;

            case R.id.button7:
                if(Check==false){FirstNumber.append("7");
                    Display(FirstNumber.toString());}
                else {SecondNumber.append("7"); Display(SecondNumber.toString());}
                break;

            case R.id.button8:
                if(Check==false){FirstNumber.append("8");
                    Display(FirstNumber.toString());}
                else {SecondNumber.append("8"); Display(SecondNumber.toString());}
                break;

            case R.id.button9:
                if(Check==false){FirstNumber.append("9");
                    Display(FirstNumber.toString());}
                else {SecondNumber.append("9"); Display(SecondNumber.toString());}
                break;

            case R.id.button0:
                if(Check==false){FirstNumber.append("0");
                    Display(FirstNumber.toString());}
                else {SecondNumber.append("0"); Display(SecondNumber.toString());}
                break;


            case R.id.buttonAdd:
                if (Op=="" && FirstNumber.length()!=0){ Op="+";      number1=Float.parseFloat(FirstNumber.toString());     Check=true;}
                break;
            case R.id.buttonSub:
                if (Op=="" && FirstNumber.length()!=0){ Op="-";      number1=Float.parseFloat(FirstNumber.toString());     Check=true;}
                break;
            case R.id.buttonMul:
                if (Op=="" && FirstNumber.length()!=0){ Op="X";      number1=Float.parseFloat(FirstNumber.toString());     Check=true;}
                break;
            case R.id.buttonEq:
                if (Op != ""){number2=Float.parseFloat(SecondNumber.toString());    Result();}
                break;
            case R.id.buttonClear:
                FirstNumber.setLength(0);   SecondNumber.setLength(0);  Check=false; Op=""; Display("");

                break;
        }

    }
}

