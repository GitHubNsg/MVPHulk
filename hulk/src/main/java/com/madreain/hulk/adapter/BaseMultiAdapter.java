package com.madreain.hulk.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.chad.library.adapter.base.loadmore.LoadMoreView;
import com.madreain.hulk.mvp.IView;
import com.madreain.hulk.view.baseviewholder.HulkViewHolder;

import java.util.List;

import javax.inject.Inject;


/**
 * @author madreain
 * @date 2019-07-05.
 * module：
 * description：
 */
public abstract class BaseMultiAdapter<T extends MultiItemEntity, V extends IView> extends BaseMultiItemQuickAdapter<T, HulkViewHolder> {

    public abstract void addItemType();

    public BaseMultiAdapter(List<T> data) {
        super(data);
        addItemType();
    }

    @Override
    public void setLoadMoreView(LoadMoreView loadMoreView) {
        super.setLoadMoreView(loadMoreView);
    }

    public void setNewData(List<T> data) {
        super.setNewData(data);
    }

    @Override
    public void addData(@NonNull T data) {
        super.addData(data);
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Inject
    public V view;

}
