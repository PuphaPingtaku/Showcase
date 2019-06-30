package com.pupha.showcase;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FactorialFragment extends Fragment {


    public FactorialFragment() {
        // Required empty public constructor
    }

    TextView answer;
    EditText input;
    Button button;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        answer = view.findViewById(R.id.text_answer_facto);
        input = view.findViewById(R.id.edit_facto);
        button = view.findViewById(R.id.button_facto);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer.setText( FirstFactorial( Integer.parseInt(input.getText().toString()) ) + "" );
            }
        });

        return view;
    }

    private long FirstFactorial(long input)
    {
        if(input>1)
            return input * FirstFactorial(input-1);
        else return 1;
    }

}
