package cn.xq.jltx.animationdemo;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

/**
 * @author jltxseo
 *         Created by junlintianxia on 2016年03月24日.
 */

public class TranslateFragment extends Fragment {

    private Button xmlSelf;
    private Button xmlParent;
    private Button xmlSelfFillTrue;
    private Button xmlParentFillFalse;

    private ImageView imgTransform;
    public TranslateFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,  Bundle savedInstanceState) {
        CustomAnimFrameLayout customAnimFrameLayout = new CustomAnimFrameLayout(getActivity());
        return inflater.inflate(R.layout.translate,customAnimFrameLayout,true);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        initView(view);
        super.onViewCreated(view, savedInstanceState);
    }

    public void initView(View view){
        xmlSelf = (Button)view.findViewById(R.id.translateX_xml_self);
        xmlParent = (Button)view.findViewById(R.id.translateX_xml_parent);
        xmlSelfFillTrue = (Button)view.findViewById(R.id.translateX_xml_self_fill_true);
        xmlParentFillFalse = (Button)view.findViewById(R.id.translateX_xml_parent_fill_false);
        imgTransform = (ImageView)view.findViewById(R.id.img_transform);

        xmlSelf.setOnClickListener(mOnClickListener);
        xmlParent.setOnClickListener(mOnClickListener);
        xmlSelfFillTrue.setOnClickListener(mOnClickListener);
        xmlParentFillFalse.setOnClickListener(mOnClickListener);
    }


    private View.OnClickListener mOnClickListener = new View.OnClickListener(){
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.translateX_xml_self:
                    Animation animation = AnimationUtils.loadAnimation(getActivity(),R.anim.translate_x_self);
                    imgTransform.startAnimation(animation);
                    break;
                case R.id.translateX_xml_parent:
                    break;
                case R.id.translateX_xml_self_fill_true:
                    break;
                case R.id.translateX_xml_parent_fill_false:
                    break;
                default:
                    break;
            }
        }
    };
}
