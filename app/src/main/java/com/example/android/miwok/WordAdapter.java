package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Jordan on 5/20/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    /**
     * Constructor
     *
     * @param context  The current context.
     * @param resource The resource ID for a layout file containing a TextView to use when
     *                 instantiating views.
     * @param objects  The objects to represent in the ListView.
     */
    public WordAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Word> objects) {
        super(context, resource, objects);
    }

    /**
     * {@inheritDoc}
     *
     * @param position
     * @param convertView
     * @param parent
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Word currentWord = getItem(position);
        TextView miwokText = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokText.setText(currentWord.getMiwokTranslation());
        TextView defaultText = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultText.setText(currentWord.getDefaultTranslation());
        return listItemView;
    }
}
