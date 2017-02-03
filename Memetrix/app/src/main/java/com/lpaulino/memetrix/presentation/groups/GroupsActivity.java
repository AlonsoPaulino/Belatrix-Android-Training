package com.lpaulino.memetrix.presentation.groups;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;

import com.lpaulino.memetrix.R;
import com.lpaulino.memetrix.presentation.navigation.NavigationActivity;
import com.lpaulino.memetrix.presentation.navigation.NavigationItem;

import butterknife.BindView;

/**
 * @author Luis Alonso Paulino Flores on 3/02/17.
 */

public class GroupsActivity extends NavigationActivity {

    @BindView(R.id.add_group_button) FloatingActionButton mAddGroupFloatingActionButton;

    @Override
    protected NavigationItem getCurrentNavigationItem() {
        return NavigationItem.MY_GROUPS;
    }

    @Override
    protected int getNavigationLayout() {
        return R.layout.activity_groups;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        GroupsFragment memesFragment = (GroupsFragment) findFragmentById(R.id.main_content);

        if (memesFragment == null) {
            memesFragment = GroupsFragment.newInstance();
        }

        replaceFragment(R.id.main_content, memesFragment);

        mAddGroupFloatingActionButton.setOnClickListener(v -> {
            //TODO: Add meme
        });
    }
}
