package com.example.sistemimunniluh;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sistemimunniluh.pilgan.Question;
import com.example.sistemimunniluh.pilgan.QuestionAdapter;
import com.example.sistemimunniluh.pilgan.QuizDBHelper;

import java.util.ArrayList;
import java.util.Objects;


public class hal_6_soalLatihan extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private QuestionAdapter mAdapter;
    private ArrayList<Question> mQuestionList;
    private QuizDBHelper mDbHelper;

    private ConstraintLayout mParentLayout;
    private TextView mScoreTextView;
    private TextView mRemaningQuestionsTextView;
    private int mTotalQuestions;
    private int mScore;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal_6_soal_latihan);


        mScoreTextView = findViewById(R.id.score);
        mRemaningQuestionsTextView = findViewById(R.id.remaining_questions);

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setNestedScrollingEnabled(false);
        mRecyclerView.setHasFixedSize(true);

        mDbHelper = new QuizDBHelper(this);

            mQuestionList = mDbHelper.getAllQuestions("1");
            mTotalQuestions = mQuestionList.size();
            mScore = 0;
            displayScore();

        mAdapter = new QuestionAdapter(this, mQuestionList, "AGAMA");
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(mAdapter);
    }
    public void displayScore() {
        String scoreString = "Score " + mScore + "/" + mTotalQuestions;
        mScoreTextView.setText(scoreString);
        mRemaningQuestionsTextView.setText("Remaining: " + mTotalQuestions--);
    }

    public void updateScore() {
        mScore++;
    }
}