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
public class PalindromeFragment extends Fragment {


    public PalindromeFragment() {
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
        button.setText("Do Palindrome Check");

        input.setVisibility(View.GONE);
        input2.setVisibility(View.VISIBLE);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( PalindromeCheck(input2.getText().toString()))
                answer.setText("Is a Palindrome");
                else answer.setText("Is not a Palindrome");
            }
        });

        return view;
    }

    private boolean PalindromeCheck(String str)
    {
        if(str.equals(FirstReverse(str)))
            return true;
        else
        return false;
    }


    private String FirstReverse(String str)
    {
//        String rts = new StringBuilder(str).reverse().toString();

        StringBuilder rts = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--)
        {
            rts.append(str.charAt(i));
        }

        return rts.toString();
    }


}
