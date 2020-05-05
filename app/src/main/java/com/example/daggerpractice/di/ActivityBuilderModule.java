package com.example.daggerpractice.di;

import com.example.daggerpractice.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilderModule  {

    @ContributesAndroidInjector
    abstract AuthActivity contributeActivity();
}
