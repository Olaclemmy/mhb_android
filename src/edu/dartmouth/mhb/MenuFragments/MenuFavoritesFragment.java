package edu.dartmouth.mhb.MenuFragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import edu.dartmouth.mhb.R;
import edu.dartmouth.mhb.R.id;
import edu.dartmouth.mhb.R.layout;

public class MenuFavoritesFragment extends Fragment {
 
    public static Fragment newInstance(Context context) {
    	MenuFavoritesFragment f = new MenuFavoritesFragment();
 
        return f;
    }
 
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_menu_favorites, null);
    	//Set test string
    	String str_val = "Favorites";
    	((TextView) root.findViewById(R.id.textGotoTitle)).setText(str_val);
        return root;
    }
 
}