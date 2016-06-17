package bala31.quiz;

/**
 * Created by Bala on 6/15/2016.
 */
public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    public Question(){}
    public  Question(int id,boolean is)
    {
        mTextResId = id;
        mAnswerTrue = is;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
