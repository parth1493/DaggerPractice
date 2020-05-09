package com.example.daggerpractice.di.main;

import com.example.daggerpractice.di.auth.AuthScope;
import com.example.daggerpractice.ui.main.post.PostsFragment;
import com.example.daggerpractice.ui.main.profile.ProfileFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MainFragmentBuildersModule {

    @AuthScope
    @ContributesAndroidInjector
    abstract ProfileFragment contributeProfileFragment();

    @MainScope
    @ContributesAndroidInjector
    abstract PostsFragment constributePostsFragment();
}