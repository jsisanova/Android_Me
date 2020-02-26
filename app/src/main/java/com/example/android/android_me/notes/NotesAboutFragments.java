package com.example.android.android_me.notes;

public class NotesAboutFragments {

    /**
     * There is no difference in the way the Fragments are created, it is only the way that they are used that differs.
     * That is, a Fragment consists of two parts - its code and its UI. The UI can be created by the Fragment either in code
     * or by inflating an XML Layout file - it makes little difference to the way the Fragment behaves.
     *
     *
     * STATIC fragments are defined in the xml file using a fragment tag within another XML layout and are not generally added or removed at runtime.
     * They are referenced by their id in your code. They are generally put as a child element of a layout like below.
     * Once they are defined here, android will know to make a fragment, that's all you have to do.
     *
     * <LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
     *     xmlns:tools="http://schemas.android.com/tools"
     *     android:layout_width="match_parent"
     *     android:layout_height="match_parent"
     *     android:orientation="vertical"
     *     android:weightSum="1">
     *     <fragment
     *         android:id="@+id/fooFragment"
     *         android:name="com.example.myapplication.TestFragment"
     *         android:layout_width="match_parent"
     *         android:layout_height="wrap_content" />
     *
     * eg activity_main.xml, layout defined in fragment_master_list.xml (GridView+Button)
     * MasterListFragment.java
     *
     *
     *
     *
     *
     * DYNAMIC fragment isn't associated with a fragment tag and it is created in association with the FragmentManager.
     * They are defined in your code and can be manipulated, added, removed, etc during runtime. They look like this:
     *
     *     FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
     *     ft.add(R.id.your_placeholder, new TestFragment());
     *     ft.commit();
     *
     * eg. 1 ImageView in fragment_body_part.xml, 3 containers (FrameLayout) in activity_android_me.xml for each body part
     *  = These containers hold the head / body / leg BodyPartFragment of the custom Android-Me image
     *BodyPartFragment.java
     *
     *
     *
     */


}
