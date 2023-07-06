package com.example.activity;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements OnClickListener {
    private Button but_0;//0-9数字按钮
    private Button but_1;
    private Button but_2;
    private Button but_3;
    private Button but_4;
    private Button but_5;
    private Button but_6;
    private Button but_7;
    private Button but_8;
    private Button but_9;
    private Button but_delete;//删除
    private Button but_clean;//清空
    private Button but_change;//正负数切换
    private Button but_div;//除法按钮
    private Button but_mult;//乘法按钮
    private Button but_sub;//减法按钮
    private Button but_add;//加法按钮
    private Button but_sin;//正弦按钮
    private Button but_cos;//余弦按钮
    private Button but_tan;//正切按钮
    private Button but_lg;//对数按钮
    private Button but_point;//小数点
    private Button but_equal;//等号
    private TextView resultText;//结果框
    private String input = "";//保存输入输出的数字和符号
    private String operator;//记录运算符号
    double sum1, num1, num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();//声明
    }

    public void initView() {
        //添加视图
        but_0 = findViewById(R.id.but_0);
        but_1 = findViewById(R.id.but_1);
        but_2 = findViewById(R.id.but_2);
        but_3 = findViewById(R.id.but_3);
        but_4 = findViewById(R.id.but_4);
        but_5 = findViewById(R.id.but_5);
        but_6 = findViewById(R.id.but_6);
        but_7 = findViewById(R.id.but_7);
        but_8 = findViewById(R.id.but_8);
        but_9 = findViewById(R.id.but_9);

        but_delete = findViewById(R.id.but_delete);
        but_clean = findViewById(R.id.but_clean);
        but_change = findViewById(R.id.but_change);
        but_div = findViewById(R.id.but_div);
        but_mult = findViewById(R.id.but_mult);
        but_sub = findViewById(R.id.but_sub);
        but_add = findViewById(R.id.but_add);
        but_sin = findViewById(R.id.but_sin);
        but_cos = findViewById(R.id.but_cos);
        but_tan = findViewById(R.id.but_tan);
        but_lg = findViewById(R.id.but_lg);
        but_point = findViewById(R.id.but_point);
        but_equal = findViewById(R.id.but_equal);

        resultText = (TextView) findViewById(R.id.resultText);//结果集

        //初始化文本编辑框
        resultText.setCursorVisible(false);

        //添加事件监听器
        but_0.setOnClickListener(this);
        but_1.setOnClickListener(this);
        but_2.setOnClickListener(this);
        but_3.setOnClickListener(this);
        but_4.setOnClickListener(this);
        but_5.setOnClickListener(this);
        but_6.setOnClickListener(this);
        but_7.setOnClickListener(this);
        but_8.setOnClickListener(this);
        but_9.setOnClickListener(this);
        but_delete.setOnClickListener(this);
        but_clean.setOnClickListener(this);
        but_change.setOnClickListener(this);
        but_div.setOnClickListener(this);
        but_mult.setOnClickListener(this);
        but_sub.setOnClickListener(this);
        but_add.setOnClickListener(this);
        but_sin.setOnClickListener(this);
        but_cos.setOnClickListener(this);
        but_tan.setOnClickListener(this);
        but_lg.setOnClickListener(this);
        but_point.setOnClickListener(this);
        but_equal.setOnClickListener(this);
        resultText.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.but_0) {
            input = addToInput("0");
            resultText.setText(input);
        }
        if (view.getId() == R.id.but_1) {
            input = addToInput("1");
            resultText.setText(input);
        }
        if (view.getId() == R.id.but_2) {
            input = addToInput("2");
            resultText.setText(input);
        }
        if (view.getId() == R.id.but_3) {
            input = addToInput("3");
            resultText.setText(input);
        }
        if (view.getId() == R.id.but_4) {
            input = addToInput("4");
            resultText.setText(input);
        }
        if (view.getId() == R.id.but_5) {
            input = addToInput("5");
            resultText.setText(input);
        }
        if (view.getId() == R.id.but_6) {
            input = addToInput("6");
            resultText.setText(input);
        }
        if (view.getId() == R.id.but_7) {
            input = addToInput("7");
            resultText.setText(input);
        }
        if (view.getId() == R.id.but_8) {
            input = addToInput("8");
            resultText.setText(input);
        }
        if (view.getId() == R.id.but_9) {
            input = addToInput("9");
            resultText.setText(input);
        }
        if (view.getId() == R.id.but_add) {
            input = addToInput("+");
            operator = "+";
            resultText.setText(input);
        }
        if (view.getId() == R.id.but_sub) {
            input = addToInput("-");
            operator = "-";
            resultText.setText(input);
        }
        if (view.getId() == R.id.but_mult) {
            input = addToInput("*");
            operator = "*";
            resultText.setText(input);
        }
        if (view.getId() == R.id.but_div) {
            input = addToInput("/");
            operator = "/";
            resultText.setText(input);
        }
        if (view.getId() == R.id.but_sin) {
            input = addToInput("sin");
            operator = "sin";
            resultText.setText(input);
        }
        if (view.getId() == R.id.but_cos) {
            input = addToInput("cos");
            operator = "cos";
            resultText.setText(input);
        }
        if (view.getId() == R.id.but_tan) {
            input = addToInput("tan");
            operator = "tan";
            resultText.setText(input);
        }
        if (view.getId() == R.id.but_lg) {
            input = addToInput("lg ");
            operator = "lg";
            resultText.setText(input);
        }
        if (view.getId() == R.id.but_point) {
            input = addToInput(".");
            resultText.setText(input);
        }
        if (view.getId() == R.id.but_delete) {
            if (input.length() >= 1) {
                input = input.substring(0, input.length() - 1);
            }
            resultText.setText(input);
        }
        if (view.getId() == R.id.but_clean) {
            input = "";
            sum1=0;
            num1=0;
            num2 = 0;
            operator = null;
            resultText.setText(input);
        }
        if (view.getId() == R.id.but_equal) {
            if(!input.isEmpty()){
                input = input + "=" +String.valueOf(equals(input));//得到运算结果
                resultText.setText(input);
                input = String.valueOf(sum1); // 将上一次计算的结果设置为新的输入
            }
        }
        if (view.getId() == R.id.but_change) {
            if (operator == null) {//此时输入第一个操作数
                if (input.startsWith("-")) {//第一个操作数为负数
                    input = input.substring(1, input.length());
                    resultText.setText(input);
                } else {//第一个操作数为正数
                    input = "-" + input;
                    resultText.setText(input);
                }
            } else {//此时输入第二个操作数
                int indexOfOperator = input.indexOf(operator);//获取操作符的位置
                String second;
                second = input.substring(indexOfOperator + 1, input.length());//获取第二个操作数
                System.out.print(second);
                if (second.startsWith("-")) {//第二个操作数为负数
                    second = second.substring(1, second.length());
                    input = input.substring(0, indexOfOperator + 1) + second;
                    resultText.setText(input);
                } else {//第二个操作数为正数
                    second = "-" + second;
                    input = input.substring(0, indexOfOperator + 1) + second;
                    resultText.setText(input);
                }
            }
        }
    }

    public boolean checknum(String input){//检查输入的操作数是否合规
        if(input.contains(".")){
            if(input.startsWith(".")||input.endsWith(".")){//操作数以小数点开头或结尾
                Toast.makeText(this, "操作数不合规", Toast.LENGTH_SHORT).show();
                return false;
            }
            else if(input.indexOf(".")==input.lastIndexOf(".")){//一个操作数只有一个小数点
                return true;
            }
        }
        return true;
    }

    public String addToInput(String c) {//赋值
        input = input + c;
        return input;
    }

    public double equals(String input) {//运算逻辑实现
        int indexOfOperator = input.indexOf(operator);//获取当前操作数的位置
        if(input.startsWith("-")){//若第一个操作数为负数，则操作符位置从第二个operator开始
            indexOfOperator = input.substring(1,input.length()).indexOf(operator)+1;
        }
        String str1,str2;//表示操作符1和操作符2
        switch (operator){
            case "+":
                str1 = input.substring(0, indexOfOperator);
                str2=input.substring(indexOfOperator + 1, input.length());
                if(checknum(str1)&&checknum(str2)) {
                    num1 = Double.parseDouble(str1);
                    num2 = Double.parseDouble(str2);
                    sum1 = num1 + num2;

                }
                else {
                    sum1 = 99999;//当操作数不合规时，结果错误，用99999表示
                    Toast.makeText(this, "操作数不合规", Toast.LENGTH_SHORT).show();
                }
                break;
            case "-":
                str1 = input.substring(0, indexOfOperator);
                str2=input.substring(indexOfOperator + 1, input.length());
                if(checknum(str1)&&checknum(str2)) {
                    num1 = Double.parseDouble(str1);
                    num2 = Double.parseDouble(str2);
                    sum1 = num1 - num2;
                }
                else {
                    sum1 = 99999;//当操作数不合规时，结果错误，用99999表示
                    Toast.makeText(this, "操作数不合规", Toast.LENGTH_SHORT).show();
                }
                break;
            case "*":
                str1 = input.substring(0, indexOfOperator);
                str2=input.substring(indexOfOperator + 1, input.length());
                if(checknum(str1)&&checknum(str2)) {
                    num1 = Double.parseDouble(str1);
                    num2 = Double.parseDouble(str2);
                    sum1 = num1 * num2;
                }
                else {
                    sum1 = 99999;//当操作数不合规时，结果错误，用99999表示
                    Toast.makeText(this, "操作数不合规", Toast.LENGTH_SHORT).show();
                }
                break;
            case "/":
                str1 = input.substring(0, indexOfOperator);
                str2=input.substring(indexOfOperator + 1, input.length());
                if(checknum(str1)&&checknum(str2)) {
                    num1 = Double.parseDouble(str1);
                    num2 = Double.parseDouble(str2);
                    if(operator.equals("/")&&num2 ==0) {//当操作数为/且除数为0时，运算错误，弹出提示框提醒
                        sum1 = 99999;
                        Toast.makeText(this, "除数不能为0", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        sum1 = num1 / num2;
                    }
                }
                else {
                    sum1 = 99999;//当操作数不合规时，结果错误，用99999表示
                    Toast.makeText(this, "操作数不合规", Toast.LENGTH_SHORT).show();
                }
                break;
            case "sin":
                str1 = input.substring(3, input.length());
                if(checknum(str1)){
                    num1 = Double.parseDouble(str1);
                    sum1 = Math.sin(num1);
                }
                else{
                    sum1 = 99999;
                    Toast.makeText(this, "操作数不合规", Toast.LENGTH_SHORT).show();
                }
                break;
            case "cos":
                str1 = input.substring(3, input.length());
                if(checknum(str1)){
                    num1 = Double.parseDouble(str1);
                    sum1 = Math.sin(Math.PI / 180 * num1);
                }
                else{
                    sum1 = 99999;
                    Toast.makeText(this, "操作数不合规", Toast.LENGTH_SHORT).show();
                }
                sum1 = Math.cos(Math.PI / 180 * num1);
                break;
            case "tan":
                str1 = input.substring(3, input.length());
                if(checknum(str1)){
                    num1 = Double.parseDouble(str1);
                    sum1 = Math.sin(Math.PI / 180 * num1);
                }
                else{
                    sum1 = 99999;//当操作数不合规时，结果错误，用99999表示
                    Toast.makeText(this, "操作数不合规", Toast.LENGTH_SHORT).show();
                }
                sum1 = Math.tan(Math.PI / 180 * num1);
                break;
            case "lg":
                str1 = input.substring(2, input.length());
                if(checknum(str1)){
                    num1 = Double.parseDouble(str1);
                    sum1 = Math.log10(num1);
                }
                else{
                    sum1 = 99999;//当操作数不合规时，结果错误，用99999表示
                    Toast.makeText(this, "操作数不合规", Toast.LENGTH_SHORT).show();
                }
                break;
        }
        return sum1;
    }
}