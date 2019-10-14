package com.zhoubrian.androiddeveloperinterview;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.zhoubrian.androiddeveloperinterview.data_models.models.QuestionsInformation;
import com.zhoubrian.androiddeveloperinterview.models.interviewQuestion;

import java.util.ArrayList;
import java.util.List;

public class Simple_question extends AppCompatActivity implements View.OnClickListener {

    public static final String Infor="com.zhoubrian.androiddeveloperinterview.results";
    private static final String TAG="Simple_question";

    Button buttonRetryl, buttonShowAnswer, buttonRetryr;
    List<interviewQuestion> myListOfQuestions;
    QuestionsInformation data =new QuestionsInformation();


    //Questions Reference
    TextView qsn1,qsn2,qsn3,qsn4,qsn5,qsn6,qsn7,qsn8,qsn9,qsn10;

    //User results reference to textView
    TextView mMark,mRating;

    //Explanation References
    TextView qsn1_ex,qsn2_ex,qsn3_ex,qsn4_ex,qsn5_ex,qsn6_ex,qsn7_ex,qsn8_ex,qsn9_ex,qsn10_ex;

    //references to CheckBoxes
    CheckBox ans5_a,ans5_b,ans5_c,ans5_d,ans6_a,ans6_b,ans6_c,ans6_d;

    //getReference to EditTxt question
    EditText myInputType;

    //answers references for Radio_Buttons
    RadioButton ans1_a,ans1_b,ans1_c,ans1_d,ans2_a,ans2_b,ans2_c,ans2_d,ans3_a,ans3_b,ans3_c,ans3_d,
            ans4_a,ans4_b,ans4_c,ans4_d,ans8_a,ans8_b,ans8_c,ans8_d,ans9_a,
            ans9_b,ans9_c,ans9_d,ans10_a,ans10_b,ans10_c,ans10_d;

    RadioGroup ans1_group, ans2_group, ans3_group, ans4_group,
            ans8_group, ans9_group, ans10_group;

    private int mTotalMark =0;
    private  int NumberOfAttempts=0;
    boolean isUserDone=false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.questions);

        myListOfQuestions = data.getSimple_Questions();
        setUpAllReferences();
        setAllQsns();

        // Onclick Listener for 3 Buttons
        buttonRetryl.setOnClickListener(this);
        buttonShowAnswer.setOnClickListener(this);
        buttonRetryr.setOnClickListener(this);

    }//end of onCreate...

    public void setUpAllReferences(){

        myInputType=(EditText)findViewById(R.id.qsn7_ans);

        //get references for mark and rating
        mMark=(TextView)findViewById(R.id.userMark);
        mRating=(TextView)findViewById(R.id.userRating);

        //get refences to explanation TextViews
        qsn1_ex=(TextView)findViewById(R.id.qsn1_explanation);
        qsn2_ex=(TextView)findViewById(R.id.qsn2_explanation);
        qsn3_ex=(TextView)findViewById(R.id.qsn3_explanation);
        qsn4_ex=(TextView)findViewById(R.id.qsn4_explanation);
        qsn5_ex=(TextView)findViewById(R.id.qsn5_explanation);
        qsn7_ex=(TextView)findViewById(R.id.qsn7_explanation);
        qsn8_ex=(TextView)findViewById(R.id.qsn8_explanation);
        qsn9_ex=(TextView)findViewById(R.id.qsn9_explanation);
        qsn10_ex=(TextView)findViewById(R.id.qsn10_explanation);

        //getReferences to RadiosChoices
        ans1_a=(RadioButton)findViewById(R.id.qsn1_a);
        ans1_b=(RadioButton)findViewById(R.id.qsn1_b);
        ans1_c=(RadioButton)findViewById(R.id.qsn1_c);
        ans1_d=(RadioButton)findViewById(R.id.qsn1_d);

        ans2_a=(RadioButton)findViewById(R.id.qsn2_a);
        ans2_b=(RadioButton)findViewById(R.id.qsn2_b);
        ans2_c=(RadioButton)findViewById(R.id.qsn2_c);
        ans2_d=(RadioButton)findViewById(R.id.qsn2_d);

        ans3_a=(RadioButton)findViewById(R.id.qsn3_a);
        ans3_b=(RadioButton)findViewById(R.id.qsn3_b);
        ans3_c=(RadioButton)findViewById(R.id.qsn3_c);
        ans3_d=(RadioButton)findViewById(R.id.qsn3_d);

        ans4_a=(RadioButton)findViewById(R.id.qsn4_a);
        ans4_b=(RadioButton)findViewById(R.id.qsn4_b);
        ans4_c=(RadioButton)findViewById(R.id.qsn4_c);
        ans4_d=(RadioButton)findViewById(R.id.qsn4_d);

        ans8_a=(RadioButton)findViewById(R.id.qsn8_a);
        ans8_b=(RadioButton)findViewById(R.id.qsn8_b);
        ans8_c=(RadioButton)findViewById(R.id.qsn8_c);
        ans8_d=(RadioButton)findViewById(R.id.qsn8_d);

        ans9_a=(RadioButton)findViewById(R.id.qsn9_a);
        ans9_b=(RadioButton)findViewById(R.id.qsn9_b);
        ans9_c=(RadioButton)findViewById(R.id.qsn9_c);
        ans9_d=(RadioButton)findViewById(R.id.qsn9_d);

        ans10_a=(RadioButton)findViewById(R.id.qsn10_a);
        ans10_b=(RadioButton)findViewById(R.id.qsn10_b);
        ans10_c=(RadioButton)findViewById(R.id.qsn10_c);
        ans10_d=(RadioButton)findViewById(R.id.qsn10_d);

        //getRefences to Checkboxes
        ans5_a=(CheckBox)findViewById(R.id.qsn5_a);
        ans5_b=(CheckBox)findViewById(R.id.qsn5_b);
        ans5_c=(CheckBox)findViewById(R.id.qsn5_c);
        ans5_d=(CheckBox)findViewById(R.id.qsn5_d);
        ans6_a=(CheckBox)findViewById(R.id.qsn6_a);
        ans6_b=(CheckBox)findViewById(R.id.qsn6_b);
        ans6_c=(CheckBox)findViewById(R.id.qsn6_c);
        ans6_d=(CheckBox)findViewById(R.id.qsn6_d);

        //getReferences to qsns
        qsn1=(TextView)findViewById(R.id.qsn1_id);
        qsn2=(TextView)findViewById(R.id.qsn2_id);
        qsn3=(TextView)findViewById(R.id.qsn3_id);
        qsn4=(TextView)findViewById(R.id.qsn4_id);
        qsn5=(TextView)findViewById(R.id.qsn5_id);
        qsn6=(TextView)findViewById(R.id.qsn6_id);
        qsn7=(TextView)findViewById(R.id.qsn7_id);
        qsn8=(TextView)findViewById(R.id.qsn8_id);
        qsn9=(TextView)findViewById(R.id.qsn9_id);
        qsn10=(TextView)findViewById(R.id.qsn10_id);

        //get References to Group..
        ans1_group =(RadioGroup)findViewById(R.id.qsn1_Radiogroup_id);
        ans2_group =(RadioGroup)findViewById(R.id.qsn2_Radiogroup_id);
        ans3_group =(RadioGroup)findViewById(R.id.qsn3_Radiogroup_id);
        ans4_group =(RadioGroup)findViewById(R.id.qsn4_Radiogroup_id);
        ans8_group =(RadioGroup)findViewById(R.id.qsn8_Radiogroup_id);
        ans9_group =(RadioGroup)findViewById(R.id.qsn9_Radiogroup_id);
        ans10_group =(RadioGroup)findViewById(R.id.qsn10_Radiogroup_id);

        // Initialization of Buttons
        buttonRetryl = (Button) findViewById(R.id.bleft);
        buttonShowAnswer = (Button) findViewById(R.id.bshowanswer);
        buttonRetryr = (Button) findViewById(R.id.bright);
    }

    public void setAllQsns(){
        SetQns1();
        SetQns2();
        SetQns3();
        SetQns4();
        SetQns5();
        SetQns6();
        SetQns7();
        SetQns8();
        SetQns9();
        SetQns10();
    }

    public void SetQns1(){
        qsn1.setText(myListOfQuestions.get(0).Question);

        //set up the Answers...
        ans1_a.setText(myListOfQuestions.get(0).suggestions.get(0));
        ans1_b.setText(myListOfQuestions.get(0).suggestions.get(1));
        ans1_c.setText(myListOfQuestions.get(0).suggestions.get(2));
        ans1_d.setText(myListOfQuestions.get(0).suggestions.get(3));

    }

    public void SetQns2(){
        qsn2.setText(myListOfQuestions.get(1).Question);

        //set Up the answers..
        ans2_a.setText(myListOfQuestions.get(1).suggestions.get(0));
        ans2_b.setText(myListOfQuestions.get(1).suggestions.get(1));
        ans2_c.setText(myListOfQuestions.get(1).suggestions.get(2));
        ans2_d.setText(myListOfQuestions.get(1).suggestions.get(3));
    }

    public void SetQns3(){
        qsn3.setText(myListOfQuestions.get(2).Question);

        //Set Up the answers
        ans3_a.setText(myListOfQuestions.get(2).suggestions.get(0));
        ans3_b.setText(myListOfQuestions.get(2).suggestions.get(1));
        ans3_c.setText(myListOfQuestions.get(2).suggestions.get(2));
        ans3_d.setText(myListOfQuestions.get(2).suggestions.get(3));
    }

    public void SetQns4(){
        qsn4.setText(myListOfQuestions.get(3).Question);

        //setUp the answers
        ans4_a.setText(myListOfQuestions.get(3).suggestions.get(0));
        ans4_b.setText(myListOfQuestions.get(3).suggestions.get(1));
        ans4_c.setText(myListOfQuestions.get(3).suggestions.get(2));
        ans4_d.setText(myListOfQuestions.get(3).suggestions.get(3));

    }

    public void SetQns5(){
        qsn5.setText(myListOfQuestions.get(4).Question);

        //setUp the answers
        ans5_a.setText(myListOfQuestions.get(4).suggestions.get(0));
        ans5_b.setText(myListOfQuestions.get(4).suggestions.get(1));
        ans5_c.setText(myListOfQuestions.get(4).suggestions.get(2));
        ans5_d.setText(myListOfQuestions.get(4).suggestions.get(3));
    }

    public void SetQns6(){
        qsn6.setText(myListOfQuestions.get(5).Question);

        //setUp the answers
        ans6_a.setText(myListOfQuestions.get(5).suggestions.get(0));
        ans6_b.setText(myListOfQuestions.get(5).suggestions.get(1));
        ans6_c.setText(myListOfQuestions.get(5).suggestions.get(2));
        ans6_d.setText(myListOfQuestions.get(5).suggestions.get(3));
    }

    public void SetQns7(){
        qsn7.setText(myListOfQuestions.get(6).Question);
    }

    public void SetQns8(){
        qsn8.setText(myListOfQuestions.get(7).Question);

        //Set up the answers
        ans8_a.setText(myListOfQuestions.get(7).suggestions.get(0));
        ans8_b.setText(myListOfQuestions.get(7).suggestions.get(1));
        ans8_c.setText(myListOfQuestions.get(7).suggestions.get(2));
        ans8_d.setText(myListOfQuestions.get(7).suggestions.get(3));
    }

    public void SetQns9(){
        qsn9.setText(myListOfQuestions.get(8).Question);

        //Set up the answers
        ans9_a.setText(myListOfQuestions.get(8).suggestions.get(0));
        ans9_b.setText(myListOfQuestions.get(8).suggestions.get(1));
        ans9_c.setText(myListOfQuestions.get(8).suggestions.get(2));
        ans9_d.setText(myListOfQuestions.get(8).suggestions.get(3));

    }

    public void SetQns10(){
        qsn10.setText(myListOfQuestions.get(9).Question);

        //Set up the answers
        ans10_a.setText(myListOfQuestions.get(9).suggestions.get(0));
        ans10_b.setText(myListOfQuestions.get(9).suggestions.get(1));
        ans10_c.setText(myListOfQuestions.get(9).suggestions.get(2));
        ans10_d.setText(myListOfQuestions.get(9).suggestions.get(3));
    }

    public String getAnswerForQsn1(){
        String user_res="";

        if(ans1_group.getCheckedRadioButtonId()!=-1){
            NumberOfAttempts++;
        }

        switch (ans1_group.getCheckedRadioButtonId()){
            case R.id.qsn1_a:
                user_res=ans1_a.getText().toString();
                break;
            case R.id.qsn1_b:
                user_res=ans1_b.getText().toString();
                break;
            case R.id.qsn1_c:
                user_res=ans1_c.getText().toString();
                break;
            case R.id.qsn1_d:
                user_res=ans1_d.getText().toString();
                break;
        }

        return user_res;
    }

    public String getAnswerForQsn2(){
        String user_res="";
        if(ans2_group.getCheckedRadioButtonId()!=-1){
            NumberOfAttempts++;
        }
        switch (ans2_group.getCheckedRadioButtonId()){
            case R.id.qsn2_a:
                user_res=ans2_a.getText().toString();
                break;
            case R.id.qsn2_b:
                user_res=ans2_b.getText().toString();
                break;
            case R.id.qsn2_c:
                user_res=ans2_c.getText().toString();
                break;
            case R.id.qsn2_d:
                user_res=ans2_d.getText().toString();
                break;
        }
        return user_res;
    }

    public String getAnswerForQsn3(){
        String user_res="";
        if(ans3_group.getCheckedRadioButtonId()!=-1){
            NumberOfAttempts++;
        }
        switch (ans3_group.getCheckedRadioButtonId()){
            case R.id.qsn3_a:
                user_res=ans3_a.getText().toString();
                break;
            case R.id.qsn3_b:
                user_res=ans3_b.getText().toString();
                break;
            case R.id.qsn3_c:
                user_res=ans3_c.getText().toString();
                break;
            case R.id.qsn3_d:
                user_res=ans3_d.getText().toString();
                break;
        }
        return user_res;
    }

    public String getAnswerForQsn4(){
        String user_res="";
        if(ans4_group.getCheckedRadioButtonId()!=-1){
            NumberOfAttempts++;
        }
        switch (ans4_group.getCheckedRadioButtonId()){
            case R.id.qsn4_a:
                user_res=ans4_a.getText().toString();
                break;
            case R.id.qsn4_b:
                user_res=ans4_b.getText().toString();
                break;
            case R.id.qsn4_c:
                user_res=ans4_c.getText().toString();
                break;
            case R.id.qsn4_d:
                user_res=ans4_d.getText().toString();
                break;
        }
        return user_res;
    }

    public String getAnswerForQsn8(){
        String user_res="";
        if(ans8_group.getCheckedRadioButtonId()!=-1){
            NumberOfAttempts++;
        }
        switch (ans8_group.getCheckedRadioButtonId()){
            case R.id.qsn8_a:
                user_res=ans8_a.getText().toString();
                break;
            case R.id.qsn8_b:
                user_res=ans8_b.getText().toString();
                break;
            case R.id.qsn8_c:
                user_res=ans8_c.getText().toString();
                break;
            case R.id.qsn8_d:
                user_res=ans8_d.getText().toString();
                break;
        }
        return user_res;
    }

    public String getAnswerForQsn9(){
        String user_res="";
        if(ans9_group.getCheckedRadioButtonId()!=-1){
            NumberOfAttempts++;
        }
        switch (ans9_group.getCheckedRadioButtonId()){
            case R.id.qsn9_a:
                user_res=ans9_a.getText().toString();
                break;
            case R.id.qsn9_b:
                user_res=ans9_b.getText().toString();
                break;
            case R.id.qsn9_c:
                user_res=ans9_c.getText().toString();
                break;
            case R.id.qsn9_d:
                user_res=ans9_d.getText().toString();
                break;
        }
        return user_res;
    }

    public String getAnswerForQsn10(){
        String user_res="";
        if(ans10_group.getCheckedRadioButtonId()!=-1){
            NumberOfAttempts++;
        }
        switch (ans10_group.getCheckedRadioButtonId()){
            case R.id.qsn10_a:
                user_res=ans10_a.getText().toString();
                break;
            case R.id.qsn10_b:
                user_res=ans10_b.getText().toString();
                break;
            case R.id.qsn10_c:
                user_res=ans10_c.getText().toString();
                break;
            case R.id.qsn10_d:
                user_res=ans10_d.getText().toString();
                break;
        }
        return user_res;
    }

    public String getAnswerForQsn7(){
        if(!myInputType.getText().toString().isEmpty()){
            NumberOfAttempts++;
        }
        String res=myInputType.getText().toString().trim();
        return res;
    }

    public boolean isAnswerCorrectRadioBox(String user_res,int index){
        if(user_res== myListOfQuestions.get(index).Answer){
            return true;
        }
        return false;
    }

    public boolean isQsn5Correct(){

        if(ans5_a.isChecked() && !ans5_b.isChecked() && ans5_c.isChecked() && !ans5_d.isChecked()){
            return true;
        }
        return false;
    }

    public boolean isQsn6Correct(){
        if(ans6_a.isChecked() && !ans6_b.isChecked() && ans6_c.isChecked() && ans6_d.isChecked()){
            return true;
        }

        return false;
    }

    public boolean isQsn7Correct(String res){
        String res_t=res.trim();
        String cor_t= myListOfQuestions.get(6).Answer.trim();

        if(res_t.matches(cor_t)){
            Log.d(TAG,"Question YEAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAaa");
            return true;
        }

        return false;
    }

    public String getUserRating(int mark){

        if(mark>(10*0.80)){
            return "expert";
        }else if(mark>(10*0.60)){
            return "intermediate";
        }else{
            return "amateur";
        }

    }

    public void showExplanations(){
        qsn1_ex.setText("Explanation"+"\n\n"+ myListOfQuestions.get(0).explanation);
        qsn2_ex.setText("Explanation"+"\n\n"+ myListOfQuestions.get(1).explanation);
        qsn3_ex.setText("Explanation"+"\n\n"+ myListOfQuestions.get(2).explanation);
        qsn4_ex.setText("Explanation"+"\n\n"+ myListOfQuestions.get(3).explanation);
        qsn5_ex.setText("Explanation"+"\n\n"+ myListOfQuestions.get(4).explanation);
        qsn7_ex.setText("Explanation"+"\n\n"+ myListOfQuestions.get(6).explanation);
        qsn8_ex.setText("Explanation"+"\n\n"+ myListOfQuestions.get(7).explanation);
        qsn9_ex.setText("Explanation"+"\n\n"+ myListOfQuestions.get(8).explanation);
        qsn10_ex.setText("Explanation"+"\n\n"+ myListOfQuestions.get(9).explanation);
    }

    public void TickAllCorrectAnswers(){
        ans1_a.setTextColor(getResources().getColor(R.color.correct_color));
        ans2_d.setTextColor(getResources().getColor(R.color.correct_color));
        ans3_a.setTextColor(getResources().getColor(R.color.correct_color));
        ans4_d.setTextColor(getResources().getColor(R.color.correct_color));

        ans5_a.setTextColor(getResources().getColor(R.color.correct_color));
        ans5_c.setTextColor(getResources().getColor(R.color.correct_color));

        ans6_a.setTextColor(getResources().getColor(R.color.correct_color));
        ans6_c.setTextColor(getResources().getColor(R.color.correct_color));
        ans6_d.setTextColor(getResources().getColor(R.color.correct_color));

        myInputType.setText("2016");
        myInputType.setTextColor(getResources().getColor(R.color.correct_color));

        ans8_c.setTextColor(getResources().getColor(R.color.correct_color));
        ans9_c.setTextColor(getResources().getColor(R.color.correct_color));
        ans10_d.setTextColor(getResources().getColor(R.color.correct_color));
    }

    public void checkAllAnswers(){
        //chekc for qsn1
        if(isAnswerCorrectRadioBox(getAnswerForQsn1(),0)){
            mTotalMark +=1;
        }else{

        }

        if(isAnswerCorrectRadioBox(getAnswerForQsn2(),1)){
            mTotalMark +=1;
        }else{

        }

        if(isAnswerCorrectRadioBox(getAnswerForQsn3(),2)){
            mTotalMark +=1;
        }else{

        }

        if(isAnswerCorrectRadioBox(getAnswerForQsn4(),3)){
            mTotalMark +=1;
        }else{

        }

        if(isAnswerCorrectRadioBox(getAnswerForQsn8(),7)){
            mTotalMark +=1;
        }else{

        }

        if(isAnswerCorrectRadioBox(getAnswerForQsn9(),8)){
            mTotalMark +=1;
        }else{

        }

        if(isAnswerCorrectRadioBox(getAnswerForQsn10(),9)){
            mTotalMark +=1;
        }else{

        }


        if(isQsn5Correct()){
            mTotalMark +=1;
        }else{

        }

        if(isQsn6Correct()){
            mTotalMark +=1;
        }else{

        }

        if(isQsn7Correct(getAnswerForQsn7())){
            mTotalMark +=1;
        }else{
        }

        mMark.setText(""+ mTotalMark +"/"+"10");
        mRating.setText("level : "+getUserRating(mTotalMark));
        showExplanations();
        TickAllCorrectAnswers();

        Toast.makeText(getApplicationContext(),"Correct : "+ mTotalMark +"/"+"10",Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){

            case R.id.bleft:
                if(isUserDone){
                    Intent intent = getIntent();
                    finish();
                    startActivity(intent);
                }
                break;

            case R.id.bshowanswer:

                if(!isUserDone){
                    isUserDone=true;
                    checkAllAnswers();
                    buttonRetryr.setBackgroundResource(R.drawable.ic_refresh_black_24dp);
                    buttonRetryl.setBackgroundResource(R.drawable.ic_refresh_black_24dp);
                }else{
                    Toast.makeText(getApplicationContext(),"press retry to start again",Toast.LENGTH_SHORT).show();
                }

                break;

            case R.id.bright:
                if(isUserDone){
                    Intent intent = getIntent();
                    finish();
                    startActivity(intent);
                }
                break;
        }

    }

}//end of Simple_question

