package com.example.android.miwok;

/**
 * Created by Jordan on 5/19/2017.
 */

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public Word(String mDefaultTranslation, String mMiwokTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
    }


}
