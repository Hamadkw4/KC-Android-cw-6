package com.example.hamad13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
                 ArrayList<Student>studentArrayList=new ArrayList<>();
                 int Hamad=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView studentage=findViewById(R.id.textView4);
        TextView studentName=findViewById(R.id.textView5);
        Button g3=findViewById(R.id.button5);
        ImageView g4=findViewById(R.id.imageView2);
        ImageView studentphoto=findViewById(R.id.imageView3);

        Intent intent=new Intent();
        String name= "name";
        // اسماء الطلبة
        Student student1=new Student("Heidi",9,R.drawable.img);
        Student student2=new Student("Donald Duck",7,R.drawable.img_1);
        Student student3=new Student("Conan",12,R.drawable.img_2);




        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);

        studentphoto.setImageResource(studentArrayList.get(Hamad).getStudentphoto());
        studentName.setText(studentArrayList.get(Hamad).getStudentName());
        studentage.setText(String.valueOf(studentArrayList.get(Hamad).getStudentage()));
        g3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Hamad++;
                if(Hamad==studentArrayList.size()){
                    Hamad=0;
                }


                studentphoto.setImageResource(studentArrayList.get(Hamad).getStudentphoto());
                studentName.setText(studentArrayList.get(Hamad).getStudentName());
                studentage.setText(String.valueOf(studentArrayList.get(Hamad).getStudentage()));


            }
        });






    }
}