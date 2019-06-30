package com.pupha.showcase;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;


/**
 * A simple {@link Fragment} subclass.
 */
public class SoupFragment extends Fragment {


    public SoupFragment() {
        // Required empty public constructor
    }
    TextView answer;
    EditText input;
    EditText input2;
    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        answer = view.findViewById(R.id.text_answer_facto);
        input = view.findViewById(R.id.edit_facto);
        input2 = view.findViewById(R.id.edit_texts);
        button = view.findViewById(R.id.button_facto);
        button.setText("Do Alphabet Soup");

        input.setVisibility(View.GONE);
        input2.setVisibility(View.VISIBLE);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer.setText( AlphabetSoup(input2.getText().toString()));
            }
        });

        return view;
    }

    private String AlphabetSoup(String str)
    {

        char[] sorted = str.toCharArray();
        Arrays.sort(sorted);

        String soup = new String(sorted);

        return soup;
    }


}
