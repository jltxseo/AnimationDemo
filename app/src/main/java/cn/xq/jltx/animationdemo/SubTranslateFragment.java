package cn.xq.jltx.animationdemo;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @author jltxseo
 *         Created by junlintianxia on 2016年03月25日.
 */

public class SubTranslateFragment extends Fragment{
    private static final String ARG_PARAM1 = "param1";
    private int bgColor;
    public SubTranslateFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        CustomAnimFrameLayout customAnimFrameLayout = new CustomAnimFrameLayout(getActivity());
        return inflater.inflate(R.layout.sub_translate,customAnimFrameLayout,true);
    }
}
