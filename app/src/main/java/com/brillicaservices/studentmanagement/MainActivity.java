package com.brillicaservices.studentmanagement;
import java.util.ArrayList;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

class Student
{
    String sName;
    String address;
    int phone;
    String collage;
    public Student(String name,String address,int phone,String collage)
    {
        sName=name;
        this.address=address;
        this.phone=phone;
        this.collage=collage;
    }
    //public void display()
    //{
      //  System.out.println(sName);
       // System.out.println(sCourse);
        //System.out.println(fees);
    //}
}
public class MainActivity extends AppCompatActivity {
    ArrayList<Student> al=new ArrayList<Student>();
    Button btn1;
    Button btn2;
    EditText et1;
    EditText et2;
    EditText et3;
    EditText et4;
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button) findViewById(R.id.button);
        btn2=(Button) findViewById(R.id.button2);
        et1=(EditText)findViewById(R.id.editText);
        et2=(EditText)findViewById(R.id.editText2);
        et3=(EditText)findViewById(R.id.editText4);
        et4=(EditText)findViewById(R.id.editText5);
        tv1=(TextView)findViewById(R.id.textView);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=et1.getText().toString();
                String address=et2.getText().toString();
                int phone=Integer.parseInt(et3.getText().toString());
                String collage=et4.getText().toString();
                al.add(new Student(name,address,phone,collage));
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i=0;i<al.size();i++){
                        String wholedata = "Student name is " + al.get(i).sName+" Address is "+al.get(i).address+
                                " Phone no is "+al.get(i).phone+" and Collage is "+al.get(i).collage+"\n\n\n";
                        tv1.setText(tv1.getText() + "\n" + wholedata);}


            }
        });
    }
}