package com.example.daggerpractice.di;

import com.example.daggerpractice.di.auth.AuthModule;
import com.example.daggerpractice.di.auth.AuthViewModelModule;
import com.example.daggerpractice.ui.auth.AuthActivity;
import com.example.daggerpractice.ui.main.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilderModule  {

    @ContributesAndroidInjector(
            modules = {AuthViewModelModule.class,
                    AuthModule.class
            }
    )
    abstract AuthActivity contributeActivity();

    @ContributesAndroidInjector
    abstract MainActivity mainActivity();
}
