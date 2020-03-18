package com.toumal.dragerpractice.di;

import com.toumal.dragerpractice.AuthActivity;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilderModule {
    @ContributesAndroidInjector
    abstract AuthActivity contributeAuthActivity();

    @Provides
    static String someString(){
        return  "this is madness";
    }
}
