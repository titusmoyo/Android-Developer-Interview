package com.zhoubrian.androiddeveloperinterview.models;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;
import java.util.UUID;

public class userResponse implements Parcelable {

    public UUID qsn_id;
    public String Question;
    public String Answer;
    public String User_Target;
    public boolean Correct;

    public Boolean getCheated() {
        return cheated;
    }

    public void setCheated(Boolean cheated) {
        this.cheated = cheated;
    }

    public boolean cheated;
    public List<String> suggestions;

    public userResponse(){}

    public userResponse(UUID qsn_id, String question, String answer, List<String> suggestions) {
        this.qsn_id = qsn_id;
        Question = question;
        Answer = answer;
        this.suggestions = suggestions;
        this.cheated=false;
        this.Correct=false;
    }

    public UUID getQsn_id() {
        return qsn_id;
    }

    public void setQsn_id(UUID qsn_id) {
        this.qsn_id = qsn_id;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String answer) {
        Answer = answer;
    }

    public String getUser_Target() {
        return User_Target;
    }

    public void setUser_Target(String user_Target) {
        User_Target = user_Target;
    }

    public Boolean getCorrect() {
        return Correct;
    }

    public void setCorrect(Boolean correct) {
        Correct = correct;
    }

    public List<String> getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(List<String> suggestions) {
        this.suggestions = suggestions;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(qsn_id);
        parcel.writeString(Question);
        parcel.writeString(Answer);
        parcel.writeString(User_Target);
        parcel.writeValue(Correct);
    }

    public static final Parcelable.Creator<userResponse> CREATOR
            = new Parcelable.Creator<userResponse>() {
        @Override
        public userResponse createFromParcel(Parcel source) {
            return new userResponse(source);
        }

        @Override
        public userResponse[] newArray(int size) {
            return new userResponse[size];
        }
    };

    private userResponse(Parcel source) {
        qsn_id=(UUID)source.readSerializable();
        Question=source.readString();
        Answer=source.readString();
        User_Target=source.readString();
        Correct=(Boolean) source.readValue(null);
    }

}//end of userResponse
