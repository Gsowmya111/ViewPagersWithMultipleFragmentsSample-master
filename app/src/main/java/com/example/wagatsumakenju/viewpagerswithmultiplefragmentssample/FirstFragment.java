package com.example.wagatsumakenju.viewpagerswithmultiplefragmentssample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Fragment class.
 *
 * Created by wagatsumakenju on 2015/08/25.
 */
public class FirstFragment extends Fragment {

    /**
     * fields
     */

    Button b1;
    private static FirstFragment instance = null;

    /**
     * Create fragment view when paginated.
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.first_frag, container, false);

        final TextView textView = (TextView) v.findViewById(R.id.tvFragFirst);
         b1=(Button) v.findViewById(R.id.butonfr1);
        textView.setText(getArguments().getString("msg"));

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

textView.setText("hiiii");

            }
        });

        return v;
    }




    /**
     * Returns new instance.
     *
     * @param text
     * @return
     */
    public static FirstFragment newInstance(String text){

        if(instance == null){
            // new instance
            instance = new FirstFragment();

            // sets data to bundle
            Bundle bundle = new Bundle();
            bundle.putString("msg", text);

            // set data to fragment
            instance.setArguments(bundle);

            return instance;
        } else {

            return instance;
        }

    }


}
