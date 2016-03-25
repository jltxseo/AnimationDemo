package cn.xq.jltx.animationdemo;


import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * @author jltxseo
 *         Created by junlintianxia on 2016年03月24日.
 */

public class TranslateFragment extends Fragment {
    private Button btn;
    public TranslateFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        CustomAnimFrameLayout customAnimFrameLayout = new CustomAnimFrameLayout(getActivity());
        return inflater.inflate(R.layout.translate,customAnimFrameLayout,true);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        btn = (Button)view.findViewById(R.id.sub_Btn);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                SubTranslateFragment subTranslateFragment = new SubTranslateFragment();
                fragmentTransaction.add(R.id.translate_contain,subTranslateFragment);
                fragmentTransaction.addToBackStack(SubTranslateFragment.class.getSimpleName());
                fragmentTransaction.commit();
            }
        });
        super.onViewCreated(view, savedInstanceState);
    }
}
