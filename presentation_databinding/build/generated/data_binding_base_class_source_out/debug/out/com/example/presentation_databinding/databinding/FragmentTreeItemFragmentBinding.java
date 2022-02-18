// Generated by data binding compiler. Do not edit!
package com.example.presentation_databinding.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.presentation_databinding.R;
import com.example.presentation_databinding.presentation.treeList.TreesListViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentTreeItemFragmentBinding extends ViewDataBinding {
  @NonNull
  public final TextView treeItemId;

  @Bindable
  protected TreesListViewModel mTreeItem;

  protected FragmentTreeItemFragmentBinding(Object _bindingComponent, View _root,
      int _localFieldCount, TextView treeItemId) {
    super(_bindingComponent, _root, _localFieldCount);
    this.treeItemId = treeItemId;
  }

  public abstract void setTreeItem(@Nullable TreesListViewModel treeItem);

  @Nullable
  public TreesListViewModel getTreeItem() {
    return mTreeItem;
  }

  @NonNull
  public static FragmentTreeItemFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_tree_item_fragment, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentTreeItemFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentTreeItemFragmentBinding>inflateInternal(inflater, R.layout.fragment_tree_item_fragment, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentTreeItemFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_tree_item_fragment, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentTreeItemFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentTreeItemFragmentBinding>inflateInternal(inflater, R.layout.fragment_tree_item_fragment, null, false, component);
  }

  public static FragmentTreeItemFragmentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentTreeItemFragmentBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentTreeItemFragmentBinding)bind(component, view, R.layout.fragment_tree_item_fragment);
  }
}
